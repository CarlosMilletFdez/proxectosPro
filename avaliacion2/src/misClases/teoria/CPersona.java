package misClases.teoria;

public class CPersona {

	private String nombre;
	private String dirección;
	private long teléfono;
	
	public CPersona(){
		
	}
	
	public CPersona(String nom, String dir, long tel) {
		
		nombre= nom;
		dirección = dir;
		teléfono = tel;
		
	}
	
	public void asignarNombre(String nom) {
		
		nombre = nom;
	}
	
	public String obtenerNombre() {
		
		return nombre;
		
	}
	
	public void asignarDirección(String dir) {
		
		dirección = dir;
	}
	
	public String obtenerDirección() {
		
		return dirección;
		
	}
	
	public void asignarTeléfono(long tel) {
		
		teléfono = tel;
	}
	
	public long obtenerTeléfono() {
		
		return teléfono;
		
	}
	
	public void mostrarPersona() {
		
		System.out.println("\n"+nombre);
		System.out.println(dirección);
		System.out.println(teléfono);
		System.out.println();
	}
}
