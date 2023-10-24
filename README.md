# Deodar: A General Permission Specification Schema

Deodar provides parser and evaluator for a permission-specification schema based on JSON.  
Permissions define who can do what in what conditions.

```
Allow principal x@acme.com to delete any clusters in environment `e-abc` made from IPs within CIDR 73.231.187.0/24.
```

```json
{ 
  "Version": "v1",
  "Description": "This is a permission example",
  "Statement": [
  {
    "Subject": "x@acme.com",
    "Action": "SampleApp:DeleteCluster",
    "Resource": "env/e-abc/cluster/*",
    "Condition": "inIpRange(context.sourceIp, '73.231.187.0/24')"
  }]
}
```

A sample request made by x@acme.com to delete cluster env/e-abc/cluster/x-123 in app SampleApp:

```json
{
  "principal": {
    "id": "x@acme.com",
    "organization": "124"
  },
  "action": {
    "id": "SampleApp:DeleteCluster"
  },
  "context": {
    "sourceIp": "73.231.187.100"
  },
  "resource": {
    "id": "env/e-abc/cluster/x-123"
  }
}
```

The above request is allowed as all principal, action, resource and condition blocks match.


---

* [Quick Start](#quick-start)

---

## Quick Start
