# Introdução
Este projeto é uma adaptação do exercício do livro:
Java 9
Interativo, reativo e modularizado
Rodrigo Turini

## Objetivo:
Estudar o sistema de modulos do java 10 com o sistema de modulos do Maven

#### Esta dividido nos seguintes modulos:

bookstore
| domain
| http
| nf
| app 
 
## Problema:

ao compilar o projeto 
```
mvn install -Dmaven.test.skip=true
```
ocorre um erro no compilacao no modulo http.
```
[INFO] Reactor Summary:
[INFO] 
[INFO] bookstore 1.0.0 .................................... SUCCESS [  0.287 s]
[INFO] domain ............................................. SUCCESS [  1.307 s]
[INFO] http ............................................... FAILURE [  0.026 s]
[INFO] nf ................................................. SKIPPED
[INFO] app 1.0.0 .......................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.750 s
[INFO] Finished at: 2018-05-20T16:52:13-03:00
[INFO] ------------------------------------------------------------------------
```  
