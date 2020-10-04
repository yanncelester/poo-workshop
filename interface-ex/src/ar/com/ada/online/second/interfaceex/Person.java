package ar.com.ada.online.second.interfaceex;

public class Person {

    //Atributos
    private String name;
    private String lastName;

    //Constructores

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //métodos


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
