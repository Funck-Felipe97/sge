
package SGE.Controller;

import SGE.Model.Dao.HibernateConnection;
import SGE.Model.EventoBean.Evento;
import SGE.Model.UsuarioBean.ComissaoEvento;
import SGE.Service.EventoService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author funck
 */

@ManagedBean
@SessionScoped
public class EventoController {
    
    private EventoService eventoService;
    private ComissaoEvento resposanvel;
    private Evento evento;
    
    public EventoController(){
        evento = new Evento();
        resposanvel = new ComissaoEvento();
    }
    
    public void salvar(){
        
    }
    
    public ComissaoEvento getResposanvel() {
        return resposanvel;
    }

    public void setResposanvel(ComissaoEvento resposanvel) {
        this.resposanvel = resposanvel;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public EventoService getEventoService() {
        return eventoService;
    }

    public void setEventoService(EventoService eventoService) {
        this.eventoService = eventoService;
    }
    
    

}
