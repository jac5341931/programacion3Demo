package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	Task t1 = new Task("recordar POO", false, LocalDate.of(2022, 8, 19));
	Task t2 = new Task("Conocer Intellij AIDEA", false, LocalDate.of(2022, 8, 19));
	Task t3 = new Task("Conocer de Spring Boot", false, LocalDate.of(2022, 8, 19));
	Task t4 = new Task("Finalizando Tareas", false, LocalDate.of(2022, 8, 19));
	Task t5 = new Task("Recuperar Finalizar Tareas...", false, LocalDate.of(2022, 8, 19));

	System.out.println("descripcion de la tarea");
	System.out.println(t1.getDescription());
	System.out.println("fecha de la tarea");
	System.out.println(t1.getDueDate());
	System.out.println("estado de la tarea");
	System.out.println(t1.getDone());

	// ahora se pretende modificar la propiedad de la descripcion de t1

		t1.setDescription("Recordando POO");
		Tasklist metas = new Tasklist("tareas iniciales");//crea una intancia de la clase taskList

		metas.addTasklist(t1);
		metas.addTasklist(t2);
		metas.addTasklist(t3);
		metas.addTasklist(t4);
		metas.addTasklist(t5);

		System.out.println("nueva descripcion de la tarea 1: ");
		System.out.println("nueva descripcion de la tarea 1: ");


	}
}