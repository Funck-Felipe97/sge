package SGE.Model.EventoBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Patricinador {
        
        @Id
        @GeneratedValue
	private Integer id;
        
        @Column(length = 40)
	private String nome;
        
        @Column(length = 40)
	private String razaoSocial;
        
        @Column(length = 40)
	private String cnpj;
        
        @Column(length = 40)
	private String endereco;
        
        @Column(length = 40)
	private String bairro;
        
        @Column(length = 40)
	private String cidade;
        
        @Column(length = 20)
	private String telefone;
        
        @Lob
	private Byte[] logoImagem;
        
        @Column(length = 40)
	private String logoTexto;
	
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
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

}
