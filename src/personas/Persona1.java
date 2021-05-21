package personas;

public class Persona1 {
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private int altura;
	private int peso;
	
	public Persona1(String nombre, String apellido,String dni,int edad,int altura,int peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
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
}
