package org.patterns.factory;

public interface EmployeeFactory {
    //for factory design pattern

//    public static Employee getEmployee(String empType){
//        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
//            return new AndroidDeveloper();
//        }
//        else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
//            return new WebDeveloper();
//        }else {
//            return null;
//        }
//    }
    //for abstract factory design pattern

    public static Employee getEmployee(AbstractEmployeeFactory abstractFactory){
        return abstractFactory.createEmployee();
    };


}
