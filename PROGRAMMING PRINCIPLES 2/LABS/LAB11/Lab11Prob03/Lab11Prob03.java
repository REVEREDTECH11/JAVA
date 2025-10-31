import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.text.NumberFormat;

//new person class
class Person implements Comparable<Person>, Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    private String address;
    private int zipCode;
    private double salary;

    // Default constructor
    public Person() {
        this.age = 0;
        this.name = "";
        this.address = "";
        this.zipCode = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Person(int age, String name, String address, int zipCode, double salary) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.salary = salary;
    }

    // Accessors and mutators
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString() method
    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return String.format("Age: %d, Name: %s, Address: %s, Zip: %d, Salary: %s",
                age, name, address, zipCode, currencyFormat.format(salary));
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare by salary in descending order
        if (this.salary < otherPerson.salary) {
            return 1;
        } else if (this.salary > otherPerson.salary) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Lab11Prob03 {
    public static void main(String[] args) {
        String inputFilePath = "src/people.dat";
        String outputFilePath = "src/people-salary-sorted.dat";
        String outputFilePathObject = "src/people-salary-sorted-objects.dat"; // New file for serialized objects

        File inputFile = new File(inputFilePath);
        System.out.printf("Absolute path: %s\n", inputFile.getAbsolutePath());
        System.out.printf("File Size: %d bytes\n", inputFile.length());

        ArrayList<Person> PersonList = new ArrayList<>();

        try  {
            DataInputStream dis = new DataInputStream(new FileInputStream(inputFilePath));


            while (true) {
                try {
                    // Read the data for one person record
                    int age = dis.readInt();
                    String fullName = dis.readUTF();
                    String address = dis.readUTF();
                    int zipCode = dis.readInt();
                    double salary = dis.readDouble();

                    // Create a Person object and add it to the ArrayList
                    Person person = new Person(age, fullName, address, zipCode, salary);
                    PersonList.add(person);



                } catch (EOFException e) {
                    System.out.println("End of file reached.");
                    break; // Exit the loop when the end of the file is reached
                } catch (IOException e) {
                    e.printStackTrace(); // Print the error details
                    break; // Exit on any IOException
                }
            }
            dis.close();


          //Sort the ArrayList using Collections.sort()
            System.out.println("\nBefore sorting:");
            for (Person Person : PersonList) {
                System.out.println(Person);
            }
            Collections.sort(PersonList);

            System.out.println("\nAfter sorting:");
            for (Person Person : PersonList) {
                System.out.println(Person);
            }

            // Write to file
            PrintWriter writer = null;
            try {
                writer = new PrintWriter(new FileWriter(outputFilePath));
                for (Person Person : PersonList) {
                    writer.println(Person.toString()); // Use the toString() method
                }
                writer.flush();

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }

            //System.out.println("Data processing complete. Sorted data written to " + outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
