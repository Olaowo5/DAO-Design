/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transferobjects;

/**
 *  This will be used in transferring the recipients info
 * the database information for each row of the database
 * @author Olamide
 */
public class ReceiptDTO {
    private Integer awardID;
    private String ReceiptName;
    private String Year;
    private String City;
    private String Category;
    
    /**
     * To get the AwardID
     * @return  Integer Award Id
     */
    public Integer getAwardID()
    {
        return awardID;
    }
    
    /**
     * To Set the award ID
     * @param id Award Id
     */
    public void setAwardID(Integer id)
    {
        awardID =id;
    }
    
    /**
     * Get the recipient name in String
     * @return recipient Name
     */
    public String getName()
    {
        return ReceiptName;
    }
    
    /**
     * to set the recipient Name
     * @param Nm name of recipient
     */
    public void setName(String Nm)
    {
        ReceiptName =Nm;
    }
    /**
     * Get the year 
     * @return return year string
     */
     public String getYear()
    {
        return Year;
    }
    
     /**
      * TO set the year
      * @param Yr year value string
      */
    public void setYear(String Yr)
    {
        Year =Yr;
    }
    
    /**
     * get the city Name
     * @return name of city
     */
     public String getCity()
    {
        return City;
    }
    /**
     * to set the city name
     * @param Cy string value city name
     */
    public void setCity(String Cy)
    {
        City =Cy;
    }
    /**
     * Get the category string
     * @return Category of the award string value
     */
     public String getCategory()
    {
        return Category;
    }
    /**
     * To set the category of the award
     * @param Cg Category
     */
    public void setCateg(String Cg)
    {
        Category =Cg;
    }
}
