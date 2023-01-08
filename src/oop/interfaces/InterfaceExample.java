package oop.interfaces;


interface Bug{
    public void bugSound();
    public void bugSize();

}

interface Location {
    public void location();
}

class Ant implements Bug, Location {
    public void bugSound(){
        System.out.println("Tzzz");
    }
    public void bugSize(){
        System.out.println("Small");
    }

    public void location(){
        System.out.println("Forest");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        //interface - completely abstract class. Instead of regular fields (parameters) interface will have constants (parameter with a value set)
        //abstract class - can have regular fields and methods

        Ant ant = new Ant();
        ant.bugSound();
        ant.bugSize();
        ant.location();
    }
}
