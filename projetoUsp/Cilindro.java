import java.util.Scanner;
public class Cilindro {
	Scanner keyboard = new Scanner(System.in);
	int id;
	float dcm=0;
	float ccm=0;
	float ccp=0;
	float ccopi=0;
	float dcopi=0;
	float ccops=0;
	float dcops=0;
	float dbm=0;
	float cbm=0;
	float dmp=0;
	float cbpi=0;
	float cbps=0;
	float exc=0;
	float dum=0;
	float cum=0;
	float cup=0;
	float cuopi=0;
	float duopi=0;
	float cuops=0;
	float duops=0;
	float mrm=0;
	float mrpi=0;
	float mrps=0;
	float mroi=0;
	float mros=0;
	float ds=0;
	float sdl=0;
	float mum=0;
	float mupi=0;
	float muoi=0;
	float mups=0;
	float muos=0;
	float mrcpi=0;
	float mrcoi=0;
	float mrcps=0;
	float mrcos=0;
	int flagCroqui;

public Cilindro(int numeroCilindro){
	id = numeroCilindro;
}

public static float preencher(float valor){
	Scanner keyboard = new Scanner(System.in);
	if(valor==0){
		System.out.println("Digite o valor");
		valor=keyboard.nextFloat();
	}else{
		System.out.println("A dimensão já foi definida com "+valor+" mm");
		System.out.println("Deseja alterar? [SIM - 1/ NÃO - 0]");
		int opcao3 = keyboard.nextInt();
		if (opcao3==1) {
			System.out.println("Digite o novo valor");
			valor = keyboard.nextInt();							}
	}
return valor;
}

public void menuEtapa(){
	Scanner keyboard = new Scanner(System.in);
	int opcao=99;
	while (opcao!=0) {
		LimparTela.limparTela();
		System.out.println("-------ETAPA---------");
		System.out.println("Cilindro numero "+id);
		System.out.println("[1]------Definir dimensoes do Croqui");
		System.out.println("[2]-----Realizar Mapeamento do Blank");
		System.out.println("[3]------------Realizar Autocontrole");
		System.out.println("[0]---Retornar ao MENU PRINCIPAL");		

		opcao=keyboard.nextInt();

		switch (opcao){
			case 1:
			menuCroqui();
			break;
			case 2:
			menuMapeamento();
			break;
			case 3:
			menuAutocontrole();
			break;
			case 0:
			break;
		}
	}
}

public void menuCroqui(){
		Scanner keyboard = new Scanner(System.in);
		int opcao=99;
		while (opcao!=0) {
			LimparTela.limparTela();
			System.out.println("-----DIMENSOES DO CROQUI---------");
			System.out.println("Cilindro numero "+this.id);
			System.out.println("Escolha as dimensoes a preencher");
			System.out.println("[1]-------------Diametro da mesa "+dcm);
			System.out.println("[2]----------Comprimento da mesa "+ccm);
			System.out.println("[3]------Diametro do ombro do PI "+dcopi);
			System.out.println("[4]---Comprimento do ombro do PI "+ccopi);
			System.out.println("[5]------Diametro do ombro do PS "+dcops);
			System.out.println("[6]---Comprimento do ombro do PS "+ccops);
			System.out.println("[0]---Retornar ao MENU PRINCIPAL");
			
			opcao=keyboard.nextInt();

			switch (opcao){
				case 1:
				dcm = preencher(dcm);
				break;
				case 2:
				ccm = preencher(ccm);
				break;
				case 3:
				dcopi = preencher(dcopi);
				break;
				case 4:
				ccopi = preencher(ccopi);
				break;
				case 5:
				dcops = preencher(dcops);
				break;
				case 6:
				ccops = preencher(ccops);
				break;
				case 0:
				break;
			}
		}
	if((dcm!=0)&&(ccm!=0)&&(dcopi!=0)&&(ccopi!=0)&&(dcops!=0)&&(ccops!=0)){
		flagCroqui=1;

	}else{flagCroqui=0;}
	}
public void menuMapeamento(){
		Scanner keyboard = new Scanner(System.in);
		int opcao=99;
		while (opcao!=0) {
			LimparTela.limparTela();
			System.out.println("-----DIMENSOES DO BLANK---------");
			System.out.println("Cilindro numero "+this.id);
			System.out.println("Escolha as dimensoes a preencher");
			System.out.println("[1]-------------Diametro da mesa "+dbm);
			System.out.println("[2]----------Comprimento da mesa "+cbm);
			System.out.println("[3]-Diametro da camada de núcleo "+dmp);
			System.out.println("[4]------------Comprimento do PI "+cbpi);
			System.out.println("[5]------------Comprimento do PS "+cbps);
			System.out.println("[6]-------------Batimento Maximo "+exc);
			System.out.println("[0]---Retornar ao MENU PRINCIPAL");
			
			opcao=keyboard.nextInt();

			switch (opcao){
				case 1:
				dbm = preencher(dbm);
				break;
				case 2:
				cbm = preencher(cbm);
				break;
				case 3:
				dmp = preencher(dmp);
				break;
				case 4:
				cbpi = preencher(cbpi);
				break;
				case 5:
				cbps = preencher(cbps);
				break;
				case 0:
				break;
			}
//FORMULAS PARA CALCULO DE MATERIAL A SER REMOVIDO
mrm = ((dbm-dcm)/2)*cbm;
mrpi = ((dcm-dcopi)/2)*(((cbm-ccm)/2)+ds);
mrps = ((dcm-dcopi)/2)*(((cbm-ccm)/2)-ds);
mroi = ((dcopi-dmp)/2)*((cbm+((dbm-dmp)/2))-(ccm+ccopi+ccops))+ds;
mros = ((dcopi-dmp)/2)*((cbm+((dbm-dmp)/2))-(ccm+ccopi+ccops))-ds;
ds = (cbm-(ccm+ccopi+ccops))*sdl;

//FORMULAS PARA CALCULO DE PORCENTAGEM USINADA
mum = ((dbm-dum)/2)*cum;
mupi = ((dcm-duopi)/2)*((((cbm-ccm)/2)+ds)-mrcpi);
muoi = ((dcopi-dmp)/2)*((((cbm+((dbm-dmp)))-(ccm+ccopi+ccops))/2)+ds)-mrcoi;
mups = ((dcm-duops)/2)*((((cbm-ccm)/2)-ds)-mrcps);
muos = ((dcops-dmp)/2)*((((cbm+((dbm-dmp)))-(ccm+ccopi+ccops))/2)-ds)-mrcos;



		}
	}

public void menuAutocontrole(){
		Scanner keyboard = new Scanner(System.in);
		int opcao=99;
		while (opcao!=0) {
			LimparTela.limparTela();
			System.out.println("-----AUTOCONTROLE-------");
			System.out.println("Cilindro numero "+this.id);
			System.out.println("Escolha as dimensoes a preencher");
			System.out.println("[1]---------------Diametro da mesa "+dum);
			System.out.println("[2]-----Diametro do ombro Inferior "+duopi);
			System.out.println("[3]--Comprimento do ombro Inferior "+cuopi);
			System.out.println("[4]------------Comprimento da mesa "+cum);
			System.out.println("[5]-----Diametro do ombro Superior "+duops);
			System.out.println("[6]--Comprimento do ombro Superior "+cuops);
			System.out.println("[0]-----Retornar ao MENU PRINCIPAL");
			
			opcao=keyboard.nextInt();

			switch (opcao){
				case 1:
				dum = preencher(dum);
				break;
				case 2:
				duopi = preencher(duopi);
				break;
				case 3:
				cuopi = preencher(cuopi);
				break;
				case 4:
				cum = preencher(cum);
				break;
				case 5:
				duops = preencher(duops);
				break;
				case 6:
				cuops = preencher(cuops);
				break;
				case 0:
				break;
			}
		}
	}
}