public class Manager extends Employee {
    private int managerAge;
    private String eduQualification;

    public Manager(int index) {
        employeeNo = index;
    }

    public void duty() {
        System.out.println("Manager duty " + employeeNo);
    }

    public int getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(int managerAge) {
        this.managerAge = managerAge;
    }

    public String getEduQualification() {
        return eduQualification;
    }

    public void setEduQualification(String eduQualification) {
        this.eduQualification = eduQualification;
    }
}
