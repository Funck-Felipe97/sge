package SGE.Model.EventoBean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Artigo implements Serializable {
        
        @Id
        @GeneratedValue
        private Integer id;
        
        @Column(length = 40 , nullable = false)
	private String nome;
        
        @Column(length = 40 , nullable = false)
	private String descricao;
        
        @Column(length = 40)
	private String nomeArquivo;
        
        @Column(length = 40)
	private String caminhoArquivo;
        
        @Lob
        @Column(nullable = false)
	private Byte[] arquivo;
        
        @OneToMany
        @Column(nullable = false)
	private List<Autor> autores;
	
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
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}
	
	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	
	public Byte[] getArquivo() {
		return arquivo;
	}
	
	public void setArquivo(Byte[] arquivo) {
		this.arquivo = arquivo;
	}
	
	public List<Autor> getAutores() {
		return autores;
	}
	
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
}
