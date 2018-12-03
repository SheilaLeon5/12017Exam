package modelo;

import java.time.LocalDate;

public class Vehiculo {
	private int kilometros;
	private String matricula;
	private char pago; // P -- Pagado / NP --No pagado
	private boolean deudas; // True -- deudas / False --  no deudas
	private LocalDate fechaAlta;
	
	
	public Vehiculo() {
		this.kilometros = 10000;
		this.matricula = "5874TJK";
		this.pago = 'P';
		this.deudas = true;
		this.fechaAlta = LocalDate.now();
	}
	
	public Vehiculo(int kilometros, String matricula, char pago, boolean deudas, LocalDate fechaAlta) {
		super();
		this.kilometros = kilometros;
		this.matricula = matricula;
		this.pago = pago;
		this.deudas = deudas;
		this.fechaAlta = fechaAlta;
	}

	
	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public char getPago() {
		return pago;
	}

	public void setPago(char pago) {
		this.pago = pago;
	}
	
	
	public boolean getDeudas() {
		return deudas;
	}

	public void setDeudas(boolean deudas) {
		this.deudas = deudas;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
	
}


