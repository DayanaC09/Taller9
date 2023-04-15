package Video1_2;

public class Empleados {
	private String name;
	private String seccion = "Administración";
	private int id;
	private static int idNext = 1;
	
	public Empleados(String name) {
		setName(name);
		id = idNext;
		idNext++;
	}
	
	public String devuelveDatos() {
		return "El nombre es: " + getName() + " la sección es: " + getSeccion() + " y el ID: " + getId();
	}
	
	public static String dameIdSiguiente() {
		return "El siguiente ID es: " + getIdNext();
	}
	
	public void CambiarSeccion(String seccion) {
		setSeccion(seccion);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdNext() {
		return idNext;
	}

	public static void setIdNext(int idNext) {
		Empleados.idNext = idNext;
	}

}
