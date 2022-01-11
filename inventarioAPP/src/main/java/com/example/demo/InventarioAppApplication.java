package com.example.demo;

import controlador.ControladorProducto;
import modelo.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import vista.Interfaz;

@SpringBootApplication
@ComponentScan("modelo")
@EnableJdbcRepositories("modelo")
public class InventarioAppApplication
{
    @Autowired
    RepositorioProducto repositorioPro;
    
    public static void main(String[] args)
    {
	SpringApplicationBuilder constru = new SpringApplicationBuilder(InventarioAppApplication.class);
        constru.headless(false);
        ConfigurableApplicationContext contexto = constru.run(args);
    }
    
    @Bean
    ApplicationRunner correrApp()
    {
        return args ->
        {
            Interfaz vista = new Interfaz();
            ControladorProducto controlador = new ControladorProducto(repositorioPro, vista);
        };
    }
}
