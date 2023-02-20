package edu.jsu.mcis.cs310.coursedb;

import edu.jsu.mcis.cs310.coursedb.dao.*;

public class Main {

    public static void main(String[] args) {
        
        DAOFactory daoFactory = new DAOFactory("coursedb");
        
        // TEST - delete later
        SectionDAO d = daoFactory.getSectionDAO();

      // SectionDAO d = new SectionDAO(daoFactory);
       //System.out.println(d.find(1, "002", "113"));
        
        // TEST END
        
        if ( !daoFactory.isClosed() ) {
            System.out.println("Connected Successfully!");
        }
            System.out.println(d.find(1, "CS", "201"));

}
}


    