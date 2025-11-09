public class Van extends Vehicle{
    private boolean isHavePowerMirror;
    private double price;

    public void horning(){
        System.out.println("peep peep.........");
    }

    public boolean isHavePowerMirror() {
        return isHavePowerMirror;
    }

    public void setHavePowerMirror(boolean havePowerMirror) {
        isHavePowerMirror = havePowerMirror;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
