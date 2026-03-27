public class Billetera {
    private String propietario;
	private String numeroCuenta;
	private double saldo;
	private boolean activa;
	
	public Billetera(String propietario, String numeroCuenta, double saldo) {
		super();
		this.propietario = propietario;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.activa = true;
	}
    public void mostrarInfo() {
		System.out.println("=== Billetera Digital ===");
		System.out.println("\nPropietario: "+this.propietario +
				"\nCuenta: " + this.numeroCuenta +
				"\nSaldo: $" + this.saldo);
		String estadoTexto = (this.activa) ? "Sí" : "No";
	    System.out.println("Activa: " + estadoTexto);
	}
    public void depositar(double monto) {
		this.saldo += monto;
		System.out.println("\nDeposito exitoso: +$"+monto + 
				"\nNuevo saldo: $"+this.saldo);
	}
}
