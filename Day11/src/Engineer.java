public class Engineer extends Employee{
    private double engineerSalary;
    private String engineerUniversity;

    public Engineer(int index){
        employeeNo = index;
    }


    public void duty() {
        System.out.println("Engineer duty " +employeeNo );
    }

    public double getEngineerSalary() {
        return engineerSalary;
    }

    public void setEngineerSalary(double engineerSalary) {
        this.engineerSalary = engineerSalary;
    }

    public String getEngineerUniversity() {
        return engineerUniversity;
    }

    public void setEngineerUniversity(String engineerUniversity) {
        this.engineerUniversity = engineerUniversity;
    }
}
