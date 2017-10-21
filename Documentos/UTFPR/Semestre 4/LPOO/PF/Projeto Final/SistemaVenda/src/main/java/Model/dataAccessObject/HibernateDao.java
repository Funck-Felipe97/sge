
package Model.dataAccessObject;

import Model.valueObject.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Felipe
 */

public class HibernateDao <T> implements InterfaceDao<T>{
    
    protected EntityManager manager;
    protected EntityTransaction tx;
    protected T persistedClass;
    
    public HibernateDao(){
        
    }
    
    @Override
    public void salvar(T bean){
        manager = HibernateConnection.getEntityManager();
        tx = manager.getTransaction();
        tx.begin();
            manager.persist(bean);
        tx.commit();
        manager.close();
    }

    @Override
    public void atualizar(T bean){
        manager = HibernateConnection.getEntityManager();
        tx = manager.getTransaction();
        tx.begin();
            manager.merge(bean);       
        tx.commit();
        manager.close();
    }

    @Override
    public void excluir(T bean){
        manager = HibernateConnection.getEntityManager();
        tx = manager.getTransaction();
        tx.begin();
            Object o = manager.merge(bean);
            manager.remove(o);
        tx.commit();
        manager.close();
    }

    @Override
    public T getBean(Class cls , Long codigo){
        manager = HibernateConnection.getEntityManager();
        T bean = (T)manager.find(cls , codigo);
        manager.close();
        return bean;
    }

    @Override
    public List<T> getBeans(String className){
        manager = HibernateConnection.getEntityManager();
        Query query = manager.createQuery("from " + className);
        List<T> lista = query.getResultList();
        return lista;
    }

    @Override
    public List<T> getBeansByExample(T bean){
        return null;
    }
    
    public T ListByExample(String pkName , String pkValue , String cls){
        manager = HibernateConnection.getEntityManager();
        String sql = "from " + cls + " where " + pkName + " =:value";
        Query query = manager.createQuery(sql);
        query.setParameter("value" , pkValue);
        T t = (T) query.getSingleResult();
        manager.close();
        return t;
    }
    
    public List<T> ListByExamplesCod(String atributoName , Long codigo , String cls){
        manager = HibernateConnection.getEntityManager();
        String sql = "from " + cls + " p where p." + atributoName + ".codigo =:value";
        Query query = manager.createQuery(sql);
        query.setParameter("value", codigo);
        List<T> t =  query.getResultList();
        manager.close();
        return  t;
    }
    
    public List<T> ListaDinamica(String pkName , String pkValue , String cls){
        manager = HibernateConnection.getEntityManager();
        String sql = "from " + cls + " where " + pkName + " like :value";
        Query query = manager.createQuery(sql);
        query.setParameter("value" , "%" + pkValue + "%");
        List<T> t =  query.getResultList();
        manager.close();
        return t;
    }
      
}
