package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person Alexandru = new Person();

        System.out.println(Alexandru.isRetired);

        Alexandru.isRetired = false;

        if(Alexandru.isRetired){
            System.out.println("Alexandru is retired");
        } else {
            System.out.println("Alexandru is not retired");
        }

        Person Vanea = new Person(2000505371, "Vanea", "Married", true);

        System.out.println("Available Info about Vanea:" + Vanea.isRetired);

        if(Vanea.isRetired){
            System.out.println("Vanea is retired");
        } else {
            System.out.println("Vanea is not retired");
        }

        Person Mihaela = new Person(2100347785, "Mihaela");

        System.out.println("Available info about Mihaela: " + Mihaela.isRetired);

        if(Mihaela.isRetired){
            System.out.println("Mihaela is retired");
        } else {
            System.out.println("Mihaela is not retired");
        }


        Person.hasHeart = true;
        System.out.println(Person.hasHeart);
    }
}
