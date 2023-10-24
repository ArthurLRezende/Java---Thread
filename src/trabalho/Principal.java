package trabalho;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	
	public static void main (String []args) {
		
		
		Random random = new Random();
		
		int [][]matriz = new int[5][5];
		
		
		for(int i = 0; i<5; i++) {
			for(int o = 0; o<5;o++) {
				matriz[i][o] = random.nextInt(100);
			}
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println();
			for(int o = 0; o<5;o++) {
				System.out.print(matriz[i][o]+"\t");
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		int var;
		
		do {
			
			System.out.println("\n- Insira 1 para calcular a media da matriz:\n"
					+ "- Insira 2 para calcular a mediana da matriz: \n"
					+ "- Insira 3 para exibir o maior e menor valor da matriz:\n"
					+ "- Insira 4 para exibir a soma dos valores pares da matriz:\n"
					+ "- Insira 5 para exibir quando numeros primos estão presentes na matriz:\n"
					+ "- Insira 6 para exibir a matriz de forma ascendente:\n"
					+ "- Insira 0 para sair");
			
			var = scan.nextInt();
			
			switch(var) {
				case 1:
					Media thread1 = new Media(1, matriz);
					thread1.start();
					Media thread2 = new Media(2, matriz);
					thread2.start();
					Media thread3 = new Media(3, matriz);
					thread3.start();
					break;
				case 2:
					Mediana thread4 = new Mediana(1, matriz);
					thread4.start();
					Mediana thread5 = new Mediana(2, matriz);
					//thread5.start();
					Mediana thread6 = new Mediana(3, matriz);
					//thread6.start();	
					break;
				case 3:
					MaiorMenor thread7 = new MaiorMenor(1, matriz);
					thread7.start();
					MaiorMenor thread8 = new MaiorMenor(2, matriz);
					thread8.start();
					MaiorMenor thread9 = new MaiorMenor(3, matriz);
					thread9.start();			
					break;
				case 4:
					Pares thread10 = new Pares(1, matriz);
					thread10.start();
					Pares thread11 = new Pares(2, matriz);
					thread11.start();
					Pares thread12 = new Pares(3, matriz);
					thread12.start();
					break;
				case 5:
					Primos thread13 = new Primos(1, matriz);
					thread13.start();
					Primos thread14 = new Primos(2, matriz);
					thread14.start();
					Primos thread15 = new Primos(3, matriz);
					thread15.start();
					break;
				case 6:
					System.out.println("Ze da manga");
					break;
				case 0:
					System.out.println("Sistema finalizado!");
					break;
				default:
					System.out.println("Porfavor, insira um valor válido\n");
					
			}
			
			
		}while(var != 0 );
		

	}
	
	
}
