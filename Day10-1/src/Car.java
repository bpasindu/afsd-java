public class Car extends Vehicle{
    private String color;
    private int noOfGears;

    public void horning(){
        System.out.println("beep beep.........");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
}
