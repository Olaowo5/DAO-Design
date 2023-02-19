/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.nio.file.*;
import java.util.*;
/**
 * was originally planned for database connection using the properties
 * Not Longer in Used
 * @author Olamide Owolabi
 */
public class PropertiesDemo {
    
    /**
     * the Main void
     * @param args nothing
     */
    public static void main(String[] args) {
		System.out.println("Starting dir for database.properties is " + System.getProperty("user.dir"));
		
		Properties props = new Properties();
		InputStream in = null;
		try {
			in = Files.newInputStream(Paths.get("src/database.properties"));
			props.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// catch()
		finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// finally
		
	    String url = props.getProperty("jdbc.url");
	    String username = props.getProperty("jdbc.username");
	    String password = props.getProperty("jdbc.password");
	     
	    System.out.printf("%s\n%s\n%s\n", url, username, password);
	} //main()

}
