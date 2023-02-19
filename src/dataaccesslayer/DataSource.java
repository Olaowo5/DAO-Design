/* File: DataSource.java
 * Author: Stanley Pieda
 * Date: 2015
 * Modified: 2022 - George Kriger
 * Description: Demonstration of DAO Design Pattern, MVC Design Pattern
 * References:
 * Ram N. (2013).  Data Access Object Design Pattern or DAO Pattern [blog] Retrieved from
 * http://ramj2ee.blogspot.in/2013/08/data-access-object-design-pattern-or.html
 */
package dataaccesslayer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 * Original Author STanley Pieda
 * Modified by Author
 * will be used in establishing a connection with the database
 * @author Olamide Owolabi
 */
public class DataSource {
	private Connection connection = null;
	
        /**
         * Empty constructor
         */
	public DataSource(){}
/*
 * Only use one connection for this application, prevent memory leaks.
 */
        /**
         * Create Connection to Database
         * @return the connection created
         */
	public Connection createConnection(){
            // added use of Properties and try-with-resources - kriger
            Properties props = new Properties();

		try (InputStream in = Files.newInputStream(Paths.get("src/database.properties"));) {
			props.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// catch()
               
	    String url = props.getProperty("jdbc.url");
	    String username = props.getProperty("jdbc.username");
	    String password = props.getProperty("jdbc.password");
		try {
			if(connection != null){
				System.out.println("Cannot create new connection, one exists already");
			}
			else{
				connection = DriverManager.getConnection(url, username, password);
			}
		}
		catch(SQLException ex){
                    ex.printStackTrace();
		}
		return connection;
	}
}