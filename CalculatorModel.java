public class CalculatorModel {

// Holds the value of the sum of the numbers
// entered in the view
private int calculationValue;
private int calculationValueMinus;
public void addTwoNumbers(int firstNumber, int secondNumber){
calculationValue = firstNumber + secondNumber;
}
public void minusTwoNumbers(int firstNumber, int secondNumber){
calculationValueMinus = firstNumber - secondNumber;
}
public int getCalculationValue(){
return calculationValue;
}
public int getCalculationValueForMinus(){
return calculationValue;
}
}
