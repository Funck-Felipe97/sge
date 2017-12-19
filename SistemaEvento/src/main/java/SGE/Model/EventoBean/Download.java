package SGE.Model.EventoBean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Download {
        
        @Id
        @GeneratedValue
        private Integer id;
    
        @Column(length = 40)
	private String descricao;
        
        @Temporal(TemporalType.DATE)
	private Date data;
        
        @Column(length = 40)
	private String nomeArquivo;
        
        @Lob
	private Byte[] arquivo;
        
        @Column(length = 40)
	private String tamanho;
        
        @Column(length = 40)
	private String diretorio;
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
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public Byte[] getArquivo() {
		return arquivo;
	}
	
	public void setArquivo(Byte[] arquivo) {
		this.arquivo = arquivo;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getDiretorio() {
		return diretorio;
	}
	
	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
	
	public Boolean getPublicar() {
		return publicar;
	}
	
	public void setPublicar(Boolean publicar) {
		this.publicar = publicar;
	}

}
