// LunchBag class represents a lunch bag with dimensions and a WaterBottle
public class LunchBag {
    private double length;
    private double width;
    private double height;
    private WaterBottle waterBottle;

    // Default constructor initializes to given default dimensions and a default WaterBottle
    public LunchBag() {
        this.length = 11.2;
        this.width = 6.1;
        this.height = 7.9;
        this.waterBottle = new WaterBottle();
    }

    // Convenience constructor with custom values
    public LunchBag(double length, double width, double height, WaterBottle waterBottle) {
        setLength(length); // Ensures proper validation
        setWidth(width);
        setHeight(height);
        setWaterBottle(waterBottle);
    }

    // Accessors
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public WaterBottle getWaterBottle() {
        return waterBottle;
    }

    // Mutators (Ensure values are set correctly)
    public void setLength(double length) {
        this.length = (length > 0) ? length : 11.2;
    }

    public void setWidth(double width) {
        this.width = (width > 0) ? width : 6.1;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : 7.9;
    }

    public void setWaterBottle(WaterBottle waterBottle) {
        if (waterBottle != null) {
            this.waterBottle = waterBottle;
        } else {
            this.waterBottle = new WaterBottle();
        }
    }
}
