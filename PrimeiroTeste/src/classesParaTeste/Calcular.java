package classesParaTeste;

public class Calcular {

	public int sum(int num1, int num2)  {
		if((num1 < 0) || num2 < 0){
			throw new IllegalArgumentException("Não é possivel somar números negativos");
		}			
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		if((num1 < 0) || num2 < 0){
			throw new IllegalArgumentException("Não é possivel subtrair números negativos");
		}		
		return num1 - num2;
	}

	public boolean calculateMultiple(int number) {
		return number % 3 == 0;
	}		
}
