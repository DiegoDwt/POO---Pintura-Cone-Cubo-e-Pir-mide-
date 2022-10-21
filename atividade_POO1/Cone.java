package atividade_POO1;

public class Cone {
	
	private double raio;
	private double altura;
	private int tipo;
	
	public Cone (double raio, double altura, int tipo) {
		this.altura = altura;
		this.raio = raio;
		this.tipo = tipo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
	
	public double geratriz() {
		double saida = Math.sqrt((altura * altura) + (raio * raio));		
		return saida;
	}
	
	
	public double areaFundo() { 
		double saida = 3.14 * (raio * raio);
		return saida;
	}
	
	public double areaLateral(double geratriz) {
		double saida = 3.14 * raio * geratriz;
		return saida;
	}
	
	
	public double areaTotal(double geratriz) {
		double saida = 3.14 * raio * (raio + geratriz);
		return saida;
}
	
	
	public double litros(double areaTotal) {
		double saida = areaTotal * 3.45;
		return saida;	
	}
	
	public int latas(double litros) {
	    int saida = (int)Math.ceil(litros / 18);
	    return saida;
	}
	
	public double precoTotal(int latas) {
		double preco = 0;
		double saida;
		if (tipo == 1) {
			preco = 238.9;
		} else if (tipo == 2) {
			preco = 467.98;
		} else if (tipo == 3) {
			preco = 758.34;
		}
		saida = latas * preco;
		return saida;
	}
	
	
	public String toString(double geratriz, double areaFundo, double areaLateral, double areaTotal, double litros, int latas, double precoTotal) {
		StringBuilder builder = new StringBuilder();
		builder.append("- Cone");
		builder.append(System.getProperty("line.separator"));
		builder.append("Raio: ");
		builder.append(raio);
		builder.append(System.getProperty("line.separator"));
		builder.append("Altura: ");
		builder.append(altura);
		builder.append(System.getProperty("line.separator"));
		builder.append("Tipo: ");
		builder.append(tipo);
		builder.append(System.getProperty("line.separator"));
		builder.append("_______________________");
		builder.append(System.getProperty("line.separator"));
		builder.append(System.getProperty("line.separator"));
		builder.append("Geratriz: ");
		builder.append(geratriz);
		builder.append(System.getProperty("line.separator"));
		builder.append("_______________________");
		builder.append(System.getProperty("line.separator"));
		builder.append(System.getProperty("line.separator"));
		builder.append("Área do Fundo: ");
		builder.append(areaFundo);
		builder.append(System.getProperty("line.separator"));
		builder.append("Área Lateral Cone: ");
		builder.append(areaLateral);
		builder.append(System.getProperty("line.separator"));
		builder.append("Área Total: ");
		builder.append(areaTotal);
		builder.append(System.getProperty("line.separator"));
		builder.append("_______________________");
		builder.append(System.getProperty("line.separator"));
		builder.append(System.getProperty("line.separator"));
		builder.append("Litros: ");
		builder.append(litros);
		builder.append(System.getProperty("line.separator"));
		builder.append("Latas: ");
		builder.append(latas);
		builder.append(System.getProperty("line.separator"));
		builder.append("_______________________");
		builder.append(System.getProperty("line.separator"));
		builder.append(System.getProperty("line.separator"));
		builder.append("Preço Total: ");
		builder.append(precoTotal);
		
		return builder.toString();
	}

	
	
	
	
	
	

	
	
	

}
