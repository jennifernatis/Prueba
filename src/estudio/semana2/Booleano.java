package estudio.semana2;

public class Booleano {
	public static void main(String[] args) {

		System.out.println("primera clase booleano");

		// Programa que autoriza o no la salida de la house escenario : a) solo sale si
		// hizo todos los oficios

		Boolean lave_platos = false;
		Boolean trapie_piso = false;
		Boolean limpiar_arenera = null;

		// Null asigna un valor que no genere errores en operaciones antes de asignar un
		// valor valido

		// operaciones booleanas
		// And -> y los dos son verdaderos
		// Or -> o
		// not -> no
		// xor -> o exclusivo

		// OPERACIONES AND

//		if (lave_platos & trapie_piso) {
//			System.out.println("puede salir ");
//		} else {
//			System.out.println(" No me sale !!!");
//		}

		
		
		// OPERACIONES OR

		// Programa que autoriza o no la salida de la house escenario : a) solo sale si
				// hizo algun oficio
		
		if (lave_platos | limpiar_arenera) {
			System.out.println("puede salir ");
		} else {
			System.out.println(" No me sale !!!");
		}

	}

}
