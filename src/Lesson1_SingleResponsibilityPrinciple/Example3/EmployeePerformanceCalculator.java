package src.Lesson1_SingleResponsibilityPrinciple.Example3;
import src.Lesson1_SingleResponsibilityPrinciple.Example2.BetterCode.Employee;
public class EmployeePerformanceCalculator {
    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}

// this code is fine from POV of SRP