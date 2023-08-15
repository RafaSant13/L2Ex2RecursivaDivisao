package view;
import controller.DivisaoControle;

public class Principal {

	public static void main(String[] args) {
		DivisaoControle DC = new DivisaoControle();
		int dividendo = 19;
		int divisor = 5;
		System.out.println("O resto da divisão é: "+DC.Divisao(dividendo, divisor));

	}

}
