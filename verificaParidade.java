import java.util.Scanner; //leitura de dados

public class verificaParidade{
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.print("Digite o numero:\n");
        n = ler.nextInt();
        
        if( n % 2 == 0){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
     
 }
}