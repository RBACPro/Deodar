grammar deodar;

@header {
    package com.rbacpro.deodar.parser;
    import java.util.HashMap;
    import com.rbacpro.deodar.model.Statement;
}

policy
 : stmts {System.out.println($stmts.statements.size() + "\n" +
        $stmts.allIds + " first statement" + $stmts.firstStatement.getPrincipal());}
 ;

stmts returns [String firstId, List<String> allIds, List<Statement> statements, Statement firstStatement]
@init{$allIds = new ArrayList<String>(); $statements = new ArrayList<Statement>();}
@after{$firstId = $allIds.get(0); $firstStatement = $statements.get(0);}
 : (ID {$allIds.add($ID.text); Statement s = new Statement($ID.text); $statements.add(s);})+
 ;

ID    : ('a'..'z' | 'A'..'Z')+;
SPACE : ' ' {skip();};