
package Model.BusinessObject;

import Singleton.CaixaSingleton;
import Model.valueObject.*;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Felipe
 */

@Entity
public class Caixa {
    
    @Id
    @GeneratedValue
    private Long codigo;
    
    private boolean status;
    
    @Transient
    private Double valorAbertura;
    
    @Transient
    private Double valorFechamento;
    
    @Transient
    private Double valorAtual;
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Double getValorAbertura() {
        return valorAbertura;
    }

    public void setValorAbertura(Double valor) {
        valorAbertura = valor;
    }

    public Double getValorFechamento() {
        return valorFechamento;
    }

    public void setValorFechamento(Double valor) {
        valorFechamento = valor;
    }

    public Double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(Double valorAtual) {
        this.valorAtual = valorAtual;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caixa other = (Caixa) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    public void abrirCaixa(Double valor){
        this.status = true;
        valorAbertura = valor;
        this.valorAtual = valor;
        CaixaSingleton.setCaixa(this);
    }
    
    public void fecharCaixa(){
        CaixaSingleton.setCaixa(null);
        this.status = false;
        this.valorAtual = 0.0;
    }
    
    public void add(Double valor){
        valorAtual += valor;
    }
    
    public void sub(Double valor){
        valorAtual -= valor;
    }

}
