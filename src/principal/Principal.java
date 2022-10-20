package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nome = "", CPF = "", Identidade = "", Endereço = "", Telefone = "", Idade = "", Altura = "", Peso = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo!!");

		System.out.println("Insira o Seu nome:");
		nome = entrada.next();

		System.out.printf("Seu nome é %s, Obrigado Por Testar!", nome);

		for (int i = 0; i != 1;) {

			System.out.println("Informe o que deseja fazer:");
			System.out.println("Informe 1 para SAIR: ");
			System.out.println("Informe 2 para CPF: ");
			System.out.println("Informe 3 para Identidade: ");
			System.out.println("Informe 4 para Endereço: ");
			System.out.println("Informe 5 para Telefone: ");
			System.out.println("Informe 6 para Idade: ");
			System.out.println("Informe 7 para Altura: ");
			System.out.println("Informe 8 para Peso: ");
			try {
				i = entrada.nextInt();

				if (i == 2) {
					System.out.println("Informe seu CPF: ");
					CPF = entrada.next();
				} else if (i == 3) {
					System.out.println("Informe sua Identidade: ");
					Identidade = entrada.next();
				} else if (i == 4) {
					System.out.println("Informe seu Endereço: ");
					Endereço = entrada.next();
				} else if (i == 5) {
					System.out.println("Informe seu Telefone: ");
					Telefone = entrada.next();
				} else if (i == 6) {
					System.out.println("Informe sua Idade: ");
					Idade = entrada.next();
				} else if (i == 7) {
					System.out.println("Informe sua Altura: ");
					Altura = entrada.next();
				} else if (i == 8) {
					System.out.println("Informe seu Peso: ");
					Peso = entrada.next();
				}

			} catch (Exception n) {
				i = 2;
				System.out.println("Digite um número");
				i = entrada.nextInt();

			} finally {
				entrada.close();
			}

		}

		System.out.printf("Fala: %s, seu CPF é: %s, sua Identidade é: %s, seu Endereço é: %s.", nome, CPF, Identidade,
				Endereço);
		System.out.printf("Seu Telefone é: %s, sua Idade é: %s, sua Altura é: %s, seu Peso é: %s.", Telefone, Idade,
				Altura, Peso);

	}

}
