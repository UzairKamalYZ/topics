#### Custom Annotation #####
Module `customannotation` will contain code to create custom annotation and then process with two approaches
##### Simple Processor #####
Normal Annotation processor
##### AOP Processor ##### 
Aspect Oriented Annotation
Having @Identifier annotation on method, based on age it will be executed and when the age is below the limit
it will throw exception and will not provide required data for that person. 

For default values in the CustomAnnotationTester or PersonController under 'history'
The history message will appear only for having age 20 while not for age 5 as the 5 is considered underage. 