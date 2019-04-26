package io.pivotal.calculator;

public class Values {

    private String numOne;
    private String numTwo;
    private String operation;
    private String result;

    public Values(String numOne, String numTwo, String operation) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.operation = operation;
    }
    public Values() {

    }



    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public String getNumOne() {
        return numOne;
    }

    public void setNumOne(String numOne) {
        this.numOne = numOne;
    }

    public String getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(String numTwo) {
        this.numTwo = numTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }




}