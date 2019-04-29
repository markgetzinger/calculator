package io.pivotal.calculator;

import org.springframework.ui.Model;

public interface CalculatorInterfaceOperations {

    public Double numberAddition(String numOne, String numTwo);
    public Double numberSubtraction(String numOne, String numTwo);
    public Double numberMultiplication(String numOne, String numTwo);
    public Double numberDivision(String numOne, String numTwo);
    public Values doMath(Values values);
    public boolean operationValidation(String ops);
    public boolean isNumeric(String str);

//    public String calcHome(Model model);
//    public String calcResults(Values values);

}
