
public class Calculadora {

	public int suma(int sum1, int sum2) {
		return sum1 + sum2;
	}

	public int resta(int min, int sus) {
		return min - sus;
	}

	public int multiplica(int num1, int num2) {
		return num1*num2;
	}

	public int divide(int num1, int num2) {
		if (num2==0) throw new IllegalArgumentException();
		return num1/num2;
	}
}
