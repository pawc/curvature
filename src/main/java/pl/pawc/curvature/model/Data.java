package pl.pawc.curvature.model;

public class Data {

	private double h1;
	private double d;
	private String planet;
	private double R;
	
	public Data(double h1, double d, String planet){
		this.h1=h1;
		this.d=d*1000;
		this.planet=planet;
		if("earth".equals(planet)){
			R = 6371000;
		}
		if("moon".equals(planet)){
			R = 1737064;
		}
		if("jupiter".equals(planet)){
			R = 69634200;
		}
	}
	
	public String[] calculateCurvatureDrop(){
		double d1 = Math.sqrt(Math.pow(h1, 2) + 2*R*h1);
		double h2 = Math.sqrt(Math.pow(d-d1, 2) + Math.pow(R, 2))- R;

		d1 = d1/1000;
		d1 = Math.round(d1*1000.0)/1000.0;
		
		h2 = Math.round(h2*1000.0)/1000.0;
		
		String[] result = new String[5];
		result[0] = String.valueOf(d1);
		result[1] = String.valueOf(h2);
		result[2] = planet;
		result[3] = String.valueOf(h1);
		result[4] = String.valueOf(d/1000);
		
		return result;
	}
	
	public double getH1(){
		return h1;
	}
	public void setH1(double h1){
		this.h1 = h1;
	}

	public double getD(){
		return d;
	}
	public void setD(double d){
		this.d = d;
	}
	
}