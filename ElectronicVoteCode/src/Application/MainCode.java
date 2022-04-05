package Application;

import java.util.Scanner;

public class MainCode {

	public static void main(String[] args) {
		
		int o = 0;
		int o1 = 0;
		int o2 = 0;
		int o3 = 0;
		int o4 = 0;
		int white = 0;
		int nll = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(":::::::::ELECTRONIC VOTE MANANGER 1.0::::::::::::");
		System.out.print("Options to choose:1 - Jair Bolsonaro,2 - Lula,3 - Daciolo,4 - Fidelix,5 - White Vote,6 -Null vote ");
		System.out.println(" ");
		System.out.print("Enter your vote: ");
		 o = input.nextInt();
		System.out.println("Thanks for your vote!");
		System.out.println("=================================================");
		System.out.println(" ");
		
		while(o !=0) {
			
			System.out.println(" ");
			System.out.println("=================================================");
			System.out.println(":::::::::ELECTRONIC VOTE MANANGER 1.0::::::::::::");
			System.out.print("Options to choose:1 - Jair Bolsonaro,2 - Lula,3 - Daciolo,4 - Fidelix,5 - White Vote,6 -Null vote ");
			System.out.println(" ");
			System.out.print("Enter your vote: ");
			 o = input.nextInt();
			System.out.println("Thanks for your vote!");
			System.out.println("=================================================");
			System.out.println(" ");
			
			if(o == 1) {
				
				o1 ++;
				
				
			}
			else if(o == 2) {
				
				o2++;
			}
			else if(o == 3) {
				
				o3++;
				
			}
			else if(o == 4) {
				
				o4++;
				
			}
			else if(o == 5) {
				
				white++;
				
			}
			else if(o == 6) {
				
				nll++;
				
			}
			
			
		}
		
		if(o1>o2 && o1>o3 || o1>o4) {
			System.out.println(" ");
			System.out.println("Jair Bolsonaro won elections!");
			System.out.println(" ");
			
		}
		else if(o2>o1 && o2>o3 || o2>o4) {
			
			System.out.println(" ");
			System.out.println("Lula won elections!");
			System.out.println(" ");
		}
		else if(o3>o1 && o3>o2 || o3>o4) {
			
			System.out.println(" ");
			System.out.println("Daciolo won elections!");
			System.out.println(" ");
		}
		else if(o4>o1 && o4>o2 || o4>o3) {
			
			System.out.println(" ");
			System.out.println("Fidelix won elections!");
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println("=================STATISTICS======================");
		System.out.println("Votes for Bolsonaro: "+o1);
		System.out.println("Votes for Lula: "+o2);
		System.out.println("Votes for Daciolo: "+o3);
		System.out.println("Votes for Fidelix: "+o4);
		System.out.println("White votes: "+white);
		System.out.println("Null votes: "+nll);
		System.out.println(" ");
	}

}
