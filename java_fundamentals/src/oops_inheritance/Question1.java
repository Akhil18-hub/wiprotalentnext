package oops_inheritance;

import java.util.Scanner;

class Box {
    double height;
    double width;
    double depth;
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double getVolume() {
        return height * width * depth;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter depth: ");
        double depth = sc.nextDouble();
        Box box = new Box(height, width, depth);
        System.out.println("Volume of the box: " + box.getVolume());

        sc.close();
    }
}
