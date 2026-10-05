package com.rubdev476.next_ride;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Next Ride API",
				version = "1.0",
				description = "Documentación de la API para obtener informacion de autos y catálogo de autos, para facilitar los filtros de busquedas a clientes. " +
						"Las endpoints que tienen 'in-use' son solo para traer informacion que esta relacionada con la tabla 'cars', " +
						"esto para mostrar solo las opciones disponibles en el catálogo. Por ejemplo si se registró la marca ´Ford´, pero no " +
						"hay coches de la marca ' Ford' disponibles para la venta, entonces no se debe mostrar la marca como una " +
						"opcion a elegir al cliente. La informacion de los filtros debe ser solo la que este disponible para la venta."
				//contact = @Contact(name = "Equipo Backend", email = "backend@empresa.com")
		)
)
@SpringBootApplication
public class NextRideApplication {
	public static void main(String[] args) {
		SpringApplication.run(NextRideApplication.class, args);
	}

}
