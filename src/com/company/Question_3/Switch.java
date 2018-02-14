package com.company.Question_3;

import java.util.Scanner;

public class Switch {
    //    1. Create a switch statement in its own method in the Switch class in this package.
//    This switch statement should take a string and have 4 cases it could match.
//    The default class should inform the user they have not selected an option that is valid and ask them to try again.
    Scanner input = new Scanner(System.in);

    protected String Statement() {
        return null;
    }

    {

        System.out.println("Which of these animals do you like the most? \nSnow Leopard \nLion \nTiger \nOrca");

        switch (input.nextLine()) {
            case "Snow Leopard":
                System.out.println("Me too!!");
                break;
            case "Lion":
                System.out.println("Ehh they're alright.");
                break;
            case "Tiger":
                System.out.println("Yeah they are my third favorite on this list");
                break;
            case "Orca":
                System.out.println("Orcas are amazing they are my second favorite animal on this list.");
                break;
            default:
                System.out.println("You have not selected an option that is valid.\n please try again.");
                Statement();
        }

    }
//
//    private void Statement() {
//    }


}
