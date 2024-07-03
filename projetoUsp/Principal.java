import java.util.Scanner;
public class Principal {
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	int opcaoMenu=999;
	while(opcaoMenu!=0){
	LimparTela.limparTela();
	System.out.println("--------------MENU---------------");
	System.out.println("--------ESCOLHA AS OPCOES--------");
	System.out.println("[1]----------------REALIZAR LOGIN");
	System.out.println("[2]---------INICIAR NOVO CILINDRO");
	System.out.println("[3]------------CONTINUAR CILINDRO");
	System.out.println("[0]--------------------------SAIR");
	opcaoMenu = keyboard.nextInt();
	switch(opcaoMenu){
	case 1:
	int npTeste1;
	int npTeste2;
	do{
	LimparTela.limparTela();
	System.out.println("--------------LOGIN--------------");
	System.out.println("Informe o seu numero pessoal");
	npTeste1 = keyboard.nextInt();
	System.out.println("Repita...");
	npTeste2 = keyboard.nextInt();
	}while(npTeste1 != npTeste2);
	int numeroPessoal = npTeste1;
	break;
	case 2:
	int cilTeste1;
	int cilTeste2;
	do{
	LimparTela.limparTela();
	System.out.println("------INICIAR NOVO CILINDRO------");
	System.out.println("Informe o numero do cilindro");
	cilTeste1 = keyboard.nextInt();
	System.out.println("Repita...");
	cilTeste2 = keyboard.nextInt();
	}while(cilTeste1!=cilTeste2);
	int numeroCilindro = cilTeste1;
	Cilindro cilindro = new Cilindro(numeroCilindro);
	cilindro.menuEtapa();
	break;
	case 3:
	int conTeste1;
	int conTeste2;
	do{
	LimparTela.limparTela();
	System.out.println("------CONTINUAR CILINDRO------");
	System.out.println("Informe o numero do cilindro");
	conTeste1 = keyboard.nextInt();
	System.out.println("Repita...");
	conTeste2 = keyboard.nextInt();
	}while(conTeste1!=conTeste2);
	int numeroContinuacao = conTeste1;
	break;
	case 0:
	LimparTela.limparTela();
	System.out.println("!PROGRAMA ENCERRADO!");
	break;
	}


	}
	}
}