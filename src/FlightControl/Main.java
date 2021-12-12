package FlightControl;

import FlightControl.domain.Airplane;
import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;
import FlightControl.ui.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        UserInterface userInterface = new UserInterface(flightControl, input);
        Airplane airplane = new Airplane("1",120);
        Place place = new Place("1");
        Place place2 = new Place("2");


        userInterface.start();


    }
}
