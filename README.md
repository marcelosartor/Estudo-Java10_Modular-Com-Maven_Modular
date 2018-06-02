# Introdução
Este projeto é uma adaptação do exercício do livro:
Java 9
Interativo, reativo e modularizado
Rodrigo Turini

## Objetivo:
Estudar o sistema de modulos do java 10 com o sistema de modulos do Maven

#### Esta dividido nos seguintes modulos:
``` 
bookstore
| domain
| http
| nf
| app 
```
## Problema:

ao executar o projeto  
```
java -jar app/target/app-1.0.0.jar
```
ocorre o seguite erro. 
```
Exception in thread "main" java.lang.NoClassDefFoundError: br/com/casadocodigo/http/Books
	at br.com.casadocodigo.MainMavenModulo.main(MainMavenModulo.java:16)
Caused by: java.lang.ClassNotFoundException: br.com.casadocodigo.http.Books
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:582)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:190)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:499)
	... 1 more

=======

```  
