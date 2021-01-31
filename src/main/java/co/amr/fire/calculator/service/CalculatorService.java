package co.amr.fire.calculator.service;

import java.rmi.server.ExportException;

import org.springframework.stereotype.Service;

import co.amr.fire.calculator.bean.CalculatorBean;

@Service
public class CalculatorService {

    public String doCalculation(CalculatorBean bean) {
        if (bean != null && bean.getFirstValue() != null && bean.getOperation() != null
                && bean.getSecondValue() != null) {
            switch (bean.getOperation()) {
                case "add":
                    return performAddOpeation(bean);
                case "sub":
                    return performSubOpeation(bean);
                case "mul":
                    return performMulOpeation(bean);
                case "div":
                    return performDivOpeation(bean);
                default:
                    return "Invalid Operation";

            }
        } else {
            return "Please provide the all parameters";
        }
    }

    private String performAddOpeation(CalculatorBean bean) {
        try {
            return (Double.parseDouble(bean.getFirstValue()) + Double.parseDouble(bean.getSecondValue())) + "";
        } catch (Exception e) {
            return "Please provide numeric values";
        }
    }

    private String performSubOpeation(CalculatorBean bean) {
        try {
            return (Double.parseDouble(bean.getFirstValue()) - Double.parseDouble(bean.getSecondValue())) + "";
        } catch (Exception e) {
            return "Please provide numeric values";
        }
    }

    private String performMulOpeation(CalculatorBean bean) {
        try {
            return (Double.parseDouble(bean.getFirstValue()) * Double.parseDouble(bean.getSecondValue())) + "";
        } catch (Exception e) {
            return "Please provide numeric values";
        }
    }

    private String performDivOpeation(CalculatorBean bean) {
        try {
            return (Double.parseDouble(bean.getFirstValue()) / Double.parseDouble(bean.getSecondValue())) + "";
        } catch (Exception e) {
            return "Please provide numeric values";
        }
    }

}
