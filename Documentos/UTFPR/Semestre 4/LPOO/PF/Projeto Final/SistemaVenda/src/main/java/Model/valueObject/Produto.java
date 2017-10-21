
package Model.valueObject;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author Felipe
 */

@Entity
public class Produto {
    
    @Id
    @GeneratedValue
    @Column(name = "pro_codigo")
    private Long codigo;
    
    @Column(name = "pro_valor" , scale = 2 , precision = 10 , nullable = false)
    private Double valor;
    
    @Column(name = "pro_descricao" , nullable =  false , length = 40)
    private String descricao;
    
    @ManyToOne(cascade = {CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinColumn(name = "cat_codigo")
    private Categoria categoria;
    
    private Integer quantidadeEstoque;
    
    @Transient
    private Double porcentagemDesc;
    
    @Transient
    private Double valorFinal;
    
    @Transient
    private Double valorDesconto;
    
    public Produto(){
        this.valorDesconto = 0.0;
        this.porcentagemDesc = 0.0;
        this.valorFinal = 0.0; 
        this.valor = 0.0;
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPorcentagemDesc() {
        return porcentagemDesc;
    }

    public void setPorcentagemDesc(Double porcentagemDesc) {
        this.porcentagemDesc = porcentagemDesc;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.codigo);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
}
