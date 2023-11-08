import java.util.Scanner; //leitura de dados

public class SomaPositivo{
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        int soma= 0;      
     do{
        System.out.print("Digite um numero positivo para ser somado ou negativo para sair:\n");    
        n = ler.nextInt();
        if(n >= 0){
            soma += n;
        }
         
     } while(n >= 0);
     System.out.print("A soma e: " + soma);
     
     
     
 }
}