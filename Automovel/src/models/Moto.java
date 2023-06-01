package models;

public class Moto extends Automovel {
	private boolean garupa;

	public boolean isGarupa() {
		return garupa;
	}

	public void setGarupa(boolean garupa) {
		this.garupa = garupa;
	}
	
	public void trocaGarupa() {
		this.garupa = !this.garupa;
		
		/*
		if(this.garupa == false) {
			this.garupa = true;
		}else {
			this.garupa = false;
		}
		*/
	}

	@Override
	public String toString() {
		return "Moto [garupa=" + garupa + ", peso=" + peso + ", velocidade=" + velocidade + ", marca=" + marca + "]";
	}
	
	
}
