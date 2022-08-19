package modelo;

import java.util.Calendar;

public class SeguroCoche extends Poliza {

	protected String matricula;
	protected int anyoCarnet;
	
	public static final double PORCENTAJE_ANTIGUEDAD=0.015;
	public static final double RECARGO_NOVEL=75;
	public static final double RECARGO_SINIESTRO=0.03;
	
	
	public SeguroCoche() {
		super();
		this.matricula="";
		this.anyoCarnet=Calendar.getInstance().get(Calendar.YEAR);;
	}

		
	public SeguroCoche(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistorico, String matricula, int anyoCarnet) {
		super(idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistorico);
		this.matricula = matricula;
		this.anyoCarnet = anyoCarnet;
	}
	
	

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getAnyoCarnet() {
		return anyoCarnet;
	}


	public void setAnyoCarnet(int anyoCarnet) {
		this.anyoCarnet = anyoCarnet;
	}


	@Override
	public String toString() {
		return "Seguro de Coche [matricula=" + matricula + ", anyoCarnet=" + anyoCarnet + " " +super.toString()
				+ "]";
	}


	@Override
	public double calcularPrima() {
		
		int antiSeguro = Calendar.getInstance().get(Calendar.YEAR)-anyo; 
		int antiCarnet = Calendar.getInstance().get(Calendar.YEAR)-anyoCarnet;
		
		if (antiSeguro>10) {
			antiSeguro=10;
		}
		double totalpagar=primaBase - (primaBase*PORCENTAJE_ANTIGUEDAD*antiSeguro);
		
		if (antiCarnet<5) {
			totalpagar=totalpagar+RECARGO_NOVEL;
		}
	
		return totalpagar+(totalpagar*RECARGO_SINIESTRO*numSiniestrosHistorico);
	}

}
