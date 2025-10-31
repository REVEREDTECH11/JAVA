public class PAssign03 {

    public static void main(String[] args) {

        //computer instances with varying video cards
        Computer c1 = new Computer();

        Computer c2 = new Computer("Dell", "Optiplex", new DiscreteVideoCard(575, 24, "PCIEx16", "8-pin"));

        Computer c3 = new Computer("Lenovo", "IdeaCentre", new IntegratedVideoCard(120, 4, 2, false));

        Computer c4 = new Computer("HP", "Omen Obelisk", new DiscreteVideoCard(150, 8, "PCIEx8", "6-pin"));

        Computer c5 = new Computer("Lenovo", "IdeaCentre", new IntegratedVideoCard(-110, 3, 2, false));


        //array of computers
        Computer[] computers = {c1, c2, c3, c4, c5};


        //method to output computer details
        OutputComputerDetails(computers);

    }


    //method to output computer details
    public static void OutputComputerDetails(Computer[] computers) {

        for (Computer computer : computers) {

            System.out.println(computer.toString());

            System.out.println();

        }

    }

}


//Computer class begins
class Computer {

    private String brand;

    private String model;

    private VideoCard videoCard;


    //constructor
    public Computer() {

        this.brand = "OEM";

        this.model = "Basic";

        this.videoCard = new IntegratedVideoCard();

    }


    //constructor with VideoCard
    public Computer(VideoCard videoCard) {

        this.brand = "OEM";

        this.model = "Basic";

        this.videoCard = videoCard;

    }


    //constructor with brand, model, and VideoCard
    public Computer(String brand, String model, VideoCard videoCard) {

        this.brand = brand;

        this.model = model;

        this.videoCard = videoCard;

    }


    //method to get computer info
    public String toString() {

        return brand + " " + model + "\nVideo Card Info:\n" + videoCard.toString();

    }


    //getters and setters
    public String getBrand() {

        return brand;

    }


    public void setBrand(String brand) {

        this.brand = brand;

    }


    public String getModel() {

        return model;

    }


    public void setModel(String model) {

        this.model = model;

    }


    public VideoCard getVideoCard() {

        return videoCard;

    }


    public void setVideoCard(VideoCard videoCard) {

        this.videoCard = videoCard;

    }

}


//VideoCard class begins
class VideoCard {

    private String type;

    private int powerRequirement;

    private int memorySize;


    //default constructor
    public VideoCard() {

        this.type = "integrated";

        this.powerRequirement = 100;

        this.memorySize = 1;

    }


    //constructor with parameters
    public VideoCard(String type, int powerRequirement, int memorySize) {

        this.type = type;

        setPowerRequirement(powerRequirement);

        setMemorySize(memorySize);

    }


    //method to get video card info
    public String toString() {

        return "Type: " + type + "\nPower: " + powerRequirement + " W\nMemory: " + memorySize + " GB";

    }


    //getters and setters
    public String getType() {

        return type;

    }


    public void setType(String type) {

        this.type = type;

    }


    public int getPowerRequirement() {

        return powerRequirement;

    }


    public void setPowerRequirement(int powerRequirement) {

        if (powerRequirement < 1) {

            this.powerRequirement = 75;

        } else if (powerRequirement > 500) {

            this.powerRequirement = 400;

        } else {

            this.powerRequirement = powerRequirement;

        }

    }


    public int getMemorySize() {

        return memorySize;

    }


    public void setMemorySize(int memorySize) {

        if (memorySize < 1) {

            this.memorySize = 1;

        } else if (memorySize > 16) {

            this.memorySize = 16;

        } else {

            this.memorySize = memorySize;

        }

    }

}


//IntegratedVideoCard class begins
class IntegratedVideoCard extends VideoCard {

    private int sharedMemory;

    private boolean usesComputerRAM;


    //default constructor
    public IntegratedVideoCard() {

        super("integrated", 100, 1);

        this.sharedMemory = 2;

        this.usesComputerRAM = false;

    }


    //constructor with parameters
    public IntegratedVideoCard(int powerRequirement, int memorySize, int sharedMemory, boolean usesComputerRAM) {

        super("integrated", powerRequirement, memorySize);

        this.sharedMemory = sharedMemory;

        this.usesComputerRAM = usesComputerRAM;

    }


    //NEW CONSTRUCTOR to fix test error
    public IntegratedVideoCard(int sharedMemory, boolean usesComputerRAM) {

        super("integrated", 100, 1); //Default power and memory

        this.sharedMemory = sharedMemory;

        this.usesComputerRAM = usesComputerRAM;

    }



    //method to get integrated video card info
    public String toString() {

        return super.toString() + "\n\nShared Memory: " + sharedMemory + " GB\nComputer RAM: " + usesComputerRAM;

    }


    //getters and setters
    public int getSharedMemory() {

        return sharedMemory;

    }


    public void setSharedMemory(int sharedMemory) {

        this.sharedMemory = sharedMemory;

    }


    public boolean getUsesComputerRAM() {

        return usesComputerRAM;

    }


    public void setUsesComputerRAM(boolean usesComputerRAM) {

        this.usesComputerRAM = usesComputerRAM;

    }

}


//DiscreteVideoCard class begins
class DiscreteVideoCard extends VideoCard {

    private String connectionType;

    private String usesExternalPower;


    //default constructor
    public DiscreteVideoCard() {

        super("discrete", 100, 1);

        this.connectionType = "PCIEx8";

        this.usesExternalPower = "6-pin";

    }


    //constructor with parameters
    public DiscreteVideoCard(int powerRequirement, int memorySize, String connectionType, String usesExternalPower) {

        super("discrete", powerRequirement, memorySize);

        this.connectionType = connectionType;

        this.usesExternalPower = usesExternalPower;

    }


    
    public DiscreteVideoCard(String connectionType, String usesExternalPower) {

        super("discrete", 100, 1);

        this.connectionType = connectionType;

        this.usesExternalPower = usesExternalPower;

    }


    //method to get discrete video card info
    public String toString() {

        return super.toString() + "\n\nConnection: " + connectionType + "\nExternal Power: " + usesExternalPower;

    }


    //getters and setters
    public String getConnectionType() {

        return connectionType;

    }


    public void setConnectionType(String connectionType) {

        this.connectionType = connectionType;

    }


    public String getUsesExternalPower() {

        return usesExternalPower;

    }


    public void setusesExternalPower(String usesExternalPower) {

        this.usesExternalPower = usesExternalPower;

    }

}