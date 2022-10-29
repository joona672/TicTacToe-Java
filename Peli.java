
import java.util.Arrays;
import java.util.Scanner;

public class Peli {
	int[] ruudukko = new int[10];
	int[] ruudukko1 = {-2,0,0,0,0,0,0,0,0,0};
	int kierros_nro = 0;
	int ruutu;
	Scanner lukija = new Scanner(System.in);

	
	
	
	
	public void tulostaRuudukko() {
		System.out.print("1 2 3    ");
		int[] Ekaosa = Arrays.copyOfRange(ruudukko1, 1, 4);
		int[] Tokaosa = Arrays.copyOfRange(ruudukko1, 4, 7);
		int[] Kolmasosa = Arrays.copyOfRange(ruudukko1, 7, 10);
		
		for(int i: Ekaosa) {
			if(i == 0)
				System.out.print("_|");
			else if(i == 1)
				System.out.print("O ");
			else
				System.out.print("X ");
		}
		System.out.println();
		
		System.out.print("4 5 6    ");
		for(int i: Tokaosa) {
			if(i == 0)
				System.out.print("_|");
			else if(i == 1)
				System.out.print("O ");
			else
				System.out.print("X ");
		}
		System.out.println();
		
		System.out.print("7 8 9    ");
		for(int i: Kolmasosa) {
			
			if(i == 0)
				System.out.printf("_|");
			else if(i == 1)
				System.out.print("O ");
			else
				System.out.print("X ");
		}
		System.out.println("\n");
	}
	
	public void LuePelaajalta() {
		if(kierros_nro % 2 == 0) {
			System.out.println("Pelaajan X vuoro");
		} else {
			System.out.println("Pelaajan O vuoro");
		}
		
		System.out.println("Syötä ruudun numero: ");
		ruutu = Integer.valueOf(lukija.nextLine());
		if(ruudukko1[ruutu] == 0) {
			if(kierros_nro % 2 == 0) {
				ruudukko1[ruutu] = -1;
				
			} else {
				ruudukko1[ruutu] = 1;
			}
		} else {
			System.out.println("Laiton siirto! Yritä uudelleen!");
			LuePelaajalta();
		}
		//tulostaRuudukko();
	}
	
	public void Kierros() {
		
		for(int i = 0; i < 10; i++) {
			tulostaRuudukko();
			LuePelaajalta();
			
			if(kierros_nro >= 4) {
				if(ruudukko1[1] == ruudukko1[2] && ruudukko1[3] == ruudukko1[1] && ruudukko1[1] != 0) {
					if(kierros_nro % 2 == 0) {
						System.out.println("Peli päättyi! X voitti!");
					} else {
						System.out.println("Peli päättyi! O voitti!");
					}
					break;
				} else if(ruudukko1[4] == ruudukko1[5] && ruudukko1[6] == ruudukko1[4] && ruudukko1[4] != 0) {
					if(kierros_nro % 2 == 0) {
						System.out.println("Peli päättyi! X voitti!");
					} else {
						System.out.println("Peli päättyi! O voitti!");
					}
					break;
				} else if(ruudukko1[7] == ruudukko1[8] && ruudukko1[9] == ruudukko1[7] && ruudukko1[7] != 0) {
					if(kierros_nro % 2 == 0) {
						System.out.println("Peli päättyi! X voitti!");
					} else {
						System.out.println("Peli päättyi! O voitti!");
					}
					break;
					
				} else if(ruudukko1[8] == ruudukko1[5] && ruudukko1[2] == ruudukko1[8] && ruudukko1[8] != 0) {
					if(kierros_nro % 2 == 0) {
						System.out.println("Peli päättyi! X voitti!");
					} else {
						System.out.println("Peli päättyi! O voitti!");
					}
					break;
					
				} else if(ruudukko1[9] == ruudukko1[6] && ruudukko1[3] == ruudukko1[9] && ruudukko1[9] != 0) {
					if(kierros_nro % 2 == 0) {
						System.out.println("Peli päättyi! X voitti!");
					} else {
						System.out.println("Peli päättyi! O voitti!");
					}
					break;
				} else if(ruudukko1[9] == ruudukko1[1] && ruudukko1[5] == ruudukko1[9] && ruudukko1[9] != 0) {
					if(kierros_nro % 2 == 0) {
						System.out.println("Peli päättyi! X voitti!");
					} else {
						System.out.println("Peli päättyi! O voitti!");
					}
					break;
				} else if(ruudukko1[7] == ruudukko1[5] && ruudukko1[3] == ruudukko1[7] && ruudukko1[7] != 0) {
					if(kierros_nro % 2 == 0) {
						System.out.println("Peli päättyi! X voitti!");
					} else {
						System.out.println("Peli päättyi! O voitti!");
					}
					break;
				}  
				if(kierros_nro == 8) {
					System.out.println("Peli päättyi! \nTasapeli");
					break;
				} else {
					
					System.out.println("                    Kierros numero: " + kierros_nro);
					kierros_nro++;
					continue;
					
				}
			}
			System.out.println("                    Kierros numero: " + kierros_nro);
			kierros_nro++;
		}
	}
	
}
