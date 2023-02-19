/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

import java.util.List;
import dataaccesslayer.ReceiptsDao;
import dataaccesslayer.ReceiptDaoImpl;
import transferobjects.ReceiptDTO;
import transferobjects.ColumnDTO;

/**
 * Will be called by the demo class, using the ReceiptsDAO in obtaining
 * column and row data from the database, while also validating the information pass
 * Validating: Making sure no Null or unwanted output
 * @author Olamide Owolabi
 */
public class RecipientsBusinessLogic {
    private static final int NAME_MAX_LENGTH = 30;
	private static final int CITY_MAX_LENGTH = 30;
        	private static final int YEAR_MAX_LENGTH = 10;
                	private static final int CATEG_MAX_LENGTH = 30;
        
        private ReceiptsDao Rdao = null;
        
        /**
         *  Constructor to call the ReceiptDAO interface from ReceiptDaoImpl
         */
        public RecipientsBusinessLogic()
        {
            Rdao = new ReceiptDaoImpl();
        }
        
        /**
         * To gather all the recipients from the database using the ReceiptDTO
         * @return ReceiptDTO in a List
         */
        public List<ReceiptDTO> getAllRecipeints()
        {
            return Rdao.getAllRecipients();
        }
        
        /**
         * To get a singular recipient from the database
         * @param repId the int used in picking out the recipient
         * @return the RecipientDTO (Singular)
         */
        public ReceiptDTO getRecipet(Integer repId)
        {
            return Rdao.getReceiptByReciptID(repId);
        }
        
        /**
         * To get the ColumnDTO from ReceiptDAO interface 
         * @return  ColumnDTO
         */
        public ColumnDTO getColumn()
        {
            return Rdao.CTO();
        }
        
        /**
         * To add a row into the database
         * if error throw a validationException
         * @param rep used the receiptDTO passed
         * @throws ValidationException data not right format
         */
        public void addRecipeit(ReceiptDTO rep) throws ValidationException
        {
            cleanRep(rep);
            validateRep(rep);
            Rdao.addRecipeit(rep);
        }
        
        /**
         * To Update the database
         * if error throw an exception
         * @param rep used the receiptDTO passed
         * @throws ValidationException data not in right format
         */
        public void updateRecipeit(ReceiptDTO rep) throws ValidationException{
		cleanRep(rep);
		validateRep(rep);
		Rdao.updateRecipeit(rep);
	}
	
        /**
         * To delete data from the database
         * if error throw an exception
         * @param rep used the receiptDTO passed
         * 
         */
	public void deleteRecipeit(ReceiptDTO rep){
		
                Rdao.deleteRecipeit(rep);
	}
	
        
        /**
         *Used to make the sure the data collected in the receiptDTO
         * doesnt have any spaces before or after text, summary
         * trim
         * @param recip used the receiptDTO passed
         * 
         */
	private void cleanRep(ReceiptDTO recip){
		if(recip.getName() != null){ 
			recip.setName(recip.getName().trim());
		}
		if(recip.getCity() != null){ 
			recip.setCity(recip.getCity().trim());
		}
                
                if(recip.getYear() != null)
                {
                    recip.setYear(recip.getYear().trim());
                }
                
                if(recip.getCategory() != null)
                {
                    recip.setCateg(recip.getCategory().trim());
                }
	}
	/**
         * to validate the exception
         * @param rep Recipient transfer Object
         * @throws ValidationException 
         */
	private void validateRep(ReceiptDTO rep) throws ValidationException{
		validateString(rep.getName(), "Name", NAME_MAX_LENGTH, true);
		validateString(rep.getCity(), "City", CITY_MAX_LENGTH, true);
                validateString(rep.getYear(), "Year", YEAR_MAX_LENGTH, true);
                validateString(rep.getCategory(), "Category", CATEG_MAX_LENGTH, true);
	}
	
        /**
         * To use for validating data
         * @param value the data value passed
         * @param fieldName the fieldname, column name
         * @param maxLength Max Number of characters
         * @param isNullAllowed if Null is Allowed
         * @throws ValidationException 
         */
	private void validateString(String value, String fieldName, int maxLength, boolean isNullAllowed)
	    throws ValidationException{
		if(value == null && isNullAllowed){
			// return; // null permitted, nothing to validate
		}
		else if(value == null && ! isNullAllowed){
		    throw new ValidationException(String.format("%s cannot be null", 
		    		fieldName));
		}
		else if(value.length() < 1){
			throw new ValidationException(String.format("%s cannot be empty or only whitespace", 
					fieldName));
		}
		else if(value.length() > maxLength){
			throw new ValidationException(String.format("%s cannot exceed %d characters", 
					fieldName, maxLength));
		}
	}
        
}
