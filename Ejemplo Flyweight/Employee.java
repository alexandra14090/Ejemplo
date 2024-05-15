public class Employee {
    private String name;
    private double salary;
    private String email;
    private String personalPhone;
    private String employeeId;
    private EmployeeType employeeType;

    public Employee(String name, double salary, String email, String personalPhone, String employeeId, EmployeeType employeeType) {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.personalPhone = personalPhone;
        this.employeeId = employeeId;
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(name).append("\n");
        builder.append("Salary: ").append(salary).append("\n");
        builder.append("Email: ").append(email).append("\n");
        builder.append("Personal Phone: ").append(personalPhone).append("\n");
        builder.append("Employee ID: ").append(employeeId).append("\n");
        builder.append("Employee Type:\n").append(employeeType.toStringFormatted()); 
        return builder.toString();
    }
}
