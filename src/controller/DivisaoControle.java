package controller;

public class DivisaoControle {

	public DivisaoControle(){
		super();
	}
	
	public int Divisao(int dividendo, int divisor) {
		//Condi��o de Parada -> Quando o didendo � menor que o divisor, pois � a partir disso que recebemos o resto da opera��o
		if (dividendo<divisor)
		{
			return dividendo;
		}
		else 
		{
			//A fun��o � chamada realizando a subtra��o do dividendo pelo divisor, realizando um passo da divis�o
			return Divisao((dividendo-divisor), divisor);
		}
	}
}
