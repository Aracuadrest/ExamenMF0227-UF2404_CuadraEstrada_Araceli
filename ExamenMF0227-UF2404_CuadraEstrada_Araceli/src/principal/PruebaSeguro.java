package principal;

import modelo.SeguroCoche;

public class PruebaSeguro {

	public PruebaSeguro() {
		
	}

	public static void main(String[] args) {
		
		SeguroCoche s1 = new SeguroCoche();
		
		System.out.println("El seguro creado es: "+s1);
		
		SeguroCoche s2 = new SeguroCoche("1402A", "Juan", "Perez", "11111A", 1, "Anual", 160, 1, "5555ABC", 6);
		
		System.out.println("El seguro creado es: "+s2);
		
		System.out.println("La póliza del seguro del vehículo con matricula "+s2.getMatricula()+" es: "+s2.calcularPrima());
		
		System.out.println("Modificando el número de años de antigüedad asegurado.......");
		s2.setAnyo(6);
		System.out.println("Modificando los años de Carnet del asegurado........");
		s2.setAnyoCarnet(2);
		
		System.out.println("El total de la póliza con las modificaciones es de: "+s2.calcularPrima());
		

	}

}
