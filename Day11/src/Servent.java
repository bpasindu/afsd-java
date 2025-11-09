public class Servent extends Employee{
    private String serventDepartment;
    private String serventAddress;

    public Servent(int index){
        employeeNo = index;
    }

    public void duty(){
        System.out.println("Servent duty" +employeeNo);
    }

    public String getServentDepartment() {
        return serventDepartment;
    }

    public void setServentDepartment(String serventDepartment) {
        this.serventDepartment = serventDepartment;
    }

    public String getServentAddress() {
        return serventAddress;
    }

    public void setServentAddress(String serventAddress) {
        this.serventAddress = serventAddress;
    }
}
