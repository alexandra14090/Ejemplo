import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String, EmployeeType> employeeTypes = new HashMap<>();

    public static EmployeeType getEmployeeType(String role, String department, String benefits, String officeAddress, String officePhone,
                                               String workHours, String contractType, String vacationPolicy, String trainingPlans,
                                               String remotePolicy, String lifeInsurance, String pensionPlan, String startDate, String holidays) {
        String key = role + department + benefits + officeAddress + officePhone + workHours + contractType + vacationPolicy + 
                     trainingPlans + remotePolicy + lifeInsurance + pensionPlan + startDate + holidays;
        if (!employeeTypes.containsKey(key)) {
            employeeTypes.put(key, new EmployeeType(role, department, benefits, officeAddress, officePhone, workHours, contractType,
                                                    vacationPolicy, trainingPlans, remotePolicy, lifeInsurance, pensionPlan, startDate, holidays));
        }
        return employeeTypes.get(key);
    }
}
