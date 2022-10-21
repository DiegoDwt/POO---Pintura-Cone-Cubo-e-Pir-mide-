package atividade_POO1;

public class ConeMain {

	public static void main(String[] args) {
		
		Cone novoCone = new Cone(6, 8, 1);
		
		double geratriz = novoCone.geratriz();
		double areaFundo = novoCone.areaFundo();
		double areaLateral = novoCone.areaLateral(geratriz);
		double areaTotal = novoCone.areaTotal(geratriz);
		double litros = novoCone.litros(areaTotal);
		int latas = novoCone.latas(litros);
		double precoTotal = novoCone.precoTotal(latas);
		
		
		System.out.println(novoCone.toString(geratriz, areaFundo, areaLateral, areaTotal, litros, latas, precoTotal));

	}

}
