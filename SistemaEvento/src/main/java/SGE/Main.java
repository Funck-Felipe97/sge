
package SGE;

import SGE.Model.Dao.HibernateConnection;
import javax.persistence.Persistence;

/**
 * 
 * @author funck
 */

public class Main {
    
    private int nome;
    
    public static void main(String[] args) {
       
        HibernateConnection.getConnection();
        HibernateConnection.close();
        
    }
    
}
