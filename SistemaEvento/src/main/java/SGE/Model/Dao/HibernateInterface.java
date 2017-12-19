
package SGE.Model.Dao;

import java.util.List;

/**
 *
 * @author funck
 */
public interface HibernateInterface<T>{
    
    public void salvar(T t);
    public void excluir(T t);
    public void atualizar(T t);
    public List<T> listar(Class cls);
    public T getBean(Integer codigo , Class cls);
    
}
