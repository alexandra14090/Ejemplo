public class EmployeeType {
    private String role;
    private String department;
    private String benefits;
    private String officeAddress;
    private String officePhone;
    private String workHours;
    private String contractType;
    private String vacationPolicy;
    private String trainingPlans;
    private String remotePolicy;
    private String lifeInsurance;
    private String pensionPlan;
    private String startDate;
    private String holidays;

    public EmployeeType(String role, String department, String benefits, String officeAddress, String officePhone,
                        String workHours, String contractType, String vacationPolicy, String trainingPlans,
                        String remotePolicy, String lifeInsurance, String pensionPlan, String startDate, String holidays) {
        this.role = role;
        this.department = department;
        this.benefits = benefits;
        this.officeAddress = officeAddress;
        this.officePhone = officePhone;
        this.workHours = workHours;
        this.contractType = contractType;
        this.vacationPolicy = vacationPolicy;
        this.trainingPlans = trainingPlans;
        this.remotePolicy = remotePolicy;
        this.lifeInsurance = lifeInsurance;
        this.pensionPlan = pensionPlan;
        this.startDate = startDate;
        this.holidays = holidays;
    }

    public String toStringFormatted() {
        StringBuilder builder = new StringBuilder();
        builder.append("Role: ").append(role).append("\n");
        builder.append("Department: ").append(department).append("\n");
        builder.append("Benefits: ").append(benefits).append("\n");
        builder.append("Office Address: ").append(officeAddress).append("\n");
        builder.append("Office Phone: ").append(officePhone).append("\n");
        builder.append("Work Hours: ").append(workHours).append("\n");
        builder.append("Contract Type: ").append(contractType).append("\n");
        builder.append("Vacation Policy: ").append(vacationPolicy).append("\n");
        builder.append("Training Plans: ").append(trainingPlans).append("\n");
        builder.append("Remote Policy: ").append(remotePolicy).append("\n");
        builder.append("Life Insurance: ").append(lifeInsurance).append("\n");
        builder.append("Pension Plan: ").append(pensionPlan).append("\n");
        builder.append("Start Date: ").append(startDate).append("\n");
        builder.append("Holidays: ").append(holidays).append("\n");
        return builder.toString();
    }
}