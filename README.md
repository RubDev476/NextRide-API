
# Next Ride - API

Catalogo para sitio web de venta de autos seminuevos ([Next Ride](https://github.com/RubDev476/RE-Cars/)). Consiste en una Rest Api para diferentes tipos de filtros por caracteristicas de los autos, para facilitar la busqueda del auto ideal a los clientes.

![App Screenshot](/hero.png)


## Repositorio Frontend

https://github.com/RubDev476/RE-Cars

## 🛠️ Stack

- Java 25
- Spring Boot
- Mysql


## ✨ Características principales
- 📄 **Solo metodos GET**: Api solo para mostrar informacion al cliente, por lo que no se puede hacer metodos para modificar ni borrar datos. 
- 📄 **Datos listos para su uso**: Archivos CSV para añadir directamente a la base de datos (Este proyecto usa Mysql, pero puede usar los mismos archivos para cualquier otra base de datos SQL). Estos archivos pueden ser modificados para añadir tantos datos como desee.
- 📄 **Multiples filtros**: Cada característica tiene su propio metodo GET (doors, color, brand etc.), lo cual facilita la flexibilidad para filtros avanzados personalizados por el cliente.
## 🚀 Instalación y uso local

### 1. Clonar repositorio
Puedes clonar el proyecto desde GitHub directamente en IntelliJ:

- Abre IntelliJ IDEA  
- Ve a **File → New → Project from Version Control**  
- Pega la URL del repositorio:  

```bash
  https://github.com/RubDev476/NextRide-API.git
```

IntelliJ se encargará de la configuración inicial y descarga automática.

---

### 2. Dependencias
El proyecto utiliza **Maven** para la gestión de dependencias.  
IntelliJ detecta automáticamente el archivo `pom.xml` y descarga las librerías necesarias.  
No es necesario ejecutar comandos manuales.

---

### 3. Crear base de datos
En tu servidor MySQL (o cualquier otro servidor SQL), crea la base de datos:

```sql
CREATE DATABASE nameDB;
```

### 4. Configuracion "application.yaml"

Antes de ejecutar el proyecto, debe configurar el archivo "application.yaml" con los datos de su servidor sql, nombre de la base de datos y cambiar el valor de "ddl-auto" por "create".

El archivo de configuracion **.yaml** se encuentra en "src/main/resources/application.yaml".

Una vez modificado el archivo con sus valores de configuracion, tendra un archivo similar tal y como se muestra abajo:

```yaml
spring:
  application:
    name: next-ride
  datasource:
    url: jdbc:mysql://localhost:3306/nameDB
    username: root
    password: 123456
  jpa:
    hibernate:
      ddl-auto: create

server:
  port: 8080
```

### 5. Ejecución local y creacion de tablas (solo la primera vez)
Una vez hecho los pasos anteriores, la primera vez que se ejecute el proyecto, las tablas en la base de datos se crearan automaticamente gracias a la configuracion **"ddl-auto: create"** en el archivo **.yaml**.

***Las tablas se crean sin datos, en el siguiente paso los datos se agregan manualmente.***

Para arrancar la aplicación:

- Abra el archivo principal con la clase `@SpringBootApplication` (ejemplo: `NextRideApplication.java`).  
- Haga clic en el botón **Run ▶️** en la barra superior de IntelliJ.  
- El servidor se iniciará en: http://localhost:8080/
- Compruebe que las tablas se hayan creado correctamente en la base de datos. Las tablas deben ser las mismas que estan en la carpeta **"data csv"**, cada archivo representa una tabla que a su vez el nombre del archivo debe ser el mismo con el nombre de la tabla:

| CSV Nombre | Nombre de la tabla |
|---------------|----------------|
| body_types.csv | body_types |
| brands.csv | brands |
| cars.csv | cars  |
| color_finishes.csv | color_finishes |
| colors.csv | colors |
| fuels.csv  | fuels  |
| transmissions.csv  | transmissions  |

- Una vez que las tablas se hayan creado con exito, haga click en el boton Stop ⏹️ en la barra superior de IntelliJ para detener la aplicación.

### 6. Cargar archivos ".csv" a la base de datos

Importar desde MySQL Workbench

- Abre Workbench.
- Selecciona tu base de datos.
- Ve a Server → Data Import.
- Elige tu archivo CSV y asigna la tabla destino.
- Configura delimitadores y ejecuta la importación.

### 7. Ejecutar localmente

Antes de ejecutar el proyecto de forma estable, solo hay que cambiar el valor de "ddl-auto" por "validate", este valor solo valida que las entidades coincidan con las tablas existentes. No crea ni modifica nada. Con el valor "create" elimina el esquema existente y lo vuelve a crear desde cero cada vez que arranca y tendria que repetir el proceso de cargar archivos ".csv" cada vez que reinicia el proyecto.

```yaml
spring:
  application:
    name: next-ride
  datasource:
    url: jdbc:mysql://localhost:3306/nameDB
    username: root
    password: 123456
  jpa:
    hibernate:
      ddl-auto: validate

server:
  port: 8080
```

Para arrancar la aplicación nuevamente con los datos ya cargados:

- Abra el archivo principal con la clase `@SpringBootApplication` (ejemplo: `NextRideApplication.java`).  
- Haga clic en el botón **Run ▶️** en la barra superior de IntelliJ.  
- El servidor se iniciará en: http://localhost:8080/

De esta forma el proyecto estara listo para su uso local cada vez que lo ejecute de forma estable y sin reiniciar datos ni tablas.

En caso de querer modificar los archivos ".csv" para añadir o editar los datos, tiene que repetir el proceso desde el punto numero 4, ya que los datos solo se pueden actualizar manualmente cada vez que cargue los archivos a la base de datos.

---
