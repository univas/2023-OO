
public class Quadrilatero {
	private double base;
	private double altura;
	private double perimetro;
	private double area;
	
	public Quadrilatero(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		this.calculaArea();
		this.calculaPerimetro();
	}
	
	private void calculaArea() {
		this.area = this.base * this.altura;
	}
	
	private void calculaPerimetro() {
		this.perimetro = this.base * 2 + this.altura * 2;
	}

	@Override
	public String toString() {
		return "Quadrilatero [perimetro=" + perimetro + ", area=" + area + "]";
	}
	
	
}
