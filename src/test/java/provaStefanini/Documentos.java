package provaStefanini;

import org.openqa.selenium.By;

public class Documentos {

	Metodos metodo = new Metodos();

	By nome = By.xpath("//*[@id=\"name\"]");
	By email = By.xpath("//*[@id=\"email\"]");
	By senha = By.xpath("//*[@id=\"password\"]");

	public void dados(String dados) {

		metodo.escrever(nome, "Cleciolucio Pontes");
		metodo.escrever(email, "clecioguga7@gmail.com");
		metodo.escrever(senha, "12345678");
	
	}
}