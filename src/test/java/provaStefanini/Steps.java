package provaStefanini;

import java.io.IOException;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Steps {

	Browser browser = new Browser();
	Metodos metodo = new Metodos();
	Documentos documentos = new Documentos();
	Acesso acesso = new Acesso();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		browser.abrirNavegador(site);

	}

	@Quando("clico no campo nome")
	public void clico_no_campo_nome() {
		documentos.dados("Cléciolucio Pontes");
	}

	@Quando("preencho o campo email")
	public void preencho_o_campo_email() {

	}

	@Quando("preencher o campo senha")
	public void preencher_o_campo_senha() {

	}

	@Entao("clico em enviar")
	public void clico_em_enviar() throws IOException {
		acesso.menu("enviar");
		metodo.screenShot("cadastroConcluido");


	}
}