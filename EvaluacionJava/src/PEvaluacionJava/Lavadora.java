package PEvaluacionJava;
/**
 * Esta clase contiene los atributos y metodos de la Clase Lavadora
 * y hereda de la clase Electrodomestico
 * @author Nadia Rojas
 *@version 24-02-2020
 *@see <a href="https://github.com/nnrojasv/EvaluacionJava">Enlace a Github</a>
 */
public class Lavadora extends Electrodomestico {
	private int carga;

	/**
	 * Constructor vacio de la clase Lavadora
	 * llama al constructor por defecto de la clase Electrodomesticos y asigna por defecto la carga
	 */
	Lavadora(){
		super();
		this.carga= 5;
	}
	/**
	 * Constructor vacio de la clase Lavadora
	 * recibe 2 parametros y asigna demas valores por defecto
	 * llama al constructor la clase padre y asigna por defecto la carga
	  * @param _precio precio del objeto en euros
	 * @param _peso peso del objeto en kilogramos
	 */
	Lavadora(int _precio, int _peso){
		super(_precio, _peso);
		this.carga=5;
	}
	/**
	 * Constructor de la clase, recibe parametros para cada atributo de clase
	 * llama al constructor de clase padre
	 * @param _precio precio del objeto en euros
	 * @param _peso peso del objeto en kilogramos
	 * @param _color color del objeto 
	 * @param _consumo calificacion de consumo energetivo 
	 * @param _carga carga maxima en kg
	 */
	Lavadora(int _precio, int _peso, String _color, char _consumo, int _carga){
		super(_precio, _peso,  _color, _consumo)	;
		this.carga=_carga;
	}

	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo precioFinal llama al metodo precioFinal de la clase padre 
	 * y asigna valor extra al objeto segun su carga
	 * 
	 */
	public void precioFinal() {
		super.precioFinal();
		int preciofinal=super.getPrecioBase();
		if (this.carga>30) {
			preciofinal= (int) (preciofinal*1.30);
			super.setPrecioBase(preciofinal);
		}

	}
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", getPrecioBase()=" + getPrecioBase() + ", getColor()=" + getColor()
		+ ", getConsumo()=" + getConsumo() + ", getPeso()=" + getPeso() + "]";
	}
}

