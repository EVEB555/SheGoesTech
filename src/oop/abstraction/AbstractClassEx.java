package oop.abstraction;

abstract class Animal {
    protected String name;
    public void sleep() {
        System.out.println("zzzzz");
    }
    public abstract void animalSound();
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Ciriciri");
    }
}

public class AbstractClassEx {
    public static void main(String[] args) {
        //Animal animal1 = new Animal(); Cannot create object from an abstrac class

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();
    }
}
