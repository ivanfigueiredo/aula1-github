package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		int idade;
		
		idade = input.nextInt();
		input.nextLine();
		nome = input.nextLine();
		
		if (idade > 18) {
			System.out.printf("%s tem %d. Portanto, maior de 18 nos.",nome, idade);
		}else {
			System.out.printf("%s tem %d. Portanto, menor de 18 anos.",nome, idade);
		}
		
		input.close();

	}

}
