public class PAssign01 {

    public static void main(String[] args) {

        //NEW DESK INSTANCES

        Desk desk1 = new Desk(5, 43.50, true, "Birch", "Tennessee");

        Desk desk2 = new Desk(8, 29.20, false, "Mahogany", "California");

        Desk desk3 = new Desk(4, 40.10, true, "Pine", "Florida"); // Trigger error checking for numDrawers and material

        Desk desk4 = new Desk(0, 27.00, false, "Maple", "New York"); // Trigger error checking for surfaceHeight

        Desk desk5 = new Desk(2, 28.10, false, "Oak", "Washington"); // Trigger error checking for manufactureState

        Desk[] desks = { desk1, desk2, desk3, desk4, desk5 };

        printDesks(desks);

    }

    public static void printDesks(Desk[] desks) {

        for (int i = 0; i < desks.length; i++) {

            System.out.println("Desk " + (i + 1));

            System.out.println(desks[i].getInfo());

            System.out.println();

        }

    }

}

class Desk {

    // INSTANCE VARIABLES

    private int numDrawers;

    private double surfaceHeight;

    private boolean standing;

    private String materialType;

    private String manufactureState;

    private static int numDesks;

    // DEFAULT CONSTRUCTOR

    public Desk() {

        this.numDrawers = 4;

        this.surfaceHeight = 27.0;

        this.standing = false;

        this.materialType = "Pine";

        this.manufactureState = "North Carolina";

        numDesks++;

    }

    // CONVENIENCE CONSTRUCTOR

    public Desk(int numDrawers) {

        setNumDrawers(numDrawers);

        this.surfaceHeight = 27.0;

        this.standing = false;

        this.materialType = "Pine";

        this.manufactureState = "North Carolina";

        numDesks++;

    }

    // SET CONSTRUCTORS

    public Desk(int numDrawers, double surfaceHeight, boolean standing, String materialType, String manufactureState) {

        setNumDrawers(numDrawers);

        setSurfaceHeight(surfaceHeight);

        this.standing = standing;

        setMaterialType(materialType);

        setManufactureState(manufactureState);

        numDesks++;

    }

    // GETTERS AND SETTERS

    public int getNumDrawers() {

        return numDrawers;

    }

    // SETNUMDRAWERS

    public void setNumDrawers(int numDrawers) {

        if (numDrawers < 0 || numDrawers > 8) {

            this.numDrawers = 4;

        } else {

            this.numDrawers = numDrawers;

        }

    }

    // GETSURFACE HEIGHT

    public double getSurfaceHeight() {

        return surfaceHeight;

    }

    // SETSURFACEHEIGHT

    public void setSurfaceHeight(double surfaceHeight) {

        if (surfaceHeight < 24.0 || surfaceHeight > 45.0) {

            this.surfaceHeight = 27.0;

        } else {

            this.surfaceHeight = surfaceHeight;

        }

    }

    public boolean isStanding() {

        return standing;

    }

    // SETSTANDING

    public void setStanding(boolean standing) {

        this.standing = standing;

    }

    // GETMATERIALTYPE

    public String getMaterialType() {

        return materialType;

    }

    // SETMATERIALTYPE

    public void setMaterialType(String materialType) {

        if (materialType.length() < 3) {

            this.materialType = "Oak";

        } else {

            this.materialType = materialType;

        }

    }

    // GETMANUFACTURESTATE

    public String getManufactureState() {

        return manufactureState;

    }

    // SETMANUFACTURESTATE

    public void setManufactureState(String manufactureState) {

        if (manufactureState.length() < 4) {

            this.manufactureState = "Iowa";

        } else {

            this.manufactureState = manufactureState;

        }

    }

    // GETNUMDESKS

    public static int getNumDesks() {

        return numDesks;

    }

    // GETINFO

    public String getInfo() {

        return String.format("Desk Information%nNumber Drawers: %d%nSurface Height: %.2f inches%nStanding: %b%nMaterial: %s%nManufactured: %s",

                numDrawers, surfaceHeight, standing, materialType, manufactureState);

    }

}