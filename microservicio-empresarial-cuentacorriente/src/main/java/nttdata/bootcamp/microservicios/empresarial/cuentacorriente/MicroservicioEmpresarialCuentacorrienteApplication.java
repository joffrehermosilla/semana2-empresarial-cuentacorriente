package nttdata.bootcamp.microservicios.empresarial.cuentacorriente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioEmpresarialCuentacorrienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEmpresarialCuentacorrienteApplication.class, args);
	}

}
