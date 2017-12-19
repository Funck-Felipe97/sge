package SGE.Model.EventoBean;

public enum Status {

	recusado("Artigo recusao"),
	aceito("Artigo aceito"),
	naoCorrigido("Artigo não corrijido"),
	rejeitado("Artigo rejeitado");
	
	private String status;
	
	private Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
