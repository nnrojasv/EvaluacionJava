package PEvaluacionJava;
/**
 * Esta clase contiene los atributos y metodos de la Clase Electrodomesticos
 * y sera utilizada como superclase
 * @author Nadia Rojas
 *@version 24-02-2020
 *@see <a href="https://github.com/nnrojasv/EvaluacionJava">Enlace a Github</a>
 */
public class Electrodomestico {
	//Atributos de clase
	private  int precioBase ;
	private  String color ;
	private  char consumo ;
	private  int peso;

	/**
	 * Constructor vacio de la clase asigna valores por defecto a los atributos
	 * no recibe parametros
	 */
	Electrodomestico(){
		this.precioBase = 100000;
		this.color = "blanco";
		this.consumo = 'f';
		this.peso = 5;

	}
	/**
	 * Constructor de la clase, recibe 2 parametros y asigna los otros atributos por defecto
	 * @param _precio precio del objeto en euros
	 * @param _peso peso del objeto en kilogramos
	 */
	Electrodomestico(int _precio, int _peso){
		precioBase = _precio;
		peso = _peso;
		this.color = "blanco";
		this.consumo = 'f';
	}
	/**
	 * Constructor de la clase, recibe parametros para cada atributo de clase
	 * @param _precio precio del objeto en euros
	 * @param _peso peso del objeto en kilogramos
	 * @param _color color del objeto 
	 * @param _consumo calificacion de consumo energetivo (a-f)
	 */
	Electrodomestico(int _precio, int _peso, String _color, char _consumo){
		this.precioBase = _precio;
		this.color = comprobarColor(_color);
		this.consumo = comprobarConsumoEnergetico(_consumo);
		this.peso = _peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public int getPeso() {
		return peso;
	}
	/**
	 * Metodo comprobarConsumoEnergetico comprueba que el caracter ingresado para consumo es valido
	 * si caracter no es valido asigna valor por defecto (f)
	 * @param _letra nivel de consumo energetico 
	 */
	private char comprobarConsumoEnergetico(char letra) {

		char letravalida='f';
		if(letra == 'a' || letra=='b' || letra == 'c' || letra == 'd' || letra=='f') {

			letravalida=letra;

		}
		return letravalida;
	}
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
	/**
	 * Metodo comprobarColor comprueba que el color ingresado esta en la lista de colores disponibles
	 * si no esta asigna por defecto "blanco
	 * @param color color del objeto
	 */
	private String comprobarColor(String color) {
		String colorvalido="blanco";
		color.toLowerCase();
		if(color == "blanco" || color=="negro" || color == "rojo" || color== "azul" || color=="gris") {
			colorvalido=color;
		}
		return colorvalido;
	}

	/**
	 * Metodo precioFinal asigna valor adicional al precio base segun nivel de consumo y tamaño del objeto
	 * 
	 */
	public void precioFinal( ) {

		switch (getConsumo()) {
		case 'a':
			setPrecioBase( getPrecioBase()+(100*800));
			break;
		case 'b':
			setPrecioBase( getPrecioBase()+(80*800));
			break;
		case 'c':
			setPrecioBase( getPrecioBase()+(60*800));
			break;
		case 'd':
			setPrecioBase( getPrecioBase()+(50*800));
			break;
		case 'e':
			setPrecioBase( getPrecioBase()+(30*800));
			break;
		case 'f':
			setPrecioBase( getPrecioBase()+(10*800));
			break;
		}

		if(this.peso>80) {
			setPrecioBase( getPrecioBase()+(100*800));
		}
		if(this.peso>49 && this.peso <80) {
			setPrecioBase( getPrecioBase()+(80*800));
		}
		if (this.peso>19 && this.peso <50) {
			setPrecioBase( getPrecioBase()+(50*800));
		}
		if (this.peso>=0 && this.peso <20) {
			setPrecioBase( getPrecioBase()+(10*800));
		}


	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
