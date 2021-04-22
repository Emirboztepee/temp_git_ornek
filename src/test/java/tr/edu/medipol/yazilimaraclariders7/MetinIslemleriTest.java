package tr.edu.medipol.yazilimaraclariders7;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public final void testBuyukHarfeCevir() {
		String ornek= "Merhaba Arkadaslar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("MERHABA ARKADASLAR",sonuc);
	}

}
