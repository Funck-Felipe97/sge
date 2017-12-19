package SGE.Model.UsuarioBean;

import SGE.Model.EventoBean.Evento;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import sun.security.util.Length;

@Entity
public class ComissaoEvento {

    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(length = 40)
    private String identificacao;

    @Enumerated(EnumType.STRING)
    private Funcao funcaoEvento;

    @ManyToOne
    private Evento evento;

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Funcao getFuncaoEvento() {
        return funcaoEvento;
    }

    public void setFuncaoEvento(Funcao funcaoEvento) {
        this.funcaoEvento = funcaoEvento;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
