package SGE.Model.UsuarioBean;

public enum Funcao {

	responsavel("Responsavel do evento"),
	organizacao("Comissao Organizadora");
	
	private String funcao;
	
	private Funcao(String funcao) {
		this.funcao = funcao;
	}

	public String getFuncao(){
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
