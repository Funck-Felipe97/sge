
package SGE.Service;

import SGE.Model.Dao.HibernateConnection;
import SGE.Model.Dao.UsuarioDao;
import SGE.Model.EventoBean.Artigo;
import SGE.Model.EventoBean.Evento;
import SGE.Model.UsuarioBean.Participante;
import SGE.Model.UsuarioBean.Usuario;
import SGE.Util.UsuarioUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author funck
 */
public class UsuarioService {
    
    private UsuarioDao usuarioDao;
    private EntityManager manager;
    
    public UsuarioService(){
        manager = HibernateConnection.getConnection();
        usuarioDao = new UsuarioDao(manager);
    }
    
    public Boolean autenticar(String login , String senha){
        Usuario u = usuarioDao.findByLogin(login);
        if(u != null){
            if(u.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
    
    public void salvar(Usuario u){
        usuarioDao.salvar(u);
    }
    
    public void deletar(Usuario u){
        usuarioDao.excluir(u);
    }
    
    public void atualizar(Usuario u){
        usuarioDao.atualizar(u);
    }
    
}
