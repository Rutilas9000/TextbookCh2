/**
 * @class: TotalTime
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 4, 2023
 * description: This program will convert a given total number of seconds into hours, minutes and seconds.
 * It should prompt the user for input, read an integer from the keyboard, calculate the result,
 * and display the output.
 * */
import java.util.Scanner;
public class TotalTime {
    public static void main(String[] args){
        Scanner time = new Scanner(System.in);
        System.out.println("Input the total number of seconds");
        int totalSeconds = time.nextInt();
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int hours = (totalSeconds / 60) / 60;
        System.out.println("If the total number of seconds is " + totalSeconds + ", it is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
