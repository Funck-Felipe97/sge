package SGE.Model.EventoBean;

import SGE.Model.UsuarioBean.ComissaoEvento;
import SGE.Model.UsuarioBean.Participante;
import java.util.Date;import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
;

@Entity
public class Submissao {
        
        @Id
        @GeneratedValue
	private Integer id;
        
        @Temporal(TemporalType.TIMESTAMP)
	private Date dataSubmissao;
        
        @Temporal(TemporalType.DATE)
	private Date dataLimiteResposta;
        
        @Temporal(TemporalType.DATE)
	private Date dataAberturaEnvio;
        
        @Temporal(TemporalType.DATE)
	private Date dataFechamentoEnvio;
        
        @Temporal(TemporalType.DATE)
	private Date dataResposta;
        
        @Temporal(TemporalType.DATE)
	private Date dataEnvioRevisor;
        
        @Temporal(TemporalType.DATE)
	private Date dataFinalReenvio;
        
        @Column(length = 40)
	private String area;
        
        @Column(length = 40)
	private String observacao;
	private Boolean correcao;
	private Boolean reenvio;
        
        @ManyToOne
	private ComissaoEvento responsavel;
        
        @Enumerated(EnumType.STRING)
	private Status status;
        
        @OneToOne
	private Artigo artigo;
        
        @ManyToOne
	private Participante participante;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDataSubmissao() {
		return dataSubmissao;
	}
	
	public void setDataSubmissao(Date dataSubmissao) {
		this.dataSubmissao = dataSubmissao;
	}
	
	public Date getDataLimiteResposta() {
		return dataLimiteResposta;
	}
	
	public void setDataLimiteResposta(Date dataLimiteResposta) {
		this.dataLimiteResposta = dataLimiteResposta;
	}
	
	public Date getDataAberturaEnvio() {
		return dataAberturaEnvio;
	}
	
	public void setDataAberturaEnvio(Date dataAberturaEnvio) {
		this.dataAberturaEnvio = dataAberturaEnvio;
	}
	
	public Date getDataFechamentoEnvio() {
		return dataFechamentoEnvio;
	}
	
	public void setDataFechamentoEnvio(Date dataFechamentoEnvio) {
		this.dataFechamentoEnvio = dataFechamentoEnvio;
	}
	
	public Date getDataResposta() {
		return dataResposta;
	}
	
	public void setDataResposta(Date dataResposta) {
		this.dataResposta = dataResposta;
	}
	
	public Date getDataEnvioRevisor() {
		return dataEnvioRevisor;
	}
	
	public void setDataEnvioRevisor(Date dataEnvioRevisor) {
		this.dataEnvioRevisor = dataEnvioRevisor;
	}
	
	public Date getDataFinalReenvio() {
		return dataFinalReenvio;
	}
	
	public void setDataFinalReenvio(Date dataFinalReenvio) {
		this.dataFinalReenvio = dataFinalReenvio;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public Boolean getCorrecao() {
		return correcao;
	}
	
	public void setCorrecao(Boolean correcao) {
		this.correcao = correcao;
	}
	
	public Boolean getReenvio() {
		return reenvio;
	}
	
	public void setReenvio(Boolean reenvio) {
		this.reenvio = reenvio;
	}
	
	public ComissaoEvento getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(ComissaoEvento responsavel) {
		this.responsavel = responsavel;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	public Artigo getArtigo() {
		return artigo;
	}

	public void setArtigo(Artigo artigo) {
		this.artigo = artigo;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

}
