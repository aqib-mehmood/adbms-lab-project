/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package femail_pms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.*;
/**
 *
 * @author SYED ALI ABBAS
 */
public class ParkingDatabase {
    public static Connection setConnection(){
    String url="jdbc:oracle:thin:@localhost:1521:orcl";
    Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,"system","Syedaliabbas123"); 
            System.out.println("Connection Established successfully");
        } catch (Exception sql) {
            System.out.println(sql);
        }
        return conn;
    }   
    
    public void DataInsert(String Query)
       {
           try{
           Connection con = setConnection();
           Statement st = con.createStatement();
           st.executeUpdate(Query);
           
           System.out.println("Data Saved Suceesfully");
           st.close();
           con.close();
           }
           catch(Exception e)
           {
               System.out.println(e);
               System.out.println("Error Occurres");
           }
       }
    
    public Boolean DataManipulationOperation(String TableName,int employeeID, String employeePassword){
    
   try{
   Connection con = setConnection();
           String query = "SELECT * FROM "+TableName+" WHERE  employeeID= '"+employeeID+"' and employeePassword='"+employeePassword+"'";
            PreparedStatement preparestatement = con.prepareStatement(query);
            ResultSet resultset = preparestatement.executeQuery();
            if (resultset.next()) {
                System.out.println("Success");
                return true;
           
       }
           
   }
    catch(Exception e)
           {
               System.out.println(e);
               System.out.println("Error Occurres");
           }
   System.out.println("Error Occurres");
          return false;
           
             
    }
    
    
    
         public String[] GetData(String TableName)
       {
           int parking_id = 0;
           String Parking_typeName = "";
           Connection con = setConnection();
           try{
               Statement st = con.createStatement();
               ResultSet rs = st.executeQuery("SELECT * FROM "+TableName+"");
               System.out.println("Select Quer work");
               while(rs.next())
               {
                  parking_id = rs.getInt("parking_id");
                  Parking_typeName = rs.getString("parking_type_name");
                  System.out.println("Parking id = "+parking_id);
                  System.out.println("Parking Name #"+Parking_typeName);
               }
               rs.close();
               st.close();
               con.close();
           }
           catch(Exception e)
           {
               System.out.println("Error Occurs");
           }
          String[] Data = new String[2];
          Data[0]= String.valueOf(parking_id);
          Data[1] = Parking_typeName;
          return Data;
       }
    
    
    
    
    
//   public static void main(String[] args)
//   {
//   ParkingDatabase d1 = new ParkingDatabase();
//   d1.setConnection();
//   d1.GetData("PARKING_TYPE_TABLE");
//   }
}



