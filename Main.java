public class Main {

    public static void main(String[] args) {
        System.out.println("===== Billetera Digital =====");
        System.out.println();

        // --- Integrante 1: Billetera ---
        // Crear una instancia de Billetera con datos reales.
        Billetera miBilletera = new Billetera("Carlos Mendoza", "BW-00123", 500.0);
        
        // Llamar a: mostrarInfo(), depositar() y retirar().
        miBilletera.mostrarInfo();
        miBilletera.depositar(150.0);
        miBilletera.retirar(200.0);
        // Prueba adicional de fondos insuficientes para mostrar el flujo completo
        miBilletera.retirar(1000.0); 

        System.out.println("-------------------------------------------");

        // --- Integrante 2: Transaccion ---
        // Crear una instancia de Transaccion con datos reales.
        Transaccion miTransaccion = new Transaccion("TRANSFERENCIA", 75.0, "Pago de servicio");
        
        // Llamar a: mostrarDetalle(), aplicarComision() y marcarFallida().
        miTransaccion.mostrarDetalle();
        miTransaccion.aplicarComision(2.5);
        miTransaccion.marcarFallida();

        System.out.println("-------------------------------------------");

        // --- Integrante 3: Contacto ---
        // Crear una instancia de Contacto con datos reales.
        Contacto miContacto = new Contacto("Laura Torres", "BW-00456", "BilletraXYZ");
        
        // Llamar a: mostrarContacto(), marcarFavorito() y enviarDinero().
        miContacto.mostrarContacto();
        miContacto.marcarFavorito();
        miContacto.enviarDinero(120.0);

        System.out.println();
        System.out.println("===== Fin del sistema =====");
    }
}
