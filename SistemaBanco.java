package sistema_banco;
import java.util.Scanner;

/**
 *
 * @author Henrique_Decarli
 */
public class Sistema_banco {
    


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int opcao;
       double add,pag;
       String nome[]=new String[1];
       String sobrenome[]=new String[1];
       String email[]=new String [1];
       String cpf[]= new String[1];
       double renda_mes[]=new double[1];
       
        System.out.println("preencha com seus dados");
        System.out.print("Nome: ");
            nome[0]=sc.next();
        System.out.print("Sobrenome: ");
            sobrenome[0]=sc.next();
        System.out.print("E-mail: ");
            email[0]=sc.next();
        System.out.print("CPF: ");
            cpf[0]=sc.next();
        System.out.print("Renda mensal: ");
            renda_mes[0]=sc.nextDouble();
        System.out.println("");
        
        do{
        System.out.println("1-verificar saldo");
        System.out.println("2-depositar");
        System.out.println("3-pagamentos");
        opcao=sc.nextInt();
        
        if(opcao==1){
            System.out.println("saldo atual: " + renda_mes[0]);
            System.out.println("Aperte 0 para voltat ao menu ou 4 para sair");
            opcao=sc.nextInt();
            
        }else if(opcao==2){
            System.out.println("Saldo atual :"+ renda_mes[0]);
            System.out.print("digite o valor a ser depositado :");
            add=sc.nextDouble();
            System.out.println("Saldo atual :"+ (renda_mes[0]+add));
            System.out.println("Aperte 0 para voltat ao menu ou 4 para sair");
            opcao=sc.nextInt();
            renda_mes[0]=renda_mes[0]+add;
        }else if(opcao==3){
            System.out.println("Saldo atual :"+ renda_mes[0]);
            System.out.println("digite o valor a ser debitado de sua conta: ");
            pag=sc.nextDouble();
            System.out.println("saldo atual: "+ (renda_mes[0]-pag));
            System.out.println("Aperte 0 para voltat ao menu ou 4 para sair");
            opcao=sc.nextInt();
            renda_mes[0]=renda_mes[0]-pag;
        }else{
            System.out.println("opcao invalida");
            System.out.println("Aperte 0 para voltat ao menu ou 4 para sair");
            opcao=sc.nextInt();            
        }
        }while(opcao ==0);
          System.out.println("obrigado!");
        
    }
    
}
