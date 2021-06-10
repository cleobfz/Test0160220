package de.thunderfrog;

public class PersonView {

    // Ausgabe der Personen Details
    public void printPersonDetails(String personFirstName, String personLastName, String personNr){
        System.out.println("Personen Details");
        System.out.println("Personalnummer: " + personNr);
        System.out.println("Vorname: " + personFirstName);
        System.out.println("Nachname: " + personLastName);
    }
}
