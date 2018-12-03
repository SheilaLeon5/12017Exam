package principal;
import modelo.Vehiculo;

public class Principal {
	
	private Vehiculo [] arrayVehiculo;
	public void elementosArrayVehiculo() {
		for (int i = 0; i < arrayVehiculo.length; i++) {
			System.out.println(arrayVehiculo[i].getKilometros() + " , " + arrayVehiculo[i].getMatricula() 
			+  " , " + arrayVehiculo[i].getPago() + " , " + arrayVehiculo[i].getDeudas() + " , " + arrayVehiculo[i].getFechaAlta()		
			);
		}
	}
	
	/*public Vehiculo[] compactarArray (Vehiculo[]datos) {
		Vehiculo resultado[]= new Vehiculo[0];

		return datos;
	}*/
	public static void main(String[] args) {
		
		Vehiculo coche = new Vehiculo(80000,"4145TRE",'P',false,null);
		
		Principal ejercicios = new Principal();
		Vehiculo [] resultado= {coche};
		ejercicios.arrayVehiculo = resultado;
		ejercicios.elementosArrayVehiculo();
		
	}
}
