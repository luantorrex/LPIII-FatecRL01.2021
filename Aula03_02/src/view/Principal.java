package view;

import java.util.Scanner;
import negocio.Avaliacao;

public class Principal {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a sua nota na P1:");
			float p1 = sc.nextFloat();
			
			System.out.println("Digite a sua nota na P2:");
			float p2 = sc.nextFloat();
			
			System.out.println("Digite a sua nota na P3:");
			float p3 = sc.nextFloat();
			
			System.out.println("Digite o total de aulas:");
			int totalAulas = sc.nextInt();
			
			System.out.println("Digite o total de presencas:");
			int totalPresencas = sc.nextInt();
			
			Avaliacao poo = new Avaliacao();
			poo.calcular(p1, p2, p3);
			poo.calcularPercentual(totalAulas, totalPresencas);
			
			System.out.println(poo.getAprovado());
		}	
	}
}
