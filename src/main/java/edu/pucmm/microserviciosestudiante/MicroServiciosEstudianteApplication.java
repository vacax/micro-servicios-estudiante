package edu.pucmm.microserviciosestudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MicroServiciosEstudianteApplication implements CommandLineRunner {

    @Autowired
    private Environment environment;

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        SpringApplication.run(MicroServiciosEstudianteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //leyendo la información de las variables.
        String db_nombre = environment.getProperty("NOMBRE_APP");
        String direccionDb = environment.getProperty("DB_HOST");
        System.out.println("Nombre de la Aplicación = "+db_nombre);
        System.out.println("Dirección de la Aplicación = "+direccionDb);
    }
}
