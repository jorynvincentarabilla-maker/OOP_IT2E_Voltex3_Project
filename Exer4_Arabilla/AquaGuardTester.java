public class AquaGuardTester {
    public static void main(String[] args) {

        System.out.println("=== AQUAGUARD SYSTEM ===\n");
        System.out.println("Goal 14: Conserve and sustainably use the oceans, seas and marine resources\n");

        System.out.println("=== USER MANAGEMENT ===");
        User user1 = new User(1, "Alice");
        User admin = new Admin(2, "Bob", 5);
        User researcher = new Researcher(3, "Charlie", "Marine Biology");

        user1.displayInfo();
        admin.displayInfo();
        researcher.displayInfo();

        System.out.println();
        user1.displayInfo("Monitoring system active");

        System.out.println("\n=== MARINE RESOURCES ===");
        MarineResource resource1 = new Fish("Tuna", 120, "Bluefin");
        MarineResource resource2 = new Coral("Reef Coral", 50, "Staghorn");
        MarineResource resource3 = new WaterQuality("Seawater Sample", 1, 7.9);

        resource1.describeResource();
        resource2.describeResource();
        resource3.describeResource();

        System.out.println("\n=== POLYMORPHISM IN ACTION ===");
        MarineResource[] resources = { resource1, resource2, resource3 };
        for (MarineResource mr : resources) {
            mr.describeResource();
        }

        System.out.println("\n=== END OF SIMULATION ===");
    }
}