package misClases.teoria;

public class CPersona {

	private String nombre;
	private String direcci�n;
	private long tel�fono;
	
	public CPersona(){
		
	}
	
	public CPersona(String nom, String dir, long tel) {
		
		nombre= nom;
		direcci�n = dir;
		tel�fono = tel;
		
	}
	
	public void asignarNombre(String nom) {
		
		nombre = nom;
	}
	
	public String obtenerNombre() {
		
		return nombre;
		
	}
	
	public void asignarDirecci�n(String dir) {
		
		direcci�n = dir;
	}
	
	public String obtenerDirecci�n() {
		
		return direcci�n;
		
	}
	
	public void asignarTel�fono(long tel) {
		
		tel�fono = tel;
	}
	
	public long obtenerTel�fono() {
		
		return tel�fono;
		
	}
	
	public void mostrarPersona() {
		
		System.out.println("\n"+nombre);
		System.out.println(direcci�n);
		System.out.println(tel�fono);
		System.out.println();
	}
}
