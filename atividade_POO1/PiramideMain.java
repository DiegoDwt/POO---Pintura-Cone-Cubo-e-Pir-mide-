package atividade_POO1;

public class PiramideMain {

	public static void main(String[] args) {
		
		Piramide novaPiramide = new Piramide(3.56, 23.18, 1);
		
		double al = novaPiramide.al();
		double areaTriangulo = novaPiramide.areaTriangulo(al);
		double areaBase = novaPiramide.areaBase(al);
		double areaTotal = novaPiramide.areaTotal(areaTriangulo,  areaBase);
		double litros = novaPiramide.litros(areaTotal);
		int latas = novaPiramide.latas(litros);
		double precoTotal = novaPiramide.precoTotal(latas);
		double volume = novaPiramide.volume(areaBase);
		
		
		System.out.println(novaPiramide.toString(al, areaTriangulo, areaBase, areaTotal, litros, latas, precoTotal, volume));

	}

}
