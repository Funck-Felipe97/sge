
package Model.dataAccessObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class HibernateConnection {
    
    private static EntityManagerFactory factory;
    
    private HibernateConnection(){
        
    }
    
    public static EntityManager getEntityManager(){
        if(factory == null || !factory.isOpen()){
            factory = Persistence.createEntityManagerFactory("sistemaVendasPU");
        } 
        return factory.createEntityManager();
    }
    
    public static void close(){
        factory.close();
    }
    
}
