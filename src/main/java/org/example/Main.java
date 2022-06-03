package org.example;

public class Main {
    public static void main(String...args){
        JavaDevelopment javaDevelopment=new JavaDevelopment();
        HiringDepartment hiringDepartment=new HiringDepartment(javaDevelopment);
        hiringDepartment.displayInfo();

    }
}
