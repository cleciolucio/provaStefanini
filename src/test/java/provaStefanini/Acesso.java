package provaStefanini;

import org.openqa.selenium.By;

public class Acesso {

	Metodos metodo = new Metodos();

	By botao = By.xpath("//*[@id=\"register\"]");

	public void menu(String menu) {
		if (menu.equalsIgnoreCase("enviar")) {
			metodo.clicar(botao);
		} else {
			System.out.println("cadastro enviado");
		}
	}

}