package com.androidjavapoint.builderpatternexample.badcode;

public class TestClass {
    public static void main(String args[]) {

        Employee employee1 = new Employee(1234, "Ankit", "Sinhal", 25, "1234567890", "Address");
        System.out.println("Employee 1 : " + employee1);

        Employee employee2 = new Employee(1234, "Ankit", "Sinhal", 25);
        System.out.println("Employee 2 : " + employee2);

        Employee employee3 = new Employee(1234, "Ankit", "Sinhal", "1234567890");
        System.out.println("Employee 3 : " + employee3);

        Employee employee4 = new Employee(1234, "Ankit", "Sinhal", 0, null, null);
        System.out.println("Employee 4 : " + employee4);
    }
}
