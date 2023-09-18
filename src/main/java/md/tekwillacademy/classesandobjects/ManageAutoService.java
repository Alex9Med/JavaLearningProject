package md.tekwillacademy.classesandobjects;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Person;
import md.tekwillacademy.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage autoDocGarage;

        autoDocGarage = new Garage();

        autoDocGarage.address = "Stefan Cel Mare, Ihub 64";
        autoDocGarage.surfaceM2 = 450.0F;

        System.out.println("Obiectul autoDocGarage are urmatoarele proprietati " + autoDocGarage.address
        + "  " + autoDocGarage.surfaceM2 + "  " + autoDocGarage.capacity);


        autoDocGarage.capacity = 50;

        System.out.println("Obiectul autoDocGarage are urmatoarele proprietati " + autoDocGarage.address
                + "  " + autoDocGarage.surfaceM2 + "  " + autoDocGarage.capacity);

        Garage garajIaloveni = new Garage();

        System.out.println("Obiectul garajIaloveni are urmatoarele proprietati " + garajIaloveni.address
                + "  " + garajIaloveni.surfaceM2 + "  " + garajIaloveni.capacity);

        Worker vasile = new Worker();

        vasile.name = "Vasile";
        vasile.age = 54;

        System.out.println("Obiectul nostru are numele de " + vasile.name + " si are " + vasile.age + " ani. ");

        Worker ion = new Worker();
        System.out.println("Obiectul nostru are numele de " + ion.name + " si are " + ion.age + " ani. ");

        Person client1 = new Person("+37369000111");

        Person client10 = new Person();

        Car renaultPNP810 = new Car("Axs23swe89c", "Renault Megane", client1);

        Car skodaOctavia = new Car("Csc5f45sca", "Skoda Octavia", new Person("+37368111000"));

        System.out.println("Masina noastra este " + renaultPNP810.mark + " " + "si proprietarul poate fi apelat la " + renaultPNP810.owner.phoneNumber);

        System.out.println("Masina noastra este " + skodaOctavia.mark + " " + "si proprietarul poate fi apelat la " + skodaOctavia.owner.phoneNumber);


    }
}
