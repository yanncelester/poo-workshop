package ar.com.ada.online.second.collections;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person maria = new Person("Maria", "Abdala");
        Person ana = new Person("Ana", "Paz");
        Person lola = new Person("Dolores", "Machado");

        //List
        List<Person> people = new ArrayList<Person>();

        //Agrego a las personas a mi array y luego hago un for para traerme el listado completo del arraylist

        people.add(maria);
        people.add(ana);
        people.add(lola);

        System.out.println("For ArrayList");

        for (Person person : people) {
            System.out.println(person.toString());

        }

        //Obtener por el get que usuario se está guardando en ese indice
        System.out.println("Get por el numero de indice");
        System.out.println(people.get(0).toString()); // me devolvió maria con este get, ahora puedo hacer un indexOf con maria

        //indexof
        System.out.println("Index of, para obtener el indice");
        System.out.println(people.indexOf(maria)); // Y me devuelve cero es el indice donde se guardó.

        System.out.println("List - remove");
        people.remove(0);
        people.forEach((person ->
                System.out.println(person.toString())));



        //Set --> nos garantiza que no haya duplicados
        Set<Person> personSet = new HashSet<Person>();

        personSet.add(ana);
        personSet.add(maria);
        personSet.add(lola);
        personSet.add(ana); //Agregamos un duplicado


        System.out.println();
        System.out.println("For HashSet");

        for (Person person : personSet) {
            System.out.println(person.toString());
        }

        System.out.println("Remove - set");
        personSet.remove(maria);
        System.out.println(personSet.toString());

        //Map

        Map<String, Person> personMap = new HashMap<String, Person>();

        personMap.put("p1", maria);
        personMap.put("p2", ana);
        personMap.put("p3", lola);

        System.out.println();
        System.out.println("Map");

        personMap.forEach((key, person) -> //El forEach me permite dentro del paréntesis definir una función anónima, entregará key y objeto, y el cuerpo de la función anónima que es -> {} adentro del cuerpo en el ejemplo mandamos un sout.
                System.out.println("person: " + person.getName()));
        
        
        System.out.println("hash map - remove");
        personMap.remove("p2");
        personMap.forEach((key, person) -> {
            System.out.println(person.toString());
        });


    }
}
