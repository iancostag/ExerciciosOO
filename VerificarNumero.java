import java.util.Scanner; //leitura de dados




public class VerificarNumero{
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        char caracter;
        System.out.println("Digite o caracter a ser verificado:");
        caracter = ler.next().charAt(0);
        boolean numerico = Character.isDigit(caracter);
        System.out.println(numerico);
        
    }
}