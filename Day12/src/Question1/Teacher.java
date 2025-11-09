package Question1;

public class Teacher {
    private String name;
    private String subject;
    private int servicePeriod;

    public void displayTeacher(Teacher teacher){
        System.out.println("==========================");
        System.out.println("Printing teacher details");
        System.out.println("Teacher name is " + teacher.getName());
        System.out.println("Teaching subject is " + teacher.getSubject());
        System.out.println("Teaching years of experience is " + teacher.getServicePeriod());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getServicePeriod() {
        return servicePeriod;
    }

    public void setServicePeriod(int servicePeriod) {
        this.servicePeriod = servicePeriod;
    }


}
