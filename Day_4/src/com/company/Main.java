package com.company;
import javax.naming.MalformedLinkException;
import java.util.Scanner;
import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Scanner enter_value = new Scanner(System.in);
        int enter = 0;
        int value = 0;
        String name;
        Vehicle_Properties pointer_on_vehicle = new Vehicle_Properties();
        int x = 2;
        int y = 0;
        Map map = new Map();
        Objects all_object_on_map = new Objects();
        boolean game_on = true;
        boolean action = false;

        while(game_on){
            switch (enter){
                case 0: {
                    System.out.println("Please enter you move:\n" +
                            "Show map - press 1\n" +
                            "Create a vehicle - press 2\n" +
                            "Go to action stage - press 3");
                    enter = enter_value.nextInt();
                    break;
                }
                case 1: {
                    System.out.println("Currently map:\n");
                    map.print_map();
                    System.out.println("If you want continue press 1, or press 0 to exit the game\n");
                    enter = enter_value.nextInt();
                    if (enter == 0){
                        System.out.println("Goodbye I will be glad if you want to play again!\n");
                        game_on = false;
                        break;
                    }
                    if (enter == 1){
                        enter = 0;
                    }
                    break;
                }
                case 2: {
                    System.out.println("What type a vehicle are you want to create?\n" +
                            "Plane - press 1\n" +
                            "Land vehicle - press 2\n" +
                            "Ship - press 3\n");
                    enter = enter_value.nextInt();
                    switch (enter) {
                        case 1:
                            System.out.println("What type a plane are you want to create?\n" +
                                    "Jet - press 1\n" +
                                    "Bomber - press 2\n");
                            enter = enter_value.nextInt();
                            switch (enter) {
                                case 1:
                                    System.out.println("Select coordinates\n" +
                                            "2:0 - 1, 2:1 - 2,0:2 - 3,1:2 - 4");
                                    enter = enter_value.nextInt();
                                    switch (enter) {
                                        case 1:
                                            x = 2;
                                            y = 0;
                                            System.out.println("Jet spawned at coordinates x = 2, y = 0");
                                            break;
                                        case 2:
                                            x = 2;
                                            y = 1;
                                            System.out.println("Jet spawned at coordinates x = 2, y = 1");
                                            break;
                                        case 3:
                                            x = 0;
                                            y = 2;
                                            System.out.println("Jet spawned at coordinates x = 0, y = 2");
                                            break;
                                        case 4:
                                            x = 1;
                                            y = 2;
                                            System.out.println("Jet spawned at coordinates x = 1, y = 2");
                                            break;
                                    }
                                    Jet jet = new Jet(x, y, map.map, all_object_on_map);
                                    System.out.println("If you want continue press 1, or press 0 to exit the game\n");
                                    enter = enter_value.nextInt();
                                    if (enter == 0) {
                                        System.out.println("Goodbye I will be glad if you want to play again!\n");
                                        game_on = false;
                                        break;
                                    }
                                    if (enter == 1) {
                                        enter = 0;
                                    }
                                    break;
                                case 2:

                                    System.out.println("NOT READY!");
                                    System.out.println("If you want continue press 1, or press 0 to exit the game\n");
                                    enter = enter_value.nextInt();
                                    if (enter == 0) {
                                        System.out.println("Goodbye I will be glad if you want to play again!\n");
                                        game_on = false;
                                        break;
                                    }
                                    if (enter == 1) {
                                        enter = 0;
                                    }
                                    break;


                            }
                        case 2:
                            System.out.println("NOT READY!");
                            System.out.println("If you want continue press 1, or press 0 to exit the game\n");
                            enter = enter_value.nextInt();
                            if (enter == 0) {
                                System.out.println("Goodbye I will be glad if you want to play again!\n");
                                enter = 99;
                                game_on = false;
                                break;
                            }
                            if (enter == 1) {
                                enter = 0;
                            }
                            break;
                        case 3:
                            System.out.println("NOT READY!");
                            System.out.println("If you want continue press 1, or press 0 to exit the game\n");
                            enter = enter_value.nextInt();
                            if (enter == 0) {
                                System.out.println("Goodbye I will be glad if you want to play again!\n");
                                enter = 99;
                                game_on = false;
                                break;
                            }
                            if (enter == 1) {
                                enter = 0;
                            }
                            break;

                    }
                    System.out.println("If you want continue press 1, or press 0 to exit the game\n");
                    enter = enter_value.nextInt();
                    if (enter == 0) {
                        System.out.println("Goodbye I will be glad if you want to play again!\n");
                        enter = 99;
                        game_on = false;
                        break;
                    }
                    if (enter == 1) {
                        enter = 0;
                    }
                    break;
                }
                case 3: {
                    action = true;
                }
            }
            System.out.println("Action phase");
            while(action){
                System.out.println("If you want to move vehicle - press 1" +
                                   " or press 2 or want to fire");
                enter = enter_value.nextInt();
                if (enter == 1){
                    System.out.println( "Enter type of vehicle you want to move\n" +
                                        "Plane - press 1\n" +
                                        "Land vehicle - press 2\n" +
                                        "Ship - press 3\n");
                    enter = enter_value.nextInt();
                    if (enter == 1){
                        System.out.println( "Enter type of plane\n" +
                                            "Jet - press 1" +
                                            "Bomber - press 2");
                        enter = enter_value.nextInt();
                    } else {

                    }
                    if(enter == 1){
                        System.out.println("Enter Jet name");
                        name = enter_value.nextLine();
                        for (int i=0; i<10;i++){

                        }
                    }
                }
            }
        }

    }
}
