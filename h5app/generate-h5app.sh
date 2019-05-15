rm -rf java
rm -rf resources
mkdir java
mkdir resources

java -jar mybatis-generator-core-1.3.6.jar -configfile generatorConfig-h5app.xml -overwrite