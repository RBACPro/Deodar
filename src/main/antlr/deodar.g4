grammar deodar;

@header {
    package com.rbacpro.deodar.parser;
    import java.util.HashMap;
    import com.rbacpro.deodar.model.Statement;
    import com.rbacpro.deodar.model.Principal;
    import com.rbacpro.deodar.model.Action;
    import com.rbacpro.deodar.model.Resource;
}

policy
 : stmts {System.out.println($stmts.statements.size() + "\n" +" first statement" + $stmts.firstStatement);}
 ;

stmts returns [List<Statement> statements, Statement firstStatement]
@init{$statements = new ArrayList<Statement>();}
@after{$firstStatement = $statements.get(0);}
 : (stmt {Statement s = new Statement($stmt.p, $stmt.r, $stmt.a); $statements.add(s);})+
 ;

 stmt returns [Principal p, Action a, Resource r]
 @init{
 $p = new Principal();
 $r = new Resource();
 $a = new Action();
 }
 : '{"principal":'principal',''"action":'action',''"resource":'resource'}' {
 System.out.println("In parsing principal and its name is "+ $principal.name);
 $p.setName($principal.name);
 $r.setName($resource.name);
 $a.setName($action.name);
 }
 ;


principal returns [String name]
:'"'ID'"' {$name = $ID.text;}
;
action returns [String name]
:'"'ID'"' {$name = $ID.text;}
;
resource returns [String name]
: '"'ID'"' {$name = $ID.text;}
;

ID    : ('a'..'z' | 'A'..'Z')+;
SPACE : ' ' {skip();};