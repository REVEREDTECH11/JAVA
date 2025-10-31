public class PAssign02 {
    public static void main(String[] args) {
    	//video card instances
        //VideoCard VideoCard1 = new VideoCard();
        
        VideoCard VideoCard1 = new VideoCard("discrete", "PCIEx16", 575, "8-pin", 24);
        
        VideoCard VideoCard2 = new VideoCard("integrated", "N/A", 120, "N/A", 4);
        
        VideoCard VideoCard3 = new VideoCard("discrete", "PCIEx8", 150, "6-pin", 8);
        
        VideoCard VideoCard5 = new VideoCard("integrated", "N/A", -110, "N/A", 2);

        //computer instances
        //Brand, Mdoel, VideoCard
        Computer c1 = new Computer();
        
        Computer c2 = new Computer("Dell", "Optiplex", VideoCard1);
        
        Computer c3 = new Computer("Lenovo", "IdeaCentre", VideoCard2);
        
        Computer c4 = new Computer("HP", "Omen Obelisk", VideoCard3);
        
        Computer c5 = new Computer("Lenovo", "IdeaCentre", VideoCard5);

        //array of computers
        Computer[] computers = {c1, c2, c3, c4, c5};

        OutputcDets(computers);
    }
    //method for printing c details
    public static void OutputcDets(Computer[] computers) {
        
    	for (Computer computer : computers) {
        
    		System.out.println(computer.getInfo());
            
    		System.out.println();
        
    	}
    
    }

}
	//c class begins
class Computer {
   
	private String brand;
    
	private String model;
    
	private VideoCard VideoCard;

    //constructor
    public Computer() {
    
    	this.brand = "OEM";
        
    	this.model = "Basic";
        
    	this.VideoCard = new VideoCard();
    }

    // VideoCard constructor
    public Computer(VideoCard VideoCard) {
        
    	this.brand = "OEM";
        
    	this.model = "Basic";
        
    	this.VideoCard = VideoCard;
    }

    // Constructor for brand, model, and VideoCard
    public Computer(String brand, String model, VideoCard VideoCard) {
        
    	this.brand = brand;
        
    	this.model = model;
        
    	this.VideoCard = VideoCard;
    
    }

    // pc info
    public String getInfo() {
    
    	return brand + " " + model + "\n" + VideoCard.getInfo();
    
    }

    // getters and setters
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
    
    	return VideoCard;
    
    }

    public void setVideoCard(VideoCard VideoCard) {
    
    	this.VideoCard = VideoCard;
    
    }

}
	//VideoCard class begins
class VideoCard {

	private String type;
    
	private String connectionType;
    
	private int powerRequirement;
    
	private String externalPower;
    
	private int memorySize;

    // default constructor
    public VideoCard() {
    
    	this.type = "integrated";
        
    	this.connectionType = "N/A";
        
    	this.powerRequirement = 100;
        
    	this.externalPower = "N/A";
        
    	this.memorySize = 1;
   
    }
    
// constructor with parameters
    public VideoCard(String type, String connectionType, int powerRequirement, String externalPower, int memorySize) {

    	this.type = type;
        
    	this.connectionType = connectionType;
        
    	setPowerRequirement(powerRequirement);
        
    	this.externalPower = externalPower;
        
    	setMemorySize(memorySize);
    
    }

    // VideoCard info
    public String getInfo() {
    
    	return "Video Card Info:\nType: " + type + "\nConnection: " + connectionType + "\nPower: " + powerRequirement + "W\nExt Power: " + externalPower + "\nMemory: " + memorySize + "GB";
    
    }

    // getters and setters
    public String getType() {
    
    	return type;
    
    }
    //method to set SET TYPE
    public void setType(String type) {
    
    	this.type = type;
    
    }
    //method to get CONNECTION TYPE
    public String getConnectionType() {
    
    	return connectionType;
    
    }
    //method to set CONNECTION TYPE
    public void setConnectionType(String connectionType) {
    
    	this.connectionType = connectionType;
    
    }
    //method to get POWER REQUIREMENT
    public int getPowerRequirement() {
    
    	return powerRequirement;
    
    }
    //method to set POWER REQUIREMENT
    public void setPowerRequirement(int powerRequirement) {
    
    	if (powerRequirement < 1) {
        
    		this.powerRequirement = 75;
        
    	} else if (powerRequirement > 500) {
        
    		this.powerRequirement = 400;
        
    	} else {
        
    		this.powerRequirement = powerRequirement;
    
    	}
    
    }
    //method to get EXTERNAL POWER
    public String getExternalPower() {
    
    	return externalPower;
    
    }
    //method to set EXTERNAL POWER
    public void setExternalPower(String externalPower) {
    
    	this.externalPower = externalPower;
    
    }
    //method to get RAM SIZE
    public int getMemorySize() {
    
    	return memorySize;
    
    }
    //RAM SIZE 
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
