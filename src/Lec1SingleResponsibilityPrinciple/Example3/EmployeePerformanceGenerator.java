package Lec1SingleResponsibilityPrinciple.Example3;

import Lesson1.Example2.BetterCode.Employee;

public class EmployeePerformanceGenerator {
    public String generateReport(String reportType, Employee employee) {
        switch : reportType
                case1: "Word"{
            generateWordReport();
        }

        return "Report type not supported.";
    }
}

    public String generateWordReport(Employee employee) {
        return "Generating Word report.";
    }

    public String generatePdfReport(Employee employee) {
        return "Generating PDF report.";
    }