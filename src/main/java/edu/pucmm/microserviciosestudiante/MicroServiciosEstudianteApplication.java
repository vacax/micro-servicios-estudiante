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

    public static void main(String[] args) {
        SpringApplication.run(MicroServiciosEstudianteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //leyendo la información de las variables.
        String db_nombre = environment.getProperty("NOMBRE_APP");
        System.out.println("Nombre de la Aplicación = "+db_nombre);
    }
}
