# Arquitectura FXML basada en JavaFX con Maven 

Este proyecto es una arquitectura de maven basada en JavaFX

### Requisitos

* JDK 11
* Maven 3.X

## Clona el repositorio e ingresa a él
``` bash
git clone https://github.com/RanMd/javafx-archetype.git
cd javafx-archetype-comp
```

## Instala la arquitectura
``` bash
mvn archetype:create-from-project
```

## Después de crear la arquitectura
Maven nos creará una carpeta target/generated-sources/archetype, luego de esto accede hasta la ruta target/generated-sources/archetype y ejecuta:
``` bash
mvn install
```

## Con eso ya tendremos instalado nuestra arquitectura en local
Para validarlo ejecutamos el siguiente comando para listar los arquetipos locales:
``` bash
mvn archetype:generate -DarchetypeCatalog=local
```

