package LoginUtenteJDBCPostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginUtenteJDBCPostgres {
//https://github.com/jokumar/postgress-boot esempio --> quello che stiamo seguendo per l'implementazione
//https://www.javaguides.net/2020/02/java-jdbc-postgresql-connection-example.html per la configurazione seguendo la guida della slide
	public static void main(String[] args) {
		SpringApplication.run(LoginUtenteJDBCPostgres.class, args);
	}

}
