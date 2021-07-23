package entidade.cliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ClienteTest {
	
	@Test
	public void test() {
		String nomePjExpected = "clientePJ";
		String emailPJExpected = "emailPJ@brq.com";
		String cnpjExpected = "000000011121123456";
		
		Cliente cliente = new PessoaJuridica(nomePjExpected, emailPJExpected, cnpjExpected);

		Cliente pf = new PessoaFisica("clientePF", "emailPF@brq.com", "43455521122");

		PessoaJuridica pj = (PessoaJuridica) cliente;

		assertTrue(cliente instanceof PessoaJuridica);
		assertTrue(pj instanceof PessoaJuridica);
		assertFalse(pf instanceof PessoaJuridica);
		
		assertEquals(nomePjExpected, pj.getNome());
		assertEquals(emailPJExpected, pj.getEmail());
		assertEquals(cnpjExpected, pj.getCnpj());
		assertEquals(cnpjExpected, pj.getDocumento());
	}

}
