package Observes;

import java.util.ArrayList;

public class Cagepa {
	ArrayList<CaixaDeAgua> caixa=new ArrayList<CaixaDeAgua>();
	
	public Cagepa(CaixaDeAgua c){
		caixa.add(c);
	}
	public void observerAgua(){
		for(CaixaDeAgua c: caixa){
			c.medidorNível();
		}
	}

}
