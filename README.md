# Deodar： Enterprise Ready-Authorization Language

Deodar is an Enterprise-ready permission specification language based on JSON/Yaml.
It allows definition of policies of who can do what under what conditions.


```
Allow Role ProjectManager to delete any project from specific IPs.
```
```json
[{
  "Subject": "Role:ProjectManager",
  "Action": "DeleteProject",
  "Resource": "Project/*",
  "Condition": "inIpRange(context.ip, '1.2.3.0/24')"
}]
```

A policy is the minimal permission module and ideal for modelling enterprise RBAC models.

---

* [Design Goal](#design-goal)
* [Overview](#overview)
    * [Environment Setup](#environment-setup)
    * [Checking](#checking)
    * [Evaluation](#evaluation)
    * [Errors](#errors)

---

## Quick Start

### Install

Deodar is available in Maven Central Repository.

**Maven (pom.xml)**:

```xml
```

**Gradle**

```gradle
```

Then run this example:

```java
Pending
```

## Design Goal

One of the most important design goals of this language is to earn developers love.

1. Use developer-friendly techniques
2. 

## Overview

### Environment Setup

### Checking

### Evaluation

### Errors

## Grammar


### Policy grammar notes
* A single policy can contain an array of statements.
* Policies have a maximum size between 2048 characters and 10,240 characters, 
depending on what entity the policy is attached to. For more information, 
see IAM and AWS STS quotas. Policy size calculations do not include white space characters.
* The condition_block element is required in resource-based policies (for example, in Amazon S3 bucket policies) and in trust policies for IAM roles. It must not be included in identity-based policies.


