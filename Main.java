import java.util.Scanner;


public class Main {
	public static void main(String [] args) {
		boolean start = aloitus();
		if(start) {
			Peli peli = new Peli();
			peli.Kierros();
		} else {
			System.out.println("Peli Päättyi");
			System.exit(0);
		}
	}
	
	public static boolean aloitus() {
		
		Scanner lukija1 = new Scanner(System.in);
		
		while(true) {
			System.out.println("#### # # # # # # # # # #  #####"); 
			System.out.println("##### R i s t i n o l l a #####"); 
			System.out.println("##### # # # # # # # # # # #####"); 
 			System.out.println("Aloita peli[S]  Lopeta[E]");
			String tila = lukija1.nextLine();
			
			if(tila.toLowerCase().equals("s")) {
				return true;
			} else if(tila.toLowerCase().equals("e")){
				return false;
			}
		}
		
	}
	
	
	
	
	
}
