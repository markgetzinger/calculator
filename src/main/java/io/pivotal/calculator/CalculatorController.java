package io.pivotal.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }



//    @GetMapping("/add")
//    public String addition(
//            @RequestParam(value="param1", required=true) String param1,
//            @RequestParam(value="param2", required=true) String param2){
//        return String.valueOf(Double.valueOf(param1)+Double.valueOf(param2));
//    }
//    @GetMapping("/div")
//    public String division(
//            @RequestParam(value="param1", required=true) String param1,
//            @RequestParam(value="param2", required=true) String param2){
//        return String.valueOf(Double.valueOf(param1)/Double.valueOf(param2));
//    }
//    @GetMapping("/sub")
//    public String subtraction(
//            @RequestParam(value="param1", required=true) String param1,
//            @RequestParam(value="param2", required=true) String param2){
//        return String.valueOf(Double.valueOf(param1)-Double.valueOf(param2));
//    }
//    @GetMapping("/mult")
//    public String multiplication(
//            @RequestParam(value="param1", required=true) String param1,
//            @RequestParam(value="param2", required=true) String param2){
//        return String.valueOf(Double.valueOf(param1)*Double.valueOf(param2));
//    }

}
