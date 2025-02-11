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
- Los metodos del controlador estan vacio
- El controlador no tiene la etiqueta de restcontroller
- El controlador no tiene la etiqueta  Autowired
- No se han creado los servicios de barrios (interface y clase) 
- La entidad barrio no se define como serializable 
- Existen las entidades "empleo" y "pais" pero no se le han creado sus controladores, servicios y no tienen propiedades las entidades y no se define como serializables 
- En el servicio de usuario el unico metodo que tiene plurar en el nombre es saveusuarios el resto esta nomenclado en singular
- El controllador de barrio esta creado con el nombre en plural 
- Las propiedades de las entidades estan privadas 
- Las propiedades hay algunas nombradas en ingles y otras nombradas en español en las entidades
- La entidad barrio no tiene un identificador unico
- El identificador de la entidad esta de tipo string y se manda como entera 
- Falta la creacion de los listados en las entidades de barrio, empleo y pais en la carpeta utils

# Justificacion API REST

- Es un api rest ya que implementa los metodos del protocolo HTTP 
- En los dos metodos del control de usuarios se estan devolviendo codigos de estado http 
- Se esta trabajando bajo arquitectura de capas
- Utiliza interfaces uniforme de forma que los recursos implementan la entidad usuario empleo pais y barrio 



[50%] Completar la implementacion usando: hacer commit en el master branch

- https://mockapi.io/ Crear llamados a APis para ganerar datos aleatorios y completar las estructuras si es necesario
- https://www.baeldung.com/spring-boot-json
- https://www.baeldung.com/spring-resttemplate-post-json
- Postman

![image](https://user-images.githubusercontent.com/6808022/169195598-05a97b8c-ad23-4285-81e6-03ec473654b8.png)

![image](https://user-images.githubusercontent.com/6808022/169195439-deaa29b2-246e-4fce-ab24-86a77c304a26.png)

![image](https://user-images.githubusercontent.com/6808022/169195477-a60d59c4-256c-4923-9050-b5a697457656.png)

![image](https://user-images.githubusercontent.com/6808022/169195501-12fa70e2-4a05-4892-9226-405114225d97.png)

![image](https://user-images.githubusercontent.com/6808022/169195525-111218a5-fc53-466c-a2de-6f5110a51466.png)



[30%] Implementar GitFlow Startegy en el proyecto

**Ramas creadas: produccion y preproduccion**
