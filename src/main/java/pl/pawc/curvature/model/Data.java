package pl.pawc.curvature.model;

public class Data {

	private double h1;
	private double d;
	private static double R = 6371000;
	
	public Data(double h1, double d){
		this.h1=h1;
		this.d=d;
	}
	
	public String calculateCurvatureDrop(){
		double d1 = Math.sqrt(Math.pow(h1, 2) + 2*R*h1);
		double h2 = Math.sqrt(Math.pow(d-d1, 2) + Math.pow(R, 2))- R;
		
		d1 = d1/1000;
		d1 = Math.round(d1*1000)/1000;
		
		h2 = Math.round(h2*1000)/1000;
		
		String result = "Distance to horizon [km] = "+d1
				+", Curvature drop [m] = "+h2	;
		
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