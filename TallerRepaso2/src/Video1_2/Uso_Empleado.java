package Video1_2;

public class Uso_Empleado {
	public Uso_Empleado() {
		Empleado[] misEmpleados = new Empleado[4];

		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(0);
		}
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre()
			+ " Sueldo: " + e.dameSueldo()
			+ " Fecha de Alta: " + e.dameFechaContrato());
		}
	}

}
