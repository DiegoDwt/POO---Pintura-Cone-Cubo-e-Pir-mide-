package atividade_POO1;


public class CuboMain {
	

	public static void main(String[] args) {
		
		
		Cubo novoCubo = new Cubo(4, 2, 1);
		
		double areaBase = novoCubo.areaBase();
		double areaTotal = novoCubo.areaTotal();
		double volume = novoCubo.volume();
		double diagonal = novoCubo.diagonal();
		double litros = novoCubo.litros(areaTotal);
		int latas = novoCubo.latas(litros);
		double precoTotal = novoCubo.precoTotal(latas);
		
		
		System.out.println(novoCubo.toString(areaBase, areaTotal, volume, diagonal, litros, latas, precoTotal));

	}
}
