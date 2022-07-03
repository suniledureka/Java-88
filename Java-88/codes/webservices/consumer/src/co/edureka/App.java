package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class App {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums obj = locator.getNums();
		
		System.out.println("Sum = " + obj.add(10,23));
		System.out.println("Diff = " + obj.sub(12f, 23.5f));
	}

}
