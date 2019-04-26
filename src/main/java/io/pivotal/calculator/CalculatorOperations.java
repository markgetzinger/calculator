package io.pivotal.calculator;

public class CalculatorOperations{
    public CalculatorOperations() {
    }

    public Double numberAddition(String numOne, String numTwo) {
        return Double.valueOf(numOne)+Double.valueOf(numTwo);
    }

    public Double numberSubtraction(String numOne, String numTwo) {
        return Double.valueOf(numOne)-Double.valueOf(numTwo);
    }

    public Double numberMultiplication(String numOne, String numTwo) {
        return Double.valueOf(numOne)*Double.valueOf(numTwo);

    }

    public Double numberDivision(String numOne, String numTwo) {
        return Double.valueOf(numOne)/Double.valueOf(numTwo);

    }

    public Values doMath(Values values) {
        System.out.println("operation is :"+values.getOperation()+"ops: "+ operationValidation(values.getOperation())+"1: "+  isNumeric(values.getNumOne()) +"2: "+  isNumeric(values.getNumTwo()));
        if(operationValidation(values.getOperation()) && isNumeric(values.getNumOne()) && isNumeric(values.getNumTwo())){
            switch (values.getOperation()) {
                case "+":
                    values.setResult(String.valueOf(numberAddition(values.getNumOne(),values.getNumTwo())));
                    break;
                case "/":
                    values.setResult(String.valueOf(numberDivision(values.getNumOne(),values.getNumTwo())));
                    break;
                case "-":
                    values.setResult(String.valueOf(numberSubtraction(values.getNumOne(),values.getNumTwo())));
                    break;
                case "*":
                    values.setResult(String.valueOf(numberMultiplication(values.getNumOne(),values.getNumTwo())));
                    break;
                default:
                    values.setResult("You shouldn't be here");
            }
            return values;
        }
        values.setResult("Invalid Input");
        return values;

    }

    public boolean operationValidation(String ops) {
        return ("+".equals(ops)|| "-".equals(ops) || "/".equals(ops) || "*".equals(ops) || ops == "*");
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
