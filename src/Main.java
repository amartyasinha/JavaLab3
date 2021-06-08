import java.util.Scanner;
import P1.Shape;
import P2.Rectangle;
import P3.Circle;
import P4.Triangle;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;

        char repeat;
        int choice;

        do {
            System.out.println("Select the Shape whose Area you want to Calculate");
            System.out.println("1. Rectangle\n2. Circle\n3. Triangle");

            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    shape = new Rectangle();
                    shape.input();
                    System.out.println("\nThe Area of Rectangle is " + shape.area() + " sq. units\n");
                }

                case 2 -> {
                    shape = new Circle();
                    shape.input();
                    System.out.println("\nThe Area of Circle is " + shape.area() + " sq. units\n");
                }

                case 3 -> {
                    shape = new Triangle();
                    shape.input();
                    System.out.println("\nThe Area of Triangle is " + shape.area() + " sq. units");
                }

                default -> System.err.println("Wrong Choice!");
            }
            System.out.print("Do you want to Return to Main Menu? Y/N: ");
            repeat = sc.next().charAt(0);
        }while(repeat == 'Y' || repeat == 'y');
    }
}
