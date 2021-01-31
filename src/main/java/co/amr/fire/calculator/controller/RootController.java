package co.amr.fire.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.amr.fire.calculator.bean.CalculatorBean;
import co.amr.fire.calculator.service.CalculatorService;

@RestController
public class RootController {

    @Autowired
    CalculatorService service;

    @GetMapping("/")
    public String root() {
        String result = "Hello Application is up";
        return result;
    }

    @GetMapping("/doCalculation")
    public String doCalculation(CalculatorBean bean) {
        return service.doCalculation(bean);
    }

}
