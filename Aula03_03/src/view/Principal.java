package view;

import java.util.Scanner;

import negocio.Carro;
import negocio.Moto;
import negocio.Veiculo;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Escolha: \n"
				+ "1- Carro \n"
				+ "2- Moto");
		
		try (Scanner sc = new Scanner(System.in)) {
			int escolha = sc.nextInt();
			
			System.out.println("Informe o modelo do veículo: ");
			String modelo = sc.next();
			System.out.println("Informe o fabricante do veículo: ");
			String fabricante = sc.next();
			System.out.println("Informe o ano do veículo: ");
			int ano = sc.nextInt();
			
			Veiculo veiculo = null;
			
			if(escolha == 1) {
				System.out.println("Informe a qtd de portas do carro: ");
				int qtdePortas = sc.nextInt();
				
				veiculo = new Carro(modelo, fabricante, ano, qtdePortas);
			} else if (escolha == 2) {
				veiculo = new Moto(modelo, fabricante, ano);
			} else {
				System.out.println("Opção Inválida.");
			}
			
			veiculo.acelerar();
			veiculo.acelerar();
			System.out.println(veiculo.informarSituacao());
			
		}	
	}
}

