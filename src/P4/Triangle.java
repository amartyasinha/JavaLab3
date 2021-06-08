package P4;

import java.util.Scanner;
import P1.Shape;

public class Triangle extends Shape {
    Scanner sc = new Scanner(System.in);

    double base;
    double height;

    @Override
    public void input() {
        System.out.print("Enter Base: ");
        base = sc.nextDouble();
        height = sc.nextDouble();
    }

    @Override
    public double area(){
        return 0.5*base*height;
    }
}
