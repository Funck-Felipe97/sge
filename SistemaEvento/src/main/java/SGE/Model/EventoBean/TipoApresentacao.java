package SGE.Model.EventoBean;

public enum TipoApresentacao {

	oral("Apresentação Oral"),
	banner("Apresentação de Banner");
	
	private String tipo;
	
	private TipoApresentacao(String tipo) {
		this.tipo = tipo;
	}
	
}
