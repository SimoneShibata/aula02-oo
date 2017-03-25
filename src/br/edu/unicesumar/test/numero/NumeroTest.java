package br.edu.unicesumar.test.numero;

import org.junit.Assert;
import org.junit.Test;

import br.edu.unicesumar.numero.Numero;

public class NumeroTest {

	@Test
	public void porExtensoTest() {
		Numero numero = new Numero();
		Assert.assertEquals("zero", numero.porExtenso(0));
		Assert.assertEquals("um", numero.porExtenso(1));
		Assert.assertEquals("dois", numero.porExtenso(2));
		Assert.assertEquals("vinte e dois", numero.porExtenso(22));
		Assert.assertEquals("trinta e sete", numero.porExtenso(37));
	}
}
