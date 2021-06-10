package de.thunderfrog;

public class Main {

    public static void main(String[] args) {

        PersonView view = new PersonView();
        PersonModel model = new PersonModel();

        // Set Model Data
        model.setPersonFirstName("Werner");
        model.setPersonLastName("Beinhart");
        model.setPersonNr("10D15P");

        // Create Controller
        PersonController controller = new PersonController(view,model);

        // Print Data
        controller.printView();

        // Ugly Leerzeile
        System.out.println("");

        // Update Model Data
        controller.setPersonFirstName("Meister");
        controller.setPersonLastName("Röhrig");
        controller.setPersonNr("D55KJ7");

        // Print Data
        controller.printView();

    }
}
