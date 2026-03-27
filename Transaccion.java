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
}
