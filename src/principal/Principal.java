package principal;

import personas.Persona1;

public class Principal {
	public static void main(String[] args) {
		Persona1 UsuarioA = new Persona1("Pedro", "Gutierrez", "95743254", 32, 184,82);
		
		UsuarioA.caminar();
	}

}
