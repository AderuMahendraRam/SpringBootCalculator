package co.amr.fire.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String root() {
        String result = "Hello Application is up";
        return result;
    }

    @GetMapping("/doCalculation/{firstValue}/{secondValue}")
    public String doCalculation(@PathVariable String firstValue, @PathVariable String secondValue) {
        String result = "Please provide proper parameters for calulation";
        if (firstValue != null && secondValue != null) {
            try {
                long totalCount = Long.parseLong(firstValue) + Long.parseLong(secondValue);
                result = String.valueOf(totalCount);
            } catch (Exception e) {
                result = "Failed to perform operation";
            }
        }
        return result;
    }

}
