package controller;

public class DivisaoControle {

	public DivisaoControle(){
		super();
	}
	
	public int Divisao(int dividendo, int divisor) {
		//Condição de Parada -> Quando o didendo é menor que o divisor, pois é a partir disso que recebemos o resto da operação
		if (dividendo<divisor)
		{
			return dividendo;
		}
		else 
		{
			//A função é chamada realizando a subtração do dividendo pelo divisor, realizando um passo da divisão
			return Divisao((dividendo-divisor), divisor);
		}
	}
}
