package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int add = calculator.add(15,25);
        if (add == 40){
            System.out.println("Add test OK");
        } else {
            System.out.println("Error!");
        }
        int substract = calculator.substract(70,16);
        if (substract == 54){
            System.out.println("Substract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}