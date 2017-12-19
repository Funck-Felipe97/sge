package SGE.Model.UsuarioBean;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Palestrante extends Usuario implements Serializable {

    @Column(length = 40)
    private String formacao;

    @Column(length = 40)
    private String banco;

    @Column(length = 40)
    private String agencia;

    @Column(length = 40)
    private String conta;

    @Column(length = 40)
    private String localOrigem;

    @Column(length = 40)
    private String instituição;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getInstituição() {
        return instituição;
    }

    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

}
