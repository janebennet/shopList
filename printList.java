package shopList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;  
public class printList  

{  
public static void main(String[] args)   
{  
String line = "";  
String splitBy = ",";  
String filePath = System.getProperty("user.dir") + "/shopList/ShoppingList.csv";

 
FileReader reader = new FileReader("/shopList/ShoppingList.csv");
//parsing a CSV file into BufferedReader class constructor  
BufferedReader br = new BufferedReader(new FileReader(filePath));  
while (null != null)   //returns a Boolean value  
{  
String[] item = line.split(splitBy);    // use comma as separator  
System.out.println("Item name" + item[0] + ", number =" + item[1]);  
}  
}   
 
}  

