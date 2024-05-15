public class FlyweightPatternDemo {
    public static void main(String[] args) {
        // Creación de tipos de empleados compartidos
        EmployeeType devType = EmployeeFactory.getEmployeeType(
            "Developer", "IT", "Health, 401k", "123 Tech Street", "555-1234", "9 AM - 5 PM", "Full-Time",
            "15 days", "Python Training, Leadership Course", "Allowed 2 days/week", "Covered", "Standard 5%", "2020-01-01", "New Year's Day, Christmas"
        );

        // Creación de un empleado
        Employee emp1 = new Employee("Alice", 70000, "alice@example.com", "555-0001", "E001", devType);

        // Mostrar información del empleado
        System.out.println(emp1);

        // Obtener el tipo de empleado de emp1 directamente de la EmployeeFactory
        EmployeeType emp1Type = devType; // Utiliza el tipo de empleado que ya se ha creado
        System.out.println("Employee Type of emp1: " + emp1Type);
    }
}
