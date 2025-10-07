public class MarineResource {
    private String name;
    private int quantity;

    public MarineResource(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }

    public void describeResource() {
        System.out.println("Marine Resource: " + name + " (Quantity: " + quantity + ")");
    }
}