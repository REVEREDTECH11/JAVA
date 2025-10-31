public class WaterBottle {
    private double height; // Height in inches
    private double radius; // Radius in inches

    // Default constructor initializes with predefined values
    public WaterBottle() {
        this.height = 10.8;
        this.radius = 1.25;
    }

    // Convenience constructor with custom values
    public WaterBottle(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    // Accessors
    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    // Mutators with proper validation
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 12.0; // Ensuring negative height is corrected to 12.0
        }
    }

    public void setRadius(double radius) {
        if (radius > 2.0) { // Ensure radius does not exceed 2.0
            this.radius = 2.0;
            this.height = 12.0; // Adjust height if radius was too large
        } else if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 2.0; // Handling negative radius case
        }
    }
}
