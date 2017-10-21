
package Model.BusinessObject;

/**
 *
 * @author Felipe
 */
public enum TipoPagamento {
    
    dinheiro("Dinheiro"),
    cartaoC("Cartão de credito"),
    cartaoD("Cartão de debito"),
    cheque("Cheque");
    
    String tipo;

    private TipoPagamento(String tipo) {
        this.tipo = tipo;
    }
    
}
