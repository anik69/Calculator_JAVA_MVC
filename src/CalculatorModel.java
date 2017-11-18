public class CalculatorModel {
	
	private int addCalculationValue;
	private int subtractCalculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		addCalculationValue = firstNumber + secondNumber;
	}
	
	public void subtractTwoNumbers(int firstNumber, int secondNumber) {
		subtractCalculationValue = firstNumber - secondNumber;
	}
	
	public int getAddCalculationValue() {
		return addCalculationValue;
	}
	
	public int getSubtractCalculationValue() {
		return subtractCalculationValue;
	}

}
