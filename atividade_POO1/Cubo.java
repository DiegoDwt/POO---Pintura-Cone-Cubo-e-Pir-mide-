package atividade_POO1;

public class Cubo {
	
	private double lado;
	private double rendimento;
	private int tipo;
	
	public Cubo (double lado, double rendimento, int tipo) {
		this.lado = lado;
		this.rendimento = rendimento;
		this.tipo = tipo;
	}
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public double areaBase() {
		double saida = lado * lado;
		return saida;
	}
	
	public double areaTotal() {
		double saida = 6 * (lado * lado);
		return saida;
	}
	
	public double volume() {
		double saida = Math.pow(lado, 3);
		return saida;
	}
	
	public double diagonal() {
		double saida = lado * Math.sqrt(3);
		return saida;
	}
	
	public double litros(double areaTotal) {
		double saida = areaTotal / rendimento;
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
			preco = 101.9;
		} else if (tipo == 2) {
			preco = 212.45;
		} else if (tipo == 3) {
			preco = 345.56;
		}
		saida = latas * preco;
		return saida;
	}
	
	public String toString(double areaBase, double areaTotal, double volume, double diagonal, double litros, int latas, double precoTotal) {
		StringBuilder builder = new StringBuilder();
		builder.append("- Cubo");
		builder.append(System.getProperty("line.separator"));
		builder.append("Lado: ");
		builder.append(lado);
		builder.append(System.getProperty("line.separator"));
		builder.append("Rendimento: ");
		builder.append(rendimento);
		builder.append(System.getProperty("line.separator"));
		builder.append("Tipo de Tinta: ");
		builder.append(tipo);
		builder.append(System.getProperty("line.separator"));
		builder.append("_______________________");
		builder.append(System.getProperty("line.separator"));
		builder.append(System.getProperty("line.separator"));
		builder.append("Área da Base: ");
		builder.append(areaBase);
		builder.append(System.getProperty("line.separator"));
		builder.append("Área Total: ");
		builder.append(areaTotal);
		builder.append(System.getProperty("line.separator"));
		builder.append("Volume: ");
		builder.append(volume);
		builder.append(System.getProperty("line.separator"));
		builder.append("Diagonal do Cubo: ");
		builder.append(diagonal);
		builder.append(System.getProperty("line.separator"));
		builder.append("Litros de Tinta: ");
		builder.append(litros);
		builder.append(System.getProperty("line.separator"));
		builder.append("Latas de Tinta: ");
		builder.append(latas);
		builder.append(System.getProperty("line.separator"));
		builder.append("Preço Total: ");
		builder.append(precoTotal);
		
		return builder.toString();
	}

	

}
