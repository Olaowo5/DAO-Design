/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccesslayer;


import java.util.List;
import transferobjects.ReceiptDTO;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import transferobjects.ColumnDTO;

/**
 * Class roles
 * First establish and check connection of the database
 * Next uses interface in getting row & column data from the database
 * @author Olamide Owolabi
 */
public class ReceiptDaoImpl implements ReceiptsDao{
    
    Connection conn = null;
    ColumnDTO Cto;
    Boolean IsClosed = false;
    
    /**
     * To call the class and establish a connection with 
     * the database
     */
    public ReceiptDaoImpl()
    {
       CheckCon();
    }
    
    /**
     * To create a connection with the database if one isn't already there
     */
    public void CheckCon()
    {
        if(conn == null)
        {
             DataSource ds = new DataSource();
			conn = ds.createConnection();
                        IsClosed = false;
        }
        else if(IsClosed)
        {
              DataSource ds = new DataSource();
			conn = ds.createConnection();
                        IsClosed = false;
        }
    }
    
    /**
     * will be used to get all recipients from the database
     * using the transferObjects ReceiptDTO
     * @return the array List ReceiptDTO
     */
    @Override
    public List<ReceiptDTO> getAllRecipients()
    {
        ArrayList<ReceiptDTO> recp = null;
         
       PreparedStatement pstmt = null;
		ResultSet rs = null;
                ResultSetMetaData rsmt = null;
		
		try{
			 CheckCon();
			pstmt = conn.prepareStatement(
					"SELECT AwardID, Name, Year, City, Category FROM Recipients ORDER BY AwardID");
			rs = pstmt.executeQuery();
			recp = new ArrayList<ReceiptDTO>();
                        rsmt = rs.getMetaData(); //Meta data
                       
                        
			while(rs.next()){
				ReceiptDTO rec = new ReceiptDTO();
				rec.setAwardID(rs.getInt("AwardID"));
				rec.setName(rs.getString("Name"));
				rec.setYear(rs.getString("Year"));
                                rec.setCity(rs.getString("City"));
                                rec.setCateg(rs.getString("Category"));
				recp.add(rec);
			}
                        
                        ColumnDTO cold = new ColumnDTO();
                        int Count = rsmt.getColumnCount();
                        cold.SetCount(Count);
                        for(int i=1; i< Count+1; i++)
                        {
                            cold.SetName(rsmt.getColumnName(i));
                            cold.SetJava(rsmt.getColumnClassName(i));
                            cold.SetType(rsmt.getColumnTypeName(i));
                           
                        }
                        Cto = cold;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(rs != null){ rs.close(); } }
			catch(SQLException ex){System.out.println(ex.getMessage());}
                      
			
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(conn != null){ conn.close(); IsClosed = true; }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
        
        
        return recp;
    }
    
    /**
     * To get an individual row from the database
     * using the transferObject ReceiptDTO
     * @param reciptID using the integer to pick the row ID
     * @return a row from database using the ReceiptDTO
     */
    @Override
    public ReceiptDTO getReceiptByReciptID(Integer reciptID)
    {
        ReceiptDTO rep = null;
      
         ResultSetMetaData rsmt = null;
        PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			 CheckCon();
			pstmt = conn.prepareStatement(
					"SELECT AwardID, Name, Year, City, Category FROM Recipients WHERE AwardID = ?");
			pstmt.setInt(1, reciptID);
			rs = pstmt.executeQuery();
			while(rs.next()){
				rep = new ReceiptDTO();
				rep.setAwardID(rs.getInt("AwardID"));
				rep.setName(rs.getString("Name"));
				rep.setYear(rs.getString("Year"));
                                rep.setCity(rs.getString("City"));
                                rep.setCateg(rs.getString("Category"));
			}
                        
                        rsmt = rs.getMetaData(); //Meta data
                        ColumnDTO cold = new ColumnDTO();
                        int Count = rsmt.getColumnCount();
                        cold.SetCount(Count);
                        for(int i=1; i< Count+1; i++)
                        {
                            cold.SetName(rsmt.getColumnName(i));
                            cold.SetJava(rsmt.getColumnClassName(i));
                            cold.SetType(rsmt.getColumnTypeName(i));
                        }
                        
                        Cto = cold;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(rs != null){ rs.close(); } }
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(conn != null){ conn.close(); IsClosed = true; }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
        return rep;
    }
    
    /**
     * To be used to insert a row in the database using the ReceiptDTO
     * @param recp the ReceiptDTO passed
     */
    @Override
     public void addRecipeit(ReceiptDTO recp)
     {
         
		PreparedStatement pstmt = null;
		try{
			 CheckCon();
			// do not insert AuthorID, it is generated by Database
			pstmt = conn.prepareStatement(
					"INSERT INTO Recipients (Name, Year, City, Category) " +
			        "VALUES(?, ?,?,?)");
			pstmt.setString(1, recp.getName());
			pstmt.setString(2, recp.getYear());
                        pstmt.setString(3, recp.getCity());
                        pstmt.setString(4, recp.getCategory());
			pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(conn != null){ conn.close(); IsClosed = true;  }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
     }
     
     /**
      * To carry out update in the database
      * @param recp using the receiptDTO
      */
     @Override
    public void updateRecipeit(ReceiptDTO recp){
        
       
			PreparedStatement pstmt = null;
			try{
				 CheckCon();
				pstmt = conn.prepareStatement(
						"UPDATE Recipients SET Name = ?, " + 
				        "Year = ?, City = ?, Category = ? WHERE AwardID = ?");
				pstmt.setString(1, recp.getName());
				pstmt.setString(2, recp.getYear());
                                pstmt.setString(3, recp.getCity());
                                pstmt.setString(4, recp.getCategory());
				pstmt.setInt(5, recp.getAwardID());
				pstmt.executeUpdate();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{ if(pstmt != null){ pstmt.close(); }}
				catch(SQLException ex){System.out.println(ex.getMessage());}
				try{ if(conn != null){ conn.close(); IsClosed = true; }}
				catch(SQLException ex){System.out.println(ex.getMessage());}
			}
    }
    
    /**
     * To delete a row from the database
     * @param recp using the receiptDTO
     */
    @Override
   public void deleteRecipeit(ReceiptDTO recp){
       
      
		PreparedStatement pstmt = null;
		try{
			 CheckCon();
			pstmt = conn.prepareStatement(
					"DELETE FROM Recipients WHERE AwardID = ?");	
			pstmt.setInt(1, recp.getAwardID());
			pstmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{ if(pstmt != null){ pstmt.close(); }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
			try{ if(conn != null){ conn.close(); IsClosed = true;  }}
			catch(SQLException ex){System.out.println(ex.getMessage());}
		}
       
   }
   
 
   /**
    * To get the ColumnDTO
    * @return ColumnDTO
    */
   @Override
   public ColumnDTO CTO()
   {
       return Cto;
   }
}
