package org.example;

public class HiringDepartment {
    private Development development; //Определяем интерфейс

    //Вместо конструктора используем сеттер
    public void setDevelopment(Development development){
        this.development = development;
    }


    public void displayInfo(){
        System.out.println("Name: " + development.getName());
        System.out.println("Job: " + development.getJob());
    }
}
