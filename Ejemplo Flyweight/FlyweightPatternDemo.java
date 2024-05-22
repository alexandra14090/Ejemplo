/*public class FlyweightPatternDemo {
    public static void main(String[] args) {
        EmployeeType devType = EmployeeFactory.getEmployeeType(
            "Developer", "IT", "Health, 401k", "123 Tech Street", "555-1234", "9 AM - 5 PM", "Full-Time",
            "15 days", "Python Training, Leadership Course", "Allowed 2 days/week", "Covered", "Standard 5%", "2020-01-01", "New Year's Day, Christmas"
        );

        Employee emp1 = new Employee("Alice", 70000, "alice@example.com", "555-0001", "E001", devType);

        System.out.println(emp1);

        EmployeeType emp1Type = devType; 
        System.out.println("Employee Type of emp1: " + emp1Type);
    }
}*/

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        EmployeeType type1 = EmployeeFactory.getEmployeeType("Developer", "IT", "Health Insurance", "123 Main St", "555-5555",
                                                             "9 AM - 5 PM", "Full-Time", "2 weeks per year", "Ongoing Training",
                                                             "Flexible", "Yes", "401k", "2023-01-01", "10 holidays");

        EmployeeType type2 = EmployeeFactory.getEmployeeType("Developer", "IT", "Health Insurance", "123 Main St", "555-5555",
                                                             "9 AM - 5 PM", "Full-Time", "2 weeks per year", "Ongoing Training",
                                                             "Flexible", "Yes", "401k", "2023-01-01", "10 holidays");

        // type1 y type2 son la misma instancia
        System.out.println(type1 == type2); // Salida: true
    }
}
