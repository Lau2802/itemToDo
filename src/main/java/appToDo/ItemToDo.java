package appToDo;

public class ItemToDo {

	private int numero;
	private String nombre;
	private boolean completado;
	
	
	
	public ItemToDo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemToDo(int numero, String nombre, boolean completado) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.completado = completado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
	
	public boolean getCompletado() {
		return this.completado;
	}
	@Override
	public String toString() {
		return "ItemToDo [numero=" + numero + ", nombre=" + nombre + ", completado=" + completado + "]";
	}
	
	
	
}
