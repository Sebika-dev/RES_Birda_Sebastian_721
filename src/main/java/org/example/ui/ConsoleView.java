package org.example.ui;

import org.example.model.Astronaut;
import org.example.serveice.MissionService;

import java.util.Scanner;

public class ConsoleView {
    private MissionService service;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleView(MissionService service) {
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
                case "2":
                    req2FilterBySpacecraftAndStatus();
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
        System.out.println("2. Filter by status and spacecraft");
        System.out.println("0. Exit");
        System.out.print("Please enter your option:");
    }

    private void req1LoadAndPrint() {
        System.out.println("Astronauts loaded:" + service.getAllAstronauts().size());
        System.out.println("Mission events loaded:" + service.getAllMissionEvents().size());
        System.out.println("Supplies loaded:" + service.getAllSupplies().size());
        service.getAllAstronauts().forEach(System.out::println);
    }

    private void req2FilterBySpacecraftAndStatus() {
        System.out.print("Input Spacecraft: ");
        String spacecraft = scanner.nextLine();

        for (Astronaut a : service.getActiveAstronautsBySpacecraft(spacecraft)) {
            System.out.println(a.toString());
        }
    }
}
