/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGE.Service;

import SGE.Model.Dao.EventoDao;
import SGE.Model.Dao.HibernateConnection;
import SGE.Model.EventoBean.Evento;
import javax.persistence.EntityManager;

/**
 *
 * @author funck
 */
public class EventoService {
    
    private EventoDao eventoDao;
    private EntityManager manager;

    public EventoService(){
        manager = HibernateConnection.getConnection();
        eventoDao = new EventoDao(manager);
    }
    
    public Boolean salvar(Evento evento){
        eventoDao.salvar(evento);
        manager.close();
        HibernateConnection.close();
        return true;
    }
    
}
