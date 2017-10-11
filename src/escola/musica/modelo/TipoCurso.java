package escola.musica.modelo;

public enum TipoCurso {
	
	CUERDA("Cuerda"),
	MADERA("Madera"),
	METAL("Metal"),
	PERCUSION("Percusion");
	
  	private String label;
	
  	private TipoCurso(String label) {
  		this.label=label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
  	
}
