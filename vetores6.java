package exercicioJava;

import java.util.Scanner;

public class vetores6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0,somaPar=0,somaImpar=0;
		int [] numero = new int[6];
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<=5;x++) {
			System.out.println("Digite um número: ");
			numero[x] = leia.nextInt();
		}
		//System.out.println("Resultado");
		
		for(int x=0;x<=5;x++) {
			if(numero[x]% 2==0) {
				somaPar = somaPar +numero[x];
				System.out.println(numero[x]);
				System.out.println("Soma dos números pares: "+somaPar);

			}
			else {
				somaImpar = somaImpar+numero[x];
				System.out.println(numero[x]);
				System.out.println("Soma dos números impares: "+somaImpar);


		
			}
		
		}
	}


}