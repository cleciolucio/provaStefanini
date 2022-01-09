package provaStefanini;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("erro ao clicar" + e.getMessage());
			System.err.println("causa do erro" + e.getCause());

		}
	}

	public void escrever(By elemento, String text) {
		try {
			driver.findElement(elemento).sendKeys(text);
		} catch (Exception e) {
			System.err.println("erro ao escrever" + e.getMessage());
			System.err.println("causa do erro" + e.getCause());

		}

	}

	public void screenShot(String prova) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/cadastroConcluido/" + prova + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

}