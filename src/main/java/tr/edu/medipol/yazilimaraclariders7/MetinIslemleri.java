package tr.edu.medipol.yazilimaraclariders7;

public class MetinIslemleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ornek1= "Merhaba Arkadaslar";
		String sonuc1= MetinIslemleri.buyukHarfeCevir(ornek1);
		System.out.println(ornek1 + "->"+sonuc1);
	}
	
	static String buyukHarfeCevir(String orjinalMetin) {
		if(orjinalMetin==null) {
			return orjinalMetin;
		}
		return orjinalMetin.toUpperCase();
	}
	
	
}
