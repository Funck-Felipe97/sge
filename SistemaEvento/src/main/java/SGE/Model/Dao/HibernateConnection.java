
package SGE.Model.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author funck
 */
public class HibernateConnection {
    
    public static EntityManager factory;
    
    private HibernateConnection(){
        
    }
    
    public static EntityManager getConnection(){
        if(factory == null || !factory.isOpen()){
            factory = Persistence.createEntityManagerFactory("sgePU").createEntityManager();
        } 
        return factory;
    }
    
    public static void close(){
        if(factory.isOpen()){
            factory.close();
        }
    }
    
}
