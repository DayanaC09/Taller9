import Video1_2.Empleado;
import Video1_2.Empleados;
import Video1_2.Uso_Empleado;

public class Aplicacion {
	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.CambiarSeccion("RRHH");

		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
		
		Uso_Empleado UsoEmpleados = new Uso_Empleado();
	}
}


