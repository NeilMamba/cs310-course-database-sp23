package edu.jsu.mcis.cs310.coursedb.dao;

import java.sql.*;
import com.github.cliftonlabs.json_simple.*;
import java.util.ArrayList;

public class DAOUtility {
    
    public static final int TERMID_SP23 = 1;
    
    public static String getResultSetAsJson(ResultSet rs) {
        
        JsonArray records = new JsonArray();
        
        try {
        
            if (rs != null) {

                // INSERT YOUR CODE HERE
             while(rs.next()) {  
                    
                    JsonObject line = new JsonObject();
                    
                    ResultSetMetaData headr = rs.getMetaData();
                    int columnNum = headr.getColumnCount();
                    
                    for(int i = 0; i < columnNum; i++) { 
                        
                        String column = headr.getColumnName(i + 1); 
                        String colValue = rs.getString(column);

                        line.put(column, colValue);
                        
                    }
                    
                    records.add(line);  
            }
            
        }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return Jsoner.serialize(records);
        
    }
    
}