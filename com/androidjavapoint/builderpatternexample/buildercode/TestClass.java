package com.androidjavapoint.builderpatternexample.buildercode;

public class TestClass {
    public static void main(String args[]) {

        Employee employee1 = new Employee.EmployeeBuilder(1234, "Ankit", "Sinhal")
                .withOptionalAddress("Address")
                .withOptionalAge(25)
                .withOptionalPhone("1234567890")
                .buildEmployee();

        System.out.println("Employee 1 : " + employee1.toString());


        Employee employee2 = new Employee.EmployeeBuilder(1234, "Ankit", "Sinhal")
                .withOptionalAge(25)
                .buildEmployee();

        System.out.println("Employee 2 : " + employee2);


        Employee employee3 = new Employee.EmployeeBuilder(1234, "Ankit", "Sinhal")
                .buildEmployee();

        System.out.println("Employee 3 : " + employee3);
    }
}
