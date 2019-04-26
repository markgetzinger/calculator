package io.pivotal.calculator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
    CalculatorOperations calcOps = new CalculatorOperations();

    @GetMapping("/")
    public String calcHome(Model model) {
        model.addAttribute("calc", new Values());
        return "calc";
    }

    @PostMapping("/calc")
    public String calcResults(@ModelAttribute Values values) {
        values = calcOps.doMath(values);
            return "result";
    }


}
