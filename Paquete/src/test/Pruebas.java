package test;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paquete1.persona p = new paquete1.persona(20,"Javier");
		paquete2.persona m = new paquete2.persona(18,"Luis","Masculino");
		System.out.println("Inicio de impresion");
		System.out.println(p.toString());
		System.out.println(m.toString());
		System.out.println("Fin");

	}

}
