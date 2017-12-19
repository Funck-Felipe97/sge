package SGE.Model.EventoBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Foto {
        
        @Id
        @GeneratedValue
	private Integer id;
        
        @Column(length = 40)
	private String descricao;
        
        @Lob
	private Byte[] foto;
        
        @Column(length = 40)
	private String nomeArquivo;
        
        @Column(length = 40)
	private String caminhoArquivo;
	private Boolean publicar;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Byte[] getFoto() {
		return foto;
	}
	
	public void setFoto(Byte[] foto) {
		this.foto = foto;
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
	
	public Boolean getPublicar() {
		return publicar;
	}
	
	public void setPublicar(Boolean publicar) {
		this.publicar = publicar;
	}
	
}
