package tasks.carpet;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCoast(){
        return floor.getArea() * carpet.getCost();
    }
}
