# devOpsAppQuiz


> # Jair Camacho
> # Janklaud osorio 

[5%] Realizar un fork del proyecto, y agregar miembros del team aca en el encabezado

- https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
- https://github.com/othneildrew/Best-README-Template

[15%] Hacer un code Review encontrado las razones por las cuales el codigo en el repo es un APIRest o no y justificar, y escribir el resultado del code review dentro de este readme, utilizar las syntaxis propuesta en:

- https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
- https://github.com/othneildrew/Best-README-Template

# Code Review

- El contreolador trabaja con la entidad usuarios pero el nombre no esta en concordancia de la entidad
- El controlador llama al servicio de la interface ManejoUsuarioServiceInt pero al revisar el run no se inyecta el servicio en el proyecto
- Los metodos del controlador no estan en coincordancia al uso del controlador
- los metodos del controlador estan vacio
- el controlador no tiene la etiqueta de restcontroller
- el controlador no tiene la etiqueta  Autowired
- no se han creado los servicios de barrios (interface y clase) 
- la entidad barrio no se define como serializable 
- existen las entidades "empleo" y "pais" pero no se le han creado sus controladores, servicios y no tienen propiedades las entidades y no se define como serializables 
- en el servicio de usuario el unico metodo que tiene plurar en el nombre es saveusuarios el resto esta nomenclado en singular
- el controllador de barrio esta creado con el nombre en plural 
- las propiedades de las entidades estan privadas 
- las propiedades hay algunas nombradas en ingles y otras nombradas en español en las entidades
- la entidad barrio no tiene un identificador unico
- el identificador de la entidad esta de tipo string y se manda como entera 
- falta la creacion de los listados en las entidades de barrio, empleo y pais en la carpeta utils

# Justificacion API REST

es un api rest ya que implementa los metodos del protocolo HTTP 
en los dos metodos del control de usuarios se estan devolviendo codigos de estado http 
se esta trabajando bajo arquitectura de capas
utiliza interfaces uniforme de forma que los recursos implementan la entidad usuario empleo pais y barrio 



[50%] Completar la implementacion usando: hacer commit en el master branch

- https://mockapi.io/ Crear llamados a APis para ganerar datos aleatorios y completar las estructuras si es necesario
- https://www.baeldung.com/spring-boot-json
- https://www.baeldung.com/spring-resttemplate-post-json
- Postman

[30%] Implementar GitFlow Startegy en el proyecto
