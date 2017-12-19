
package SGE.Util;

import SGE.Model.EventoBean.Evento;

/**
 *
 * @author funck
 */

public class EventoUtil {
    
    private static Evento evento;
    
    public static Evento getEventoAtual(){
        if(evento != null){
            synchronized(evento){
                return evento;
            }
        }
        return null;
    }
    
}
