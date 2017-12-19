
package SGE.Model.Dao;

import SGE.Model.EventoBean.Atividade;
import SGE.Model.EventoBean.Evento;
import SGE.Model.UsuarioBean.Palestrante;
import SGE.Model.UsuarioBean.Participante;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author funck
 */
public class EventoDao extends GenerecDao<Evento>{
    
    public EventoDao(EntityManager manager) {
        super(manager);
    }
   
}
