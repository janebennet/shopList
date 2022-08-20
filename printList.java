package shopList;

import java.io.*;
import java.io.File;
import java.io.FileReader;

public class printList

{
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        String filePath = System.getProperty("user.dir") + "/shopList/ShoppingList.csv";

        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            System.out.println("File does not exist");
            System.exit(-1);
        }
        // parsing a CSV file into BufferedReader class constructor
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Integer counter = 0;
            while ((line = br.readLine()) != null) // returns a Boolean value
            {
                counter++;
                String[] item = line.split(splitBy); // use comma as separator
                System.out.println(counter + ": " + item[0] + " - " + item[1]);
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found" + e);
        } catch (IOException ioe) {
            System.out.println("IO exception" + ioe);
        }
    }
}
