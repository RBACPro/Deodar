grammar deodar;

@header {
    package com.rbacpro.deodar.parser.generated;
    import java.util.HashMap;
    import com.rbacpro.deodar.model.Statement;
    import com.rbacpro.deodar.model.Principal;
    import com.rbacpro.deodar.model.Action;
    import com.rbacpro.deodar.model.Resource;
}

policy
 : '{"Version":"'VERSION'","Statement":['stmts']}' {System.out.println($stmts.statements.size());}
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
    System.out.println("In parsing principal and its name is "+ $principal.name  + " and length is " + $principal.name.length());
    $p.setName($principal.name);
    $r.setName($resource.name);
    $a.setName($action.name);
 }
 ;


principal returns [String name]
:'"principal":"'principal_id'"' {$name = $principal_id.name;}
;
action returns [String name]
:'"action":"'ID'"' {$name = $ID.text;}
;
resource returns [String name]
: '"resource":"'ID'"' {$name = $ID.text;}
;


 principal_id returns [String name]
 : WILDCARD {$name='*';}
 | ID {$name= $ID.text;}
 ;

 VERSION
 : 'v1'
 ;


WILDCARD
: '*'
;


ID    : ('a'..'z' | 'A'..'Z')+;



SPACE : ' ' {skip();};