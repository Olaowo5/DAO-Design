/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package owolabi.olamide.lab2;



import java.util.List;
import businesslayer.RecipientsBusinessLogic;
import businesslayer.ValidationException;
import transferobjects.ReceiptDTO;
import transferobjects.ColumnDTO;
import java.util.Random;
/**
 *the demo class, will be called by owolabiOlamidelab2
 * it role is to print out the information from the database
 * and run queries and actions using the other scripts
 * @author Olamide Owolabi
 */
public class Demo {
    
    /**
     * The function that will called to run the application
     * I.e print and update the database
     */
    public void demoTime()
    {
       
        try{
            RecipientsBusinessLogic logic = new RecipientsBusinessLogic();
            List<ReceiptDTO> list = null;
            ReceiptDTO recp = null;
            ColumnDTO coldt = null;
            
            
            list = logic.getAllRecipeints();
            
                 coldt = logic.getColumn();
            
            printColumnInfo(coldt);
            
            System.out.println("Printing Recipients");
             printColumnHeader(coldt);
            printRecipients(list);
            
            
            
            int randy = RandPick(list.size());
            System.out.println("Printing One Recipient");
            recp= logic.getRecipet(randy);
             printColumnHeader(coldt);
            printRecipient(recp);
            System.out.println();
            
            System.out.println("Inserting One Author");
            recp = new ReceiptDTO();
            recp.setName("Aboidun");
            recp.setCity("Ottawa");
            recp.setYear("2023");
            recp.setCateg("Video-Gaming");
            logic.addRecipeit(recp);
            list = logic.getAllRecipeints();
            printColumnHeader(coldt);
            printRecipients(list);
			
	    System.out.println("Updating last Recipients");
            Integer updatePrimaryKey = list.get(list.size() - 1).getAwardID();
            recp = new ReceiptDTO();
            recp.setAwardID(updatePrimaryKey);
             recp.setName("Teresa");
            recp.setCity("Not Canada");
            recp.setYear("2021");
            recp.setCateg("Living");
            logic.updateRecipeit(recp);
            list = logic.getAllRecipeints();
             printColumnHeader(coldt);
            printRecipients(list);
			
            System.out.println("Deleting last Recipient");
            recp = list.get(list.size() - 1);
            logic.deleteRecipeit(recp);
            list = logic.getAllRecipeints();
             printColumnHeader(coldt);
            printRecipients(list);
            
       
        }
        catch(ValidationException e)
        {
            System.err.println(e.getMessage());
        }
    }//end demoTime
    
    /**
     * Will be used to print a specific row from the database
     * @param rec the transfer oBject passed
     */
    private static void printRecipient(ReceiptDTO rec){
        
        //need to print column
        
	    	String output = String.format("%s %30s %10s %10s %30s",
	    			rec.getAwardID().toString(),
	    			rec.getName(),
	    			rec.getYear(),
                                rec.getCity(),
                                rec.getCategory());
	    	System.out.println(output);
	}
	
    /**
     * Used in printing an array of rows from the database
     * @param recp the transfer objects passed in an array list
     */
	private static void printRecipients(List<ReceiptDTO> recp){
	    for(ReceiptDTO rec : recp){
	    	printRecipient(rec);
	    }
	    System.out.println();
	}
        
        /**
         * Will be used in displaying each column information 
         * of the database
         * @param coldt the Transfer Object passed
         */
        private static void printColumnInfo(ColumnDTO coldt)
        {
            if(coldt ==null) return;
            
            System.out.println("Column Information:");
            int Count = coldt.getCount();
            System.out.println("======================");
            System.out.println("Column Count "+ Count);
            
            for(int i=0; i< Count; i++)
            {
                 System.out.println("Column Name: " + coldt.getName(i));
                System.out.println("Column Type (MySQL): " + coldt.getType(i));
                System.out.println("Corresponding Java Class: " + coldt.getJava(i));
                System.out.println();
            }
        }
        
        /**
         * To get the names of the columns, 
         * so they can be displayed on top of the rows output
         * @param ct Transfer Object ColumnDTO
         */
        private static void printColumnHeader(ColumnDTO ct)
        {
             if(ct ==null) return;
             
             
             
           String output = String.format("%s %15s %20s %8s %30s",
	    			ct.getName(0),
	    			ct.getName(1),
	    			ct.getName(2),
                                ct.getName(3),
                                ct.getName(4));
	   
           System.out.println(output);
        }
        
        /**
         * To Pick a random integer from 0 to Max (Increment)
         * @param val Max value
         * @return Random Int
         */
        Integer RandPick(Integer val)
        {
             Random rand = new Random();

        Integer randomNumber = rand.nextInt(val) + 1;
        
        return randomNumber;
        }
}
