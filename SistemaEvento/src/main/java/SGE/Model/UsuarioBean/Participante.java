package SGE.Model.UsuarioBean;

import SGE.Model.EventoBean.Atividade;
import SGE.Model.EventoBean.Evento;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"rg" , "ra"})})
public class Participante extends Usuario{
        
        @Column(length = 20)
	private String ra;
        
        @Column(length = 20)
	private String rg;
        
        @Column(length = 40)
	private String endereco;
        
        @Column(length = 40)
	private String cidade;
        
        @Column(length = 2)
	private String uf;
        
        @Column(length = 15)
	private String cep;
        
        @ManyToOne
        @JoinColumn(name = "evento_id")
	private Evento evento;
        
        @Temporal(TemporalType.DATE)
	private Date dataInscricao;
        
        @ManyToMany(cascade = CascadeType.REFRESH)
        @JoinTable(name = "Atividade_Participante")
	private List<Atividade> atividades;

        
	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Evento getEvento() {
		return evento;
	}
	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	public Date getDataInscricao() {
		return dataInscricao;
	}
	
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
}
