
package SGE.Model.Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author funck
 */
public class GenerecDao<T> implements HibernateInterface<T>{

    protected EntityManager manager;
    protected EntityTransaction tx;
    
    public GenerecDao(EntityManager manager){
        this.manager = manager;
    }
    
    @Override
    public void salvar(T t) {
        tx = manager.getTransaction();
        tx.begin();
            manager.persist(t);
        tx.commit();
    }

    @Override
    public void excluir(T t) {
        tx = manager.getTransaction();
        tx.begin();
            manager.remove(t);
        tx.commit();
    }

    @Override
    public List<T> listar(Class cls) {
        Query query = manager.createQuery("from " + cls.getSimpleName());
        List<T> lista = query.getResultList();
        return lista;
    }

    @Override
    public T getBean(Integer codigo , Class cls) {
        T t = (T) manager.find(cls, codigo);
        return t;
    }

    @Override
    public void atualizar(T t) {
        tx = manager.getTransaction();
        tx.begin();
            manager.merge(t);       
        tx.commit();
    }
    
}
