package org.example.ui;

import org.example.serveice.AstronautService;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private AstronautService service;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleView(AstronautService service) {
        this.service = service;
    }

    public void start(){
        System.out.println("Welcome to Space Mission Simulator");

        while (true) {
            printMenu();
            String option = scanner.nextLine();

            System.out.println(); // Blank line for better readability

            switch (option) {
                case "1":
                    req1LoadAndPrint();
                    break;
                case "0":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Please select a valid option!");
            }
        }
    }
    private void printMenu() {
        System.out.println("\n Space menu");
        System.out.println("1. Load mission events and print them");
        System.out.println("0. Exit");
        System.out.print("Please enter your option:");
    }

    private void req1LoadAndPrint() {
        System.out.println("Astronauts loaded:" + service.getAllAstronauts().size());
        System.out.println("Mission events loaded:" + service.getAllMissionEvents().size());
        System.out.println("Supplies loaded:" + service.getAllSupplies().size());
        service.getAllAstronauts().forEach(System.out::println);
    }
}
