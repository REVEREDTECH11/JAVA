import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab11Prob01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    	String inputPath = "src/people.dat";
    	String outputPath = "src/people-copy.dat";
        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputPath));
             DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputPath))) {
            while (true) {
            	try {
                	//read data
                    int age = dis.readInt();
                    String Name = dis.readUTF();
                   //String lastName = dis.readUTF();
                    String address = dis.readUTF();
                    int zipCode = dis.readInt();
                    double salary = dis.readDouble();

            		//System.out.printf("Age: %d\nFirst and Last Name: %s\nAddress: %s\nZip Code: %d\nSalary: %.2f\n", age, Name, address, zipCode, salary);
                    //System.out.println(age + " " + Name + " " + address + " " + zipCode + " " + salary);
            		//System.out.println(" ");
                    System.out.printf("%d %s %s %d %.2f\n", age, Name, address, zipCode, salary);
                    
                    //write to copy
                    dos.writeInt(age);
                    //dos.writeUTF(firstName);
                    dos.writeUTF(Name);
                    dos.writeUTF(address);
                    dos.writeInt(zipCode);
                    dos.writeDouble(salary);
                    
            	} catch (EOFException eof) {
            		//System.out.println("End of file reached.");
            		break;
            	}
            }
      } catch (IOException e) {
            e.printStackTrace();
      }
    }
}
     
		
    
    

