public class Fish extends MarineResource {
    private String species;

    public Fish(String name, int quantity, String species) {
        super(name, quantity);
        this.species = species;
    }

    public void describeResource() {
        System.out.println("Fish: " + getName() + ", Species: " + species + ", Quantity: " + getQuantity());
    }
}