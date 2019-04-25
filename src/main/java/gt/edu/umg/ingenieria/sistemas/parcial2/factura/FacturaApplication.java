package gt.edu.umg.ingenieria.sistemas.parcial2.factura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = { "gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model" })
public class FacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturaApplication.class, args);
	}

}
