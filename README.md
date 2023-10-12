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
Add the following to your build dependencies:

**Maven (pom.xml)**:

```xml
<dependency>
  <groupId>dev.cel</groupId>
  <artifactId>cel</artifactId>
  <version>0.2.0</version>
</dependency>
```

**Gradle**

```gradle
implementation 'dev.cel:cel:0.2.0'
```

Then run this example:

```java
import dev.cel.common.CelAbstractSyntaxTree;
import dev.cel.common.CelValidationException;
import dev.cel.common.types.SimpleType;
import dev.cel.compiler.CelCompiler;
import dev.cel.compiler.CelCompilerFactory;
import dev.cel.runtime.CelEvaluationException;
import dev.cel.runtime.CelRuntime;
import dev.cel.runtime.CelRuntimeFactory;
import java.util.Map;

public class HelloWorld {
  // Construct the compilation and runtime environments.
  // These instances are immutable and thus trivially thread-safe and amenable to caching.
  private static final CelCompiler CEL_COMPILER =
      CelCompilerFactory.standardCelCompilerBuilder().addVar("my_var", SimpleType.STRING).build();
  private static final CelRuntime CEL_RUNTIME =
      CelRuntimeFactory.standardCelRuntimeBuilder().build();

  public void run() throws CelValidationException, CelEvaluationException {
    // Compile the expression into an Abstract Syntax Tree.
    CelAbstractSyntaxTree ast = CEL_COMPILER.compile("my_var + '!'").getAst();

    // Plan an executable program instance.
    CelRuntime.Program program = CEL_RUNTIME.createProgram(ast);

    // Evaluate the program with an input variable.
    String result = (String) program.eval(Map.of("my_var", "Hello World"));
    System.out.println(result); // 'Hello World!'
  }
}
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


