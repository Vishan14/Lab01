package Exercise8;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of human to be calculated: ");
		int numofHuman = sc.nextInt();
		
		ListOfHuman list = new ListOfHuman();
		Human[] person = new Human[6]; //continue here
		
			for(int i = 0; i < numofHuman ; i++) {
				
				person[i] = new Human();
				
				System.out.println("Input person " + (i+1) +"'s weight(KG) :" );
				double weight = sc.nextDouble();
				
				person[i].setweightonEarth(weight);
				
				weightinMars convertweightinMars = new weightinMars();
				int weightM = ((int)(convertweightinMars.getweightonMars(person[i].getweightonEarth()*100))+5);
				person[i].setweightonMars((double)weightM/100);
				
				list.human.add(person[i]);
			}
			
			for(int i = 0; i < list.human.size(); i++) {
				
				System.out.println("\n\n");
				System.out.println("Weight on Earth: " + list.human.get(i).getweightonEarth() + "Kg");
				System.out.println("Weight on Mars: " + list.human.get(i).getweightonMars() + "Kg");
				
			}
			sc.close();
	}
}
