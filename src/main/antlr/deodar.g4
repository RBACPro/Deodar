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
 : '{"Statement":['stmts']}' {System.out.println($stmts.statements.size());}
 ;

stmts returns [List<Statement> statements]
@init{$statements = new ArrayList<Statement>();}
 : stmt {Statement s = new Statement($stmt.p, $stmt.r, $stmt.a); $statements.add(s);}
 more_stmts {$statements.addAll($more_stmts.statements);}
 ;

more_stmts returns [List<Statement> statements]
@init{$statements = new ArrayList<Statement>();}
: | ',' stmt {Statement s = new Statement($stmt.p, $stmt.r, $stmt.a); $statements.add(s);}
more_stmts {$statements.addAll($more_stmts.statements);}
;

 stmt returns [Principal p, Action a, Resource r]
 @init{
    $p = new Principal();
    $r = new Resource();
    $a = new Action();
 }
 : '{' principal ',' action ',' resource '}'
 {
    System.out.println("In parsing principal and its name is "+ $principal.name);
    $p.setName($principal.name);
    $r.setName($resource.name);
    $a.setName($action.name);
 }
 ;


principal returns [String name]
:'"principal":"'ID'"' {$name = $ID.text;}
;
action returns [String name]
:'"action":"'ID'"' {$name = $ID.text;}
;
resource returns [String name]
: '"resource":"'ID'"' {$name = $ID.text;}
;

ID    : ('a'..'z' | 'A'..'Z')+;
SPACE : ' ' {skip();};