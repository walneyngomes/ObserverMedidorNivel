package Observes;

public class CaixaDeAguaDomestica {
	private double valorDeNivel=20.000;
	
public void medidorNível(){
	
	for(double i=1;i<valorDeNivel;i++){
		System.out.println("Tempo"+i);
		valorDeNivel-=i;
		
	}
	if(valorDeNivel==0){
		System.out.print("CAIXA VAZIA");
	}
	
		
	}
}
