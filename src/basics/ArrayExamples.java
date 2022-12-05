package basics;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        System.out.println(names[2]);

        System.out.println(names.length);

        String[] dreamCars = new String[]{"BMW", "Audi", "Volvo", "Tesla"};

        for(int i = 0; i < dreamCars.length; i++){
            System.out.println(dreamCars[i]);
        }

        for(String car: dreamCars){//->>> for every item (will be assumed as car) in array
            System.out.println("Hello car " + car);
        }

        int table[] = {321, 32, 56, 4, 89, 777};
        for(int value: table){
            if(value % 2 == 0) {
                System.out.println(value + " - even number");
            }else {
                System.out.println(value + " - odd number");
            }
        }
    }


}
