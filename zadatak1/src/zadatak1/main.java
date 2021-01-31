package zadatak1;
import java.util.*;

public class main {
	
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);		
		int myCount = 0;
		int compCount = 0;
		while(true) {
			// Unos pokreta
			System.out.print("Odaberite pokret('skare', 'kamen' ili 'papir'). Za kraj igre upisite 'kraj'. ");
			String myMove = in.nextLine();
			
			// Za izlaz iz igre
			if(myMove.equals("kraj")) {
				break;
			}

			//Provjera unosa
			if(!myMove.equals("kamen") && !myMove.equals("papir") && !myMove.equals("skare")) {

				System.out.println("Unos nije ispravan!");
			
			} else {

				//Odabir pokreta racunala, random
				int rand = (int)(Math.random()*3);
				
				String opponentMove = "";
				if(rand == 0) {
					opponentMove = "kamen";
				} else if(rand == 1) {
					opponentMove = "papir";
				} else {
					opponentMove = "skare";
				}
				System.out.println("Protivnik je odabrao: " + opponentMove);
					
				//Ispis rezultata
				if(myMove.equals(opponentMove)) {
					System.out.println("Ne rijeseno! Vi: " + myCount +" Racunalo: "+ compCount);
				} else if((myMove.equals("kamen") && opponentMove.equals("skare")) || (myMove.equals("skare") && opponentMove.equals("papir")) || (myMove.equals("papir") && opponentMove.equals("kamen"))) {
					myCount ++;
					System.out.println("Pobjeda! Vi: " + myCount +" Racunalo: "+ compCount);
					
				} else {
					compCount ++;
					System.out.println("Poraz! Vi: " + myCount +" Racunalo: "+ compCount);
				}

			}

		}

		System.out.println("Hvala na igri!");

  }

}
