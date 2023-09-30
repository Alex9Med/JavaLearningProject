package md.tekwillacademy.zooclubservice;

public class Dog extends Animal{

    private boolean hasAGoodLife;
    public Dog(String nameOfTheDog, boolean hasAGoodLife){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }

    public Dog(String nameOfTheDog){
        super(nameOfTheDog);
    }
    @Override
    public void makeSound() {
        System.out.println("Hrrrr Hrrr");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating Pedigree");
    }

    public String getName(){
        return this.name + " - This is from the child class";
    }
}
