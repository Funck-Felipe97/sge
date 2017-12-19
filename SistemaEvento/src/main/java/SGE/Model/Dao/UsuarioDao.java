
package SGE.Model.Dao;

import SGE.Model.UsuarioBean.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author funck
 */
public class UsuarioDao extends GenerecDao<Usuario>{
    
    public UsuarioDao(EntityManager manager) {
        super(manager);
    }
    
    public Usuario findByLogin(String login){
        String jpql = "from Usuario where login = :valor";
        Query query = manager.createQuery(jpql);
        query.setParameter("valor" , login);
        Usuario u = (Usuario) query.getSingleResult();
        return u;
    }
    
}
