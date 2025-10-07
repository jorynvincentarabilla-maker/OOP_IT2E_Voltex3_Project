public class WaterQuality extends MarineResource {
    private double phLevel;

    public WaterQuality(String name, int quantity, double phLevel) {
        super(name, quantity);
        this.phLevel = phLevel;
    }

    public void describeResource() {
        System.out.println("Water Quality: " + getName() + ", pH Level: " + phLevel);
    }
}