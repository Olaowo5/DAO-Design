/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataaccesslayer;

import transferobjects.ReceiptDTO;
import transferobjects.ColumnDTO;
import java.util.List;
/**
 * The interface for handling getting information from the database
 * All rows and column info will obtained using this interface
 * @author Olamide Owolabi
 */
public interface ReceiptsDao {
    
    //will need to get recipts
    /**
     * will be used to get all recipients from the database
     * using the transferObjects ReceiptDTO
     * @return the array List ReceiptDTO
     */
    List<ReceiptDTO> getAllRecipients();
    
    //get columnDTO
    
      /**
    * To get the ColumnDTO
    * @return ColumnDTO
    */
    ColumnDTO CTO();
        /**
     * To get an individual row from the database
     * using the transferObject ReceiptDTO
     * @param reciptID using the integer to pick the row ID
     * @return a row from database using the ReceiptDTO
     */
    ReceiptDTO getReceiptByReciptID(Integer reciptID);
    
     /**
     * To be used to insert a row in the database using the ReceiptDTO
     * @param recp the ReceiptDTO passed
     */
    void addRecipeit(ReceiptDTO recp);
      /**
      * To carry out update in the database
      * @param recp using the receiptDTO
      */
    void updateRecipeit(ReceiptDTO recp);
        /**
     * To delete a row from the database
     * @param recp using the receiptDTO
     */
    void deleteRecipeit(ReceiptDTO recp);
}
