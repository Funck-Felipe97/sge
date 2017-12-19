package SGE.Model.EventoBean;


import SGE.Model.UsuarioBean.Palestrante;
import SGE.Model.UsuarioBean.Participante;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Atividade {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 40)
    private String nome;
    private String observacao;

    @Column(length = 40)
    private String responsal;

    @ManyToOne
    private Palestrante palestrante;
    
    @Temporal(TemporalType.DATE)
    private Date data;

    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioInicio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioTermino;

    @ManyToOne
    private Sala sala;

    @ManyToMany
    @JoinTable(name = "atividade_equipamento")
    private List<Equipamento> equipamentos;

    @ManyToOne
    private Evento evento;

    @ManyToMany
    private List<Participante> participantes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getResponsal() {
        return responsal;
    }

    public void setResponsal(String responsal) {
        this.responsal = responsal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(Date horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
    
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    
    
}
