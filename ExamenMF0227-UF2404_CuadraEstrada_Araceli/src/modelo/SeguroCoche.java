package modelo;

public class SeguroCoche extends Poliza {

	protected String matricula;
	protected int anyoCarnet;
	
	
	public SeguroCoche() {
		super();
		this.matricula="";
		this.anyoCarnet=0;
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
		double totalpagar=super.primaBase;
		if (super.anyo<=10) {
			totalpagar=totalpagar -(super.primaBase*0.015*super.anyo);
		}
		if (anyoCarnet<5) {
			totalpagar=totalpagar+75;
		}
	
		return totalpagar+(totalpagar*0.03*super.numSiniestrosHistorico);
	}

}
