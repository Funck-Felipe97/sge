package SGE.Model.EventoBean;

import SGE.Model.UsuarioBean.ComissaoEvento;
import SGE.Model.UsuarioBean.Participante;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Evento {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 40)
    private String nome;
    private String textoApresentacao;
    private Boolean pago;
    private Boolean palestrasLivres;

    @Lob
    private Byte[] logoImagem;
    private String logoTexto;

    @Column(length = 20)
    private String campus;

    @Column(length = 40)
    private String nomeDiretor;

    @Column(length = 40)
    private String cargoDiretor;

    @Column(length = 40)
    private String nomeCoordenadorEvento;

    @Column(length = 40)
    private String cargoCoordenadorEvento;

    @Temporal(TemporalType.DATE)
    private Date dataInicial;

    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    @Temporal(TemporalType.DATE)
    private Date dataInscricaoInicial;

    @Temporal(TemporalType.DATE)
    private Date dataInscricaoFinal;

    @OneToMany(mappedBy = "evento")
    private List<Participante> participantes;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    @OneToMany
    private List<Foto> fotos;

    @OneToMany(mappedBy = "evento")
    private List<ComissaoEvento> comissao;

    @OneToOne(cascade = CascadeType.PERSIST)
    private ComissaoEvento responsavel;
    
    @OneToOne
    private ComissaoEvento responsavelArtigo;

    @OneToMany
    private List<Patricinador> patrocinadores;

    @OneToMany
    private List<Download> dawnloads;

    @OneToMany(mappedBy = "evento")
    private List<Atividade> atividades;

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

    public String getTextoApresentacao() {
        return textoApresentacao;
    }

    public void setTextoApresentacao(String textoApresentacao) {
        this.textoApresentacao = textoApresentacao;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Boolean getPalestrasLivres() {
        return palestrasLivres;
    }

    public void setPalestrasLivres(Boolean palestrasLivres) {
        this.palestrasLivres = palestrasLivres;
    }

    public Byte[] getLogoImagem() {
        return logoImagem;
    }

    public void setLogoImagem(Byte[] logoImagem) {
        this.logoImagem = logoImagem;
    }

    public String getLogoTexto() {
        return logoTexto;
    }

    public void setLogoTexto(String logoTexto) {
        this.logoTexto = logoTexto;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getCargoDiretor() {
        return cargoDiretor;
    }

    public void setCargoDiretor(String cargoDiretor) {
        this.cargoDiretor = cargoDiretor;
    }

    public String getNomeCoordenadorEvento() {
        return nomeCoordenadorEvento;
    }

    public void setNomeCoordenadorEvento(String nomeCoordenadorEvento) {
        this.nomeCoordenadorEvento = nomeCoordenadorEvento;
    }

    public String getCargoCoordenadorEvento() {
        return cargoCoordenadorEvento;
    }

    public void setCargoCoordenadorEvento(String cargoCoordenadorEvento) {
        this.cargoCoordenadorEvento = cargoCoordenadorEvento;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataInscricaoInicial() {
        return dataInscricaoInicial;
    }

    public void setDataInscricaoInicial(Date dataInscricaoInicial) {
        this.dataInscricaoInicial = dataInscricaoInicial;
    }

    public Date getDataInscricaoFinal() {
        return dataInscricaoFinal;
    }

    public void setDataInscricaoFinal(Date dataInscricaoFinal) {
        this.dataInscricaoFinal = dataInscricaoFinal;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public List<ComissaoEvento> getComissao() {
        return comissao;
    }

    public void setComissao(List<ComissaoEvento> comissao) {
        this.comissao = comissao;
    }

    public List<Patricinador> getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(List<Patricinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public List<Download> getDawnloads() {
        return dawnloads;
    }

    public void setDawnloads(List<Download> dawnloads) {
        this.dawnloads = dawnloads;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public ComissaoEvento getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ComissaoEvento responsavel) {
        this.responsavel = responsavel;
    }

    public ComissaoEvento getResponsavelArtigo() {
        return responsavelArtigo;
    }

    public void setResponsavelArtigo(ComissaoEvento responsavelArtigo) {
        this.responsavelArtigo = responsavelArtigo;
    }
    
}
