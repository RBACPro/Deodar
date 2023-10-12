grammar deodar;


@header {
package com.rbacpro.deodar.model;
}


policy：'{' version_block ',' id_block ',' statements_block '}';

version_block: 'Version:' ('v1');

id_block:  'Id:' policy_id_string;

statement_block:  'Statement :' [statement]+;

statement: '{'
    sid_block ','
    principal_block ','
    effect_block ','
    action_block ','
    resource_block ','
'}';

sid_block : 'Sid' ':' sid_string;

effect_block: 'Effect' ':' ('Allow' | 'Deny');

principal_block: 'Principal' ':' ('*' | principal_map);

principal_map: [principal_map_entry]+;

principal_map_entry: ('User' | 'Service' ) ':' [principal_id_string]+;

action_block:  'Action' ':' ('*' | [action_string]+);

resource_block: 'Resource' ':' ('*' | [resource_string]+);

principal_id_string: ;

action_string: ;

resource_strinh: ;





