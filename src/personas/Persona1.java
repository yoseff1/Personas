package personas;

public class Persona1 {
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private int altura;
	private int peso;
	
	public Persona1(String nombre, String apellido,String dni,int edad,int altura,int peso) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setEdad(edad);
		this.setAltura(altura);
		this.setPeso(peso);
		}
	
	public void caminar() {
		System.out.println("Empieza a caminar");
		}
	public void sentar() {
		System.out.println("se sienta");
		}
	public void parar() {
		System.out.println("se detiene");
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
