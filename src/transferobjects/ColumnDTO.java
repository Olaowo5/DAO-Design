/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transferobjects;
import java.util.List;
import java.util.ArrayList;

/**
 *this script will be used transferring the Column information
 * of the database
 * @author Olamide Owolabi
 */
public class ColumnDTO {
    
    private Integer ColCount;
    private List<String> ColName;
    private List<String> ColType;
    private List<String> ColJava;
    
    /**
     * The Constructor
     * when called will reset 
     * ColCount =0, all arraylist string Will be set to Null
     * Initialize values
     */
    public ColumnDTO()
    {
        ColCount = 0;
        ColName = new ArrayList<String>();
        ColType = new ArrayList<String>();
        ColJava = new ArrayList<String>();
    }
    
    /**
     * Get the Number of Columns
     * @return Integer Column Count
     */
    public Integer getCount()
    {
        return ColCount;
    }
    /**
     * To Set the column Count
     * @param ct, the integer value
     */
    public void SetCount(int ct)
    {
        ColCount =ct;
    }
    
    ///----name-----
    /**
     * To get the names of each column  in List
     * @return Column Names
     */
    public List<String> getName()
    {
        return ColName;
    }
    
    /**
     * To get name of one the columns
     * @param ip To Pick the column from the list
     * @return Column Name
     */
    public String getName(int ip)
    {
      
        return ColName.get(ip);
    }
    /**
     * To set the names of the columns (ArrayList)
     * @param sp the Names in a string collection
     */
    public void SetName(List<String> sp)
    {
        ColName = sp;
    }
    
    /**
     * To Add a Column Name to the List
     * @param Sp Name of Column
     */
    public void SetName(String Sp)
    {
        ColName.add(Sp);
    }
    
    ///----Type-----
    /**
     * Get the Types of Column
     * @return ArrayList String Column Types
     */
     public List<String> getType()
    {
        return ColType;
    }
     /**
      * Get type of One of the Columns
      * @param ip to decide which column of the list to get type
      * @return A string: Column type
      */
     public String getType(int ip)
     {
         return ColType.get(ip);
     }
     
    /**
     * Assign an Arraylist String : Containing Column Types
     * @param sp the String Array to Pass
     */
    public void SetType(List<String> sp)
    {
        ColType = sp;
    }
    
    /**
     * To Add string Column type to list
     * @param Sp Column Type (String)
     */
    public void SetType(String Sp)
    {
         ColType.add(Sp);
    }
    
    ///----Java-----
    /**
     * To Obtain the Categories of the Column
     * @return Column Categories in a list
     */
     public List<String> getJava()
    {
        return ColJava;
    }
     
     /**
      * To Get an individual category of a column
      * @param ip used in picking put column from list
      * @return Get category of a column
      */
       public String getJava(int ip)
    {
        return ColJava.get(ip);
    }
    
       /**
       * Assign the ArrayList string for column category
       * @param sp the array to pass
       */
    public void SetJava(List<String> sp)
    {
        ColJava = sp;
    }
    
    /**
     * To add a string to the list for column category
     * @param sp string variable Category of Column
     */
      public void SetJava(String sp)
    {
        ColJava.add(sp);
    }
}
