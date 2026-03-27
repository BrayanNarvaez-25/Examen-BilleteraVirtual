public class Transaccion {
    //ATRIBUTOS
	private  String tipo;
	private double monto;
	private String descripcion;
	private boolean exitosa;
	
    //CONSTRUCTOR VACIO
	public Transaccion() {
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Transaccion(String tipo, double monto, String descripcion) {
		super();
		this.tipo = tipo;
		this.monto = monto;
		this.descripcion = descripcion;
		this.exitosa=true;
	}

    
	//METODOS GET Y SET
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isExitosa() {
		return exitosa;
	}

	public void setExitosa(boolean exitosa) {
		this.exitosa = exitosa;
	}
    
    
	//METODO MOSTRAR DETALLE 
	public void mostrarDetalle() {
		System.out.println("---- Detalle de Transacción ----");
		System.out.println("Tipo:" +tipo);
		System.out.println("Monto: "+monto);
		System.out.println("Descripción: "+descripcion);
		if(exitosa) {
			System.out.println("Estado: Exitosa");
		}else {
			System.out.println("Estado: Fallida");
		}		
	}
}
