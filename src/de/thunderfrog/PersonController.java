package de.thunderfrog;

public class PersonController {

    private PersonView view;
    private PersonModel model;

    public PersonController(PersonView view, PersonModel model){
        this.view = view;
        this.model = model;
    }

    public void setPersonFirstName(String firstName){
        model.setPersonFirstName(firstName);
    }

    public String getPersonFirstName(){
        return model.getPersonFirstName();
    }

    public void setPersonLastName(String lastName){
        model.setPersonLastName(lastName);
    }

    public String getPersonLastName(){
        return model.getPersonLastName();
    }

    public void setPersonNr(String personNr){
        model.setPersonNr(personNr);
    }

    public String getPersonNr(){
        return model.getPersonNr();
    }

    public void printView(){
        view.printPersonDetails(model.getPersonFirstName(),model.getPersonLastName(),model.getPersonNr());
    }
}





