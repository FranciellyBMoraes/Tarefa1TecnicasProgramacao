package Tarefa1TecnicasProgramacao;

import java.util.Scanner;

public class Principal {
    public static void main(final String[] args) {
		
		
		Catalogo.Veiculos.add(new Carro ("Fiat","AED5420",25.000));
		Catalogo.Veiculos.add(new Carro ("CHEVROLET","EDA4520",35.000));
		Catalogo.Veiculos.add(new Carro ("Ford","MEV9502",29.500));
				
		  Scanner sc = new Scanner(System.in) {
			int opcao=0;
			while(opcao>=0) {
				System.out.println("Opcoes de operacao: ");
				System.out.println("  1 - Adicionar");
				System.out.println("  2 - Remover");
				System.out.println("  3 - Retorna Veiculo");
				System.out.println("  4 - Quantidade Veiculos");
				System.out.println("  0 - SAIR");
				System.out.print("Informe a opcão: ");
				
				opcao=sc.nextInt();
				if(opcao==0) break;
				
				
				
			
}
}
            

}
}