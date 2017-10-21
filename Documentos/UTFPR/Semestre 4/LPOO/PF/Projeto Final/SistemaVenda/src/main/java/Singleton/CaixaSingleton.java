
package Singleton;

import Model.BusinessObject.Caixa;

/**
 *
 * @author funck
 */
public class CaixaSingleton {
    
    private static Caixa caixa;
    
    private CaixaSingleton(){
        
    }
    
    public static Caixa getCaixa(){
        return caixa;
    }
    
    public static void setCaixa(Caixa c){
        caixa = c;
    }
    
}
