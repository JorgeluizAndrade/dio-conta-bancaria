package edu.dio.contabanco;

import java.util.Scanner;

public class ContaTerminal {
	static public void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		String agencia = "";
		String nome = "";
		double saldo = 0;
		
		System.out.println("Olá, insira os seus dados de acorco com que é pedido");		
		
		System.out.println("\nPor favor, digite o seu nome completo: " + nome);
		
		nome = input.nextLine();		
		
		
		
		
		System.out.println("\nPor favor, digite o número da Agência: " + agencia);
		
		agencia = input.nextLine();
		
		
		System.out.println("\nPor favor, digite o número da sua conta: " + num);
		
		num = input.nextInt();
		
		
		System.out.println("\nPor favor, digite o saldo da sua conta: " + saldo);
		
		saldo = input.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e sseu saldo %.2f já está disponível para saque", nome, agencia, num, saldo);
	}
	
}
