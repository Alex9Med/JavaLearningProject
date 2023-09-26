package md.tekwillacademy.methodstask;

public class ExecutionService {

    public static void main(String[] args) {

        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(120,100));

        int randomInt = DataGeneratorUtil.getRandomInt(-50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));


        Customer customer1 = new Customer("Bruce Lee", "Masculin", 30);

        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(85);
        System.out.println(infoAboutCustomer1);

        customer1.setName("Lee Maia");
        System.out.println(customer1.toString());

        System.out.println("Varsta lui Bruce este:" + customer1.getAge());
        System.out.println("Familia lui Bruce este:" + customer1.getName());

        Customer customer2 = new Customer("Maia Sandu", "Feminin", 18);
        System.out.println(customer2.toString());



    }
}
