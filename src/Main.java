import transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 2");
        Car carWithConstructor = new Car("BMW","Z8",3.0,"черный",2021,"Германия","АКПП","родстер","к775нп77",2,false);
        System.out.println(carWithConstructor.toString());
        carWithConstructor.changeTires(1);
        System.out.println(carWithConstructor.toString());
    }
}