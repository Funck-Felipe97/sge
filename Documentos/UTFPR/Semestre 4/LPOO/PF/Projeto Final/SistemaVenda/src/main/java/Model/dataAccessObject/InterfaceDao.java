
package Model.dataAccessObject;

import java.util.List;

/**
 *
 * @author Felipe
 */
public interface InterfaceDao<T> {
    
    
    public void salvar(T bean);
    public void atualizar(T bean);
    public void excluir(T bean);
    public T getBean(Class cls , Long codigo);
    public List<T> getBeans(String className);
    public List<T> getBeansByExample(T bean);
    
}
