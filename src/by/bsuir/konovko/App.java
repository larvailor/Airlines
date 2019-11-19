package by.bsuir.konovko;

import by.bsuir.konovko.flight.*;
import by.bsuir.konovko.handlers.AddFlightHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // variables
    private static ArrayList<Flight> flights = new ArrayList<Flight>();



    // methods
    public static void main(String[] args) {
        manageHandlers();
    }



    private static void manageHandlers() {
        Scanner in = new Scanner(System.in);

        int input;
        while (true) {
            printMenu();
            try {
                input = Integer.parseInt(in.nextLine());

                switch (input) {
                    case 1:
                        new AddFlightHandler(flights);
                        break;
                    case 0:
                        return;
                }
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }



    private static void printMenu() {
        System.out.println("-------------------------------");
        System.out.println("              MENU             ");
        System.out.println("-------------------------------");
        System.out.println("   1. Print all flights        ");
        System.out.println("   0. Exit                     ");
        System.out.print("             Your choice: ");
    }
}