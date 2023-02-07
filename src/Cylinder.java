/**
 * @class: Cylinder
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 4, 2023
 * description: This program will calculate the base area and volume of a cylinder,
 * given the radius of the base circle and the length of the cylinder while using 3.1416 as the PI value.
 * */
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        double pi = 3.1416;
        Scanner value = new Scanner(System.in);
        System.out.println("Input the radius of the cylinder");
        double radius = value.nextDouble();
        System.out.println("Input the length of the cylinder");
        double length = value.nextDouble();
        double baseArea = pi * (radius * radius);
        double volume = pi * (radius * radius) * length;
        System.out.println("The base area of the cylinder is " + baseArea);
        System.out.println("The volume of the cylinder is " + volume);

    }
}
