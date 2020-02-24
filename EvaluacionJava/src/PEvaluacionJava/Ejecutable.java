package PEvaluacionJava;

/**
 * 
 * Esta es la clase que realiza las acciones
 * se declaran las instancias de las clases Television, Lavadora y Electrodomesticos 
 * y se prueban sus metodos
 * @author:  Nadia Rojas
 * @version: 24-02-2020
 * @see <a href="https://github.com/nnrojasv/EvaluacionJava">Enlace a Github</a>
 *
 */
public class Ejecutable {
	/**
	 * Metodo main de la clase
	 */
	public static void main(String[] args) {
		
		Electrodomestico listaelectrodomesticos[] = new Electrodomestico [10];
		int precioelectrodomesticos=0;
		int preciolavadoras=0;
		int preciotelevisores=0;
		
		//Inicializacion de lista de 10 electrodomesticos
		listaelectrodomesticos[0] = new Lavadora();
		listaelectrodomesticos[1] = new Lavadora (120, 90);
		listaelectrodomesticos[2] = new Lavadora(110, 60, "gris", 'a', 35);
		listaelectrodomesticos[3] = new Lavadora(); 
		listaelectrodomesticos[4] = new Television();
		listaelectrodomesticos[5] = new Television(140, 90);
		listaelectrodomesticos[6] = new Television (100, 40, "negro", 'b', 45, false);
		listaelectrodomesticos[7] = new Television();
		listaelectrodomesticos[8] = new Electrodomestico();
		listaelectrodomesticos[9] = new Electrodomestico (200, 55);
		
		//Prueba metodo precioFinal en cada instancia de listaelectrodomesticos
		for (Electrodomestico objeto: listaelectrodomesticos) {
			System.out.println(objeto.toString());
			objeto.precioFinal();
			System.out.println(objeto.toString());
			System.out.println("");
		}
		// Suma precio de los objetos segun su clase
		for(Electrodomestico objeto: listaelectrodomesticos) {
			if (objeto instanceof Electrodomestico ){
				precioelectrodomesticos = precioelectrodomesticos + objeto.getPrecioBase();
			}
			if (objeto instanceof Lavadora ){
				preciolavadoras = preciolavadoras + objeto.getPrecioBase();
			}
			if (objeto instanceof Television ){
				preciotelevisores = preciotelevisores + objeto.getPrecioBase();
			}
		}
		System.out.println( "suma precio electrodomesticos: " + precioelectrodomesticos);
		System.out.println( "suma precio lavadoras: " + preciolavadoras);
		System.out.println( "suma precio televisores: " + preciotelevisores);
		
	}

}
