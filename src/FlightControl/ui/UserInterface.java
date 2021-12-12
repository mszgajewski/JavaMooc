package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class UserInterface {

    private FlightControl flightControl;
    private Scanner scanner;

    public UserInterface(FlightControl flightControl, Scanner scanner){
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start(){
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();

    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Wybierz:");
            System.out.println("[1] Dodaj samolot");
            System.out.println("[2] Dodaj lot");
            System.out.println("[x] Wyjdź");

            System.out.print("> ");
            String answer = scanner.nextLine();

            if (answer.equals("1")) {
                addAirplane(scanner);
            } else if (answer.equals("2")) {
                addFlight(scanner);
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    private void addAirplane(Scanner scanner) {
        System.out.print("wpisz id samolotu: ");
        String id = this.scanner.nextLine();
        System.out.print("wpisz pojemność samolotu: ");
        int capacity = Integer.parseInt(this.scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }

    private void addFlight(Scanner scanner) {
        System.out.print("wpisz id samolotu: ");
        Airplane airplane = askForAirplane(scanner);
        System.out.print("Podaj id lotniska początkowego ");
        String departureID = this.scanner.nextLine();
        System.out.print("Podaj id lotniska końcowego ");
        String destinationID = this.scanner.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }

    private void startFlightControl() {
        System.out.println("Kontrola lotu");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Wybierz:");
            System.out.println("[1] Pokaż samoloty");
            System.out.println("[2] Pokaż loty");
            System.out.println("[3] Pokaż szczegóły samolotu");
            System.out.println("[x] Wyjdź");

            System.out.print("> ");
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    private void printAirplanes() {
        for (Airplane plane : flightControl.getAirplanes()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    private void printAirplaneDetails() {
        System.out.print("Podaj ID samolotu: ");
        Airplane plane = askForAirplane(scanner);
        System.out.println(plane);
        System.out.println();
    }

    private Airplane askForAirplane(Scanner scanner) {
        Airplane airplane = null;
        while (airplane == null) {
            String id = this.scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("Brak samolotu o podamym id: " + id + ".");
            }
        }

        return airplane;
    }
}