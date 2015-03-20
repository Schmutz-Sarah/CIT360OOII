public class MVCCalculator {

    public static void main(String[] args) {

    CalculatorView theView = new CalculatorView();

    CalculatorModel theModel = new CalculatorModel();
        
        CalculatorController2 theController = new CalculatorController2(theView,theModel);
        
        theView.setVisible(true);
    }
}
