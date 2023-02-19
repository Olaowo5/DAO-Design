/** File: ValidationException.java
 * @Author: Stanley Pieda, Modified By Olamide Owolabi
 * Date: 2015
 * Description: Demonstration of DAO Design Pattern, MVC Design Pattern
 */
package businesslayer;

/**
 * Creating a custom exception class to help
 * verifying the data
 * @author Olamide
 */
public class ValidationException extends Exception {
	
            /**
 * Constructs a new ValidationException with the specified detail message and cause. 
 
 */
	public ValidationException(){
		super("Data not in valid format");
	}
	
             /**
 * Constructs a new ValidationException with the specified detail message and cause. 
 * @param message the detail message of the exception. 
 
 */
	public ValidationException(String message){
		super(message);
	}
	
        /**
 * Constructs a new ValidationException with the specified detail message and cause. 
 * @param message the detail message of the exception. 
 * @param throwable the cause of the exception. 
 */
	public ValidationException(String message, Throwable throwable){
		super(message, throwable);
	}
	
        /**
 * Constructs a new ValidationException with the d cause. 
 
 * @param throwable the cause of the exception. 
 */
	public ValidationException(Throwable throwable){
		super(throwable);
	}
}
