# Topic
[[_TOC_]]
## Introduction:
This repo will be serving the base having multiple modules where concepts will be practise. 


### Topic no.1
Required Interfaces concept forwarded by 'Martin Fowler'. Explanation can be followed @ https://martinfowler.com/bliki/RequiredInterface.html

Diagram:
```plantuml
component [required-interfaces-client-layer] as client
component [required-interfaces-service-layer] as service
service ..> client: service has client as dependency
```

