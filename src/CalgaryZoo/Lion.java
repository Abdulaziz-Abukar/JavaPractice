package CalgaryZoo;

public class Lion extends Animal{

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAR!");
    }
}
