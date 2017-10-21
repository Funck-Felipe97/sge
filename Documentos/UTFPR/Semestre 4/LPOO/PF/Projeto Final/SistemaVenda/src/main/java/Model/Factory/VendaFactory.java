/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Factory;

import Model.BusinessObject.Venda;
import Model.BusinessObject.VendaAprazo;
import Model.BusinessObject.VendaAvista;

/**
 *
 * @author Felipe
 */
public enum VendaFactory {
    
    vista {
        @Override
        public Venda getVenda() {
            return new VendaAvista();
        }
    },
    prazo {
        @Override
        public Venda getVenda() {
            return new VendaAprazo();
        }
    };
    
    public abstract Venda getVenda();
    
}
