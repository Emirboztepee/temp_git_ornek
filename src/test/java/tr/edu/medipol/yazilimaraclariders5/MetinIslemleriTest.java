package tr.edu.medipol.yazilimaraclariders5;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.medipol.yazilimaraclariders5.MetinIslemleri;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public final void testBuyukHarfeCevir() {
		String ornek= "Merhaba Arkadaslar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("MERHABA ARKADASLAR",sonuc);
	}

}
