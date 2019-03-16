rd /s /q java
rd /s /q resources
mkdir java
mkdir resources

java -jar mybatis-generator-core-1.3.6.jar -configfile generatorConfig-push.xml -overwrite