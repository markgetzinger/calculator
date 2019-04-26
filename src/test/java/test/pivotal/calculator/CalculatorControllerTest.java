package test.pivotal.calculator;


import io.pivotal.calculator.CalculatorController;
import io.pivotal.calculator.CalculatorInterfaceOperations;
import io.pivotal.calculator.CalculatorOperations;
import io.pivotal.calculator.Values;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class CalculatorControllerTest {
    private CalculatorOperations calculatorOperations;
    private CalculatorInterfaceOperations calcOperations;
    private CalculatorController controller;

    @Before
    public void setUp() throws Exception {
        //calculatorOperations = new CalculatorOperations();
        //MeterRegistry meterRegistry = mock(MeterRegistry.class);

        calcOperations = mock(CalculatorInterfaceOperations.class);
        //controller = new CalculatorController(calcOperations);


        //controller = new CalculatorController(calcOperations);
    }
    @Test
    public void testIsNumeric() throws Exception {
        String aNumber = "0.5";
        System.out.println(calculatorOperations.isNumeric(aNumber));
        assertTrue(calculatorOperations.isNumeric(aNumber));
        System.out.println(aNumber);
        aNumber = "cat";
        assertFalse(calculatorOperations.isNumeric(aNumber));
        System.out.println(aNumber);
        aNumber = "0.0.0";
        assertFalse(calculatorOperations.isNumeric(aNumber));
        System.out.println(aNumber);
        aNumber = "&*#@";
        assertFalse(calculatorOperations.isNumeric(aNumber));
        System.out.println(aNumber);
        aNumber = "5";
        assertTrue(calculatorOperations.isNumeric(aNumber));
        System.out.println(aNumber);
        aNumber = "";
        assertFalse(calculatorOperations.isNumeric(aNumber));
        System.out.println(aNumber);
    }

    @Test
    public void testOperationIsValid() throws Exception {
        String operation = "+";
        assertTrue(calculatorOperations.operationValidation(operation));
        operation = "cat";
        assertFalse(calculatorOperations.operationValidation(operation));
        operation = "4529";
        assertFalse(calculatorOperations.operationValidation(operation));
        operation = "";
        assertFalse(calculatorOperations.operationValidation(operation));
        operation = "-";
        assertTrue(calculatorOperations.operationValidation(operation));
        operation = "*";
        assertTrue(calculatorOperations.operationValidation(operation));
        operation = "/";
        assertTrue(calculatorOperations.operationValidation(operation));
    }


    @Test
    public void testValueAddition() throws Exception {
        String numOne = "5.3";
        String numTwo = "2.3";
        String operation = "+";
        Values values = new Values(numOne,numTwo,operation);

    }


}
