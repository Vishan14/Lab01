package Exercise7;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args)
    {
        double weight;
        double weightonMars;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight(kg): ");
        
        weight = sc.nextDouble();
        weightonMars = (weight/9.81)*3.711;

         System.out.println("Weight on Earth: " +weight + "kg");
         System.out.println("Weight on Mars: " +String.format("%.2f", weightonMars ) + "kg");

    }
}