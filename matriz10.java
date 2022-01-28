package exercicioJava;

import java.util.Scanner;

public class matriz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz = new int [3][3];
		int maior10=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<=2;x++) {
			for(int y=0;y<=2;y++) {
				System.out.println("Digite um número: ");
				matriz [x][y] = leia.nextInt();
			}
		}
			for(int x=0;x<=2;x++) {
				for(int y=0;y<=2;y++) {
					System.out.println(matriz[x][y]);
					if(matriz[x][y] > 10) 
						//maior10 = maior10 + 1
						maior10++;
				}
			}
						System.out.printf("\nNúmeros digitados maiores que 10: "+maior10);
					
					
				
				}
			
			
	}


					
					
				
				
				
		
	
	
