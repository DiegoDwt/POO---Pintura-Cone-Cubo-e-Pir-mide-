package atividade_POO1;

public class Piramide {
	
	private double ab;
	private double h;
	private int tipo;
	
	public Piramide (double ab, double h, int tipo) {
		this.ab = ab;
		this.h = h;
		this.tipo = tipo;
	}

	public double getAb() {
		return ab;
	}

	public void setAb(double ab) {
		this.ab = ab;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double al() {
		double saida = Math.sqrt((h * h) + (ab * ab));
		return saida;
	}
	
	public double areaTriangulo(double al) {
		double saida = ((ab * 2) * al)/ 2;
		return saida;
	}
		
	public double areaBase(double al) {
		double saida = Math.pow((ab * 2), 2);
		return saida;
	}
	
	public double areaTotal(double areaTriangulo, double areaBase) {
		double saida = (4 * areaTriangulo) + areaBase;
		return saida;
	}
	
	public double litros(double areaTotal) {
		double saida = areaTotal / 4.76;
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
			preco = 127.9;
		} else if (tipo == 2) {
			preco = 258.98;
		} else if (tipo == 3) {
			preco = 344.34;
		}
		saida = latas * preco;
		return saida;
	}
	
	public double volume(double areaBase) {
		
		double saida = (areaBase * h) / 3;
		return saida;
	}
	
	public String toString(double al, double areaTriangulo, double areaBase, double areaTotal, double litros, int latas, double precoTotal, double volume) {
		StringBuilder builder = new StringBuilder();
		builder.append("ab: ");
		builder.append(ab);
		builder.append(System.getProperty("line.separator"));
		builder.append("h: ");
		builder.append(h);
		builder.append(System.getProperty("line.separator"));
		builder.append("al: ");
		builder.append(al);
		builder.append(System.getProperty("line.separator"));
		builder.append("Área Triângulo: ");
		builder.append(areaTriangulo);
		builder.append(System.getProperty("line.separator"));
		builder.append("Área Base: ");
		builder.append(areaBase);
		builder.append(System.getProperty("line.separator"));
		builder.append("Área Total: ");
		builder.append(areaTotal);
		builder.append(System.getProperty("line.separator"));
		builder.append("Tipo de Tinta: ");
		builder.append(tipo);
		builder.append(System.getProperty("line.separator"));
		builder.append("Litros: ");
		builder.append(litros);
		builder.append(System.getProperty("line.separator"));
		builder.append("Latas: ");
		builder.append(latas);
		builder.append(System.getProperty("line.separator"));
		builder.append("Preço: ");
		builder.append(precoTotal);
		builder.append(System.getProperty("line.separator"));
		builder.append("Volume: ");
		builder.append(volume);
		
		
		return builder.toString();
	}
}
