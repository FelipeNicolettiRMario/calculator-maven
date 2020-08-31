package br.gov.sp.fatec;

public class Calculator {
	private float a,b;
	
	public Calculator(float a,float b) {
		this.a = a;
		this.b = b;
	}
	
	public Calculator() {
		this(1.0F,1.0F);
	}
	
	public void setA(float a) {
		this.a = a;
	}
	
	public void setB(float b) {
		this.b = b;
	}
	
	public float getA() {
		return this.a;
	}
	
	public float getB() {
		return this.b;
	}
	
	public float sum() {
		return this.a + this.b;
	}
	
	public float subtraction() {
		return this.a - this.b;
	}
	
	public float multiplication() {
		return this.a * this.b;
	}
	
	public float division() {
		return this.a / this.b;
	}
	
	
}
