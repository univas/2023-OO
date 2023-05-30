
public class Triangulo {
	private double lado1;
	private double lado2;
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	private String classificacao;
	
	public Triangulo(double lado1, double lado2, double base, double altura) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.base = base;
		this.altura = altura;
		
		this.calculaArea();
		this.calculaPerimetro();
		this.verificaClassificacao();
	}
	
	private void calculaArea() {
		this.area = (base*altura)/2;
	}
	
	private void calculaPerimetro() {
		this.perimetro = lado1+lado2+base;
	}
	
	private void verificaClassificacao() {
		if(lado1 == lado2 && lado2 == base) {
			this.classificacao = "Equilatero";
		}else if(lado1 == lado2 && lado2 != base) {
			this.classificacao = "Isosceles";
		}else {
			this.classificacao = "Escaleno";
		}
	}

	@Override
	public String toString() {
		return "Triangulo [area=" + area + ", perimetro=" + perimetro + ", classificacao=" + classificacao + "]";
	}

	
	
	
}
