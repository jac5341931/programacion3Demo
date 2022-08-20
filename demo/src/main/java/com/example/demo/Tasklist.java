package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasklist {
    private String name;
    private List<Task> tasklist;

    public Tasklist(String name) { //constructor solo para nombre
        this.name = name;
        this.tasklist = new ArrayList<Task>();//inicializar la variable tasklst
            }
//crea otro metodo para agregar una tarea a la lista
    public void addTasklist(Task task){
        this.tasklist.add(task);
    }

    public List<Task> getTasklist(){
        return this.tasklist;
    }

    public void setTasklist(List<Task> tasklist) {
        this.tasklist = tasklist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //https://www.arquitecturajava.com/java-stream-filter-y-predicates/
    //https://www.arquitecturajava.com/java-8-lambda-expressions/
    //https://www.youtube.com/watch?v=E3BU2fvolfY&feature=emb_logo

    public void removeTask(String description){
        this.tasklist = tasklist.stream().filter(t->{//funcion lamda
            return !t.getDescription().equals(description);
        }).collect(Collectors.toList());
    }

    public void printTask(){
        this.tasklist.forEach(task->{

        System.out.println("descripcion:");
        System.out.println(task.getDescription());
        System.out.println("fecha:");
        System.out.println(task.getDueDate());
        System.out.println("realizada");
        System.out.println(task.getDone());
        System.out.println("------------------");



        });
    }

}
