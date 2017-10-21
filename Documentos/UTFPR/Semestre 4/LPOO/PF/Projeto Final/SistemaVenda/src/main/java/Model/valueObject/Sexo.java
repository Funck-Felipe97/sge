
package Model.valueObject;

/**
 *
 * @author funck
 */

public enum Sexo {
    
    masculino("Masculini"),
    feminino("Femilino");
    
    private String tipo;

    private Sexo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
