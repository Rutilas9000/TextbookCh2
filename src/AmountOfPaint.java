/**
 * @class: AmountOfPaint
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 6, 2023
 * description: This program will calculate the gallons and quarts needed to paint the room.
 * Assume that the ceiling is painted, 1 gallon of paint covers about 350 square feet, each window is 15 square feet,
 * and each door is 21 square feet.
 * */
import java.util.Scanner;
public class AmountOfPaint {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total height of the room: ");
        int height = in.nextInt();
        System.out.println("Enter the total length of the room: ");
        int length = in.nextInt();
        System.out.println("Enter the total width of the room: ");
        int width = in.nextInt();
        System.out.println("Enter the total number of doors: ");
        int doors = in.nextInt();
        System.out.println("Enter the total number of windows: ");
        int windows = in.nextInt();
        int sqDoors = 21;
        int sqWindows = 15;
        int gallons = 350;
        int totalArea = length * width * height;
        int winAnddoors = (sqWindows * windows) + (sqDoors * doors);
        int paintArea = totalArea - winAnddoors;
        int paintNeeded = paintArea/gallons;
        System.out.println("In order to paint the whole room, we need " + paintNeeded + " gallons of paint.");
    }
}
