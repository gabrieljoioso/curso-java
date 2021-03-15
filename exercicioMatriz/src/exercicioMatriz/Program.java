package exercicioMatriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; // instancia a matriz na memoria
		
		for (int i=0; i<mat.length; i++) {  	// percorre quantidade de linhas = mat.length
			for (int j=0; j<mat[i].length; j++) { 	// quantidade de colunas, tamanho do vetor correspondente a aquela linha que também é o tamanho da coluna, exemplo: 3x3, 4x4, 5x5.
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " "); // printar linha i e coluna i, a diagonal é a posição da linha igual a coluna.
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {			// percorre a matriz(linha).
			for (int j=0; j<mat[i].length; j++) {		// percorre a matriz(coluna).
				if (mat[i][j] < 0 ) { 		// se o elemento da matriz na linha i e coluna j for < 0 faz a variavel count ser incrementada.
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}

}
