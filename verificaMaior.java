import java.util.Scanner; //leitura de dados

public class verificaMaior{
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        int maior = 0;
        System.out.print("Entre com o primeiro numero:\n");
        n = ler.nextInt();
            if(n > maior){
                maior = n;
            }
        System.out.print("Entre com o segundo numero:\n");
        n = ler.nextInt();
            if(n > maior){
                maior = n;
            }
        System.out.print("Entre com o terceiro numero:\n");
        n = ler.nextInt();
            if(n > maior){
                maior = n;
            }
        System.out.print("Entre com o quarto numero:\n");
        n = ler.nextInt();
            if(n > maior){
                maior = n;
            }
        System.out.print("Entre com o quinto numero:\n");
        n = ler.nextInt();
            if(n > maior){
                maior = n;
            }
   
        System.out.print(maior);
 }
}