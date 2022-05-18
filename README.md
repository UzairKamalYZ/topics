#     Topics 
[[_TOC_]]
## Introduction:
This repo will be serving the base having multiple modules where concepts will be practise. 


### Topic no.1
#### Required Interface #####
Required Interfaces concept forwarded by 'Martin Fowler'. Explanation can be followed @ https://martinfowler.com/bliki/RequiredInterface.html

![img.png](img.png)

###### Example : ###### 
client : `required-interface-client-layer` <br>
service : `required-interface-service-layer`

client need to use `PrintService` from service layer, client is already dependency of Service layer, so normally if we
want to access PrintService class we need to add service as dependency and as result it would introduce cyclic dependency
and will not be able to compile. 

In order to make it working, we define client base interface and we implement them in service and use what we want from service. 

`RequiredInterface` in client module and its implementation in service layer tells the whole story that how to enable client 
to use services from parent layer. 

### Topic no.2
#### Mapstruct #####
MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.

The generated mapping code uses plain method invocations and thus is fast, type-safe and easy to understand.

###### Example : ###### 
`Credential(username, password)` -----mapping to ---->>> `CredentialDto` using interface `CredentialMapper`
for more examples explore  https://github.com/mapstruct/mapstruct-examples
