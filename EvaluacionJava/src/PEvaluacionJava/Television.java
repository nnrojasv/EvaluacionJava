package PEvaluacionJava;
/**
 * Esta clase contiene los atributos y metodos de la Clase Television
 * y hereda de la clase Electrodomesticos
 * @author Nadia Rojas
 *@version 24-02-2020
 *@see <a href="https://github.com/nnrojasv/EvaluacionJava">Enlace a Github</a>
 */
public class Television extends Electrodomestico{
	private int resolucion;
	private boolean sintonizadorTDT;
	/**
	 * Constructor vacio de la clase Television
	 * llama al constructor por defecto de la clase Electrodomesticos y asigna por defecto los demas atributos
	 */
	Television(){
		super();
		this.resolucion= 20;
		this.sintonizadorTDT= false;
	}
	/**
	 * Constructor vacio de la clase Lavadora
	 * recibe 2 parametros y asigna demas valores por defecto
	 * llama al constructor la clase padre y asigna por defecto los demas atributos
	  * @param _precio precio del objeto en euros
	 * @param _peso peso del objeto en kilogramos
	 */
	Television(int _precio, int _peso){
		super(_precio, _peso);
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}

	/**
	 * Constructor de la clase, recibe parametros para cada atributo de clase
	 * llama al constructor de clase padre
	 * @param _precio precio del objeto en euros
	 * @param _peso peso del objeto en kilogramos
	 * @param _color color del objeto 
	 * @param _consumo calificacion de consumo energetivo 
	 * @param _resolucion resolucion en pulgadas
	 * @param _sintonizador señala si posee o no sintonizador TDT
	 */
	Television(int _precio, int _peso, String _color, char _consumo, int _resolucion, boolean _sintonizador){
		super(_precio, _peso,  _color, _consumo)	;
		this.resolucion=-resolucion;
		this.sintonizadorTDT= _sintonizador;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	/**
	 * Metodo precioFinal llama al metodo precioFinal de la clase padre 
	 * y asigna valor extra al objeto segun resolucion y si posee o no sintonizador TDT
	 */
	public void precioFinal() {
		super.precioFinal();
		int preciofinal=super.getPrecioBase();
		if (getResolucion()>40) {
			preciofinal= (int) (preciofinal*1.30);
			if (isSintonizadorTDT()==true) {
				preciofinal= preciofinal + (50*800);
				super.setPrecioBase(preciofinal);
			}
		}
		super.setPrecioBase(preciofinal);
		
	}
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ", getPrecioBase()="
				+ getPrecioBase() + ", getColor()=" + getColor() + ", getConsumo()=" + getConsumo() + ", getPeso()="
				+ getPeso() + "]";
	}
}
