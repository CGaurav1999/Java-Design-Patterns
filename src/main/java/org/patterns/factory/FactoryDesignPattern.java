package org.patterns.factory;

//when there is superclass and multiple child class and we want to get object of subclass based
//on inputs and requirements
//Then we create Factory class which takes responsibility of creating object of class based on input.


//loose couplling
//it focuses on Interface nor on implemented class

public class FactoryDesignPattern {
    public static void main(String[] args) {
//        Employee androidDeveloper = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
//        System.out.println(androidDeveloper.salary());
//
//        Employee webDeveloper = EmployeeFactory.getEmployee("WEB DEVELOPER");
//        System.out.println(webDeveloper.salary());

        Employee androidDeveloper = EmployeeFactory.getEmployee(new AndroidFactory());
        System.out.println(androidDeveloper.salary());

        Employee webDeveloper = EmployeeFactory.getEmployee(new WebFactory());
        System.out.println(webDeveloper.salary());
    }
}
