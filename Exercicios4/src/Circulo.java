
public class Circulo {
	private double raio;
	private double area;
	private double perimetro;
	
	private void calculaArea() {
		this.area = Math.PI * (this.raio * this.raio);
	}
	
	private void calculaPerimetro() {
		this.perimetro = 2 * Math.PI * this.raio;
	}

	@Override
	public String toString() {
		return "Circulo [area=" + area + ", perimetro=" + perimetro + "]";
	}

	public Circulo(double raio) {
		this.raio = raio;
		
		this.calculaArea();
		this.calculaPerimetro();
	}
	
	
}
