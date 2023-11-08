import java.util.Scanner; //leitura de dados

public class ValidaData {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;
        boolean bissexto = false;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o dia:\n");    
        dia = ler.nextInt();
        System.out.print("Digite o mes:\n");
        mes = ler.nextInt();
        System.out.print("Digite o ano:\n");
        ano = ler.nextInt();
        if(mes >= 1 && mes <= 12) {
        // Data Válida
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
                if(dia >= 1 && dia <= 31) {
                    System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes);
                } else {
                    // Dia inválido
                    System.out.println("Data Invalida");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if(dia >= 1 && dia <= 30) {
                System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes);
                } else {
                    // Dia inválido
                    System.out.println("Data Invalida");
                }
            } else if (mes == 2 && dia <= 29) {
                if((ano % 4 == 0) && (ano % 100 != 0)){
                    bissexto = true;
                    System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else if(bissexto == false && dia > 28){
                    System.out.println("Data Invalida");
                } else{
                    
                    System.out.println("Data Valida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                }
               
            } else{
                System.out.println("Data Invalida");
            }
        } else {
            // Mes invalido
            System.out.println("Data Invalida");
        }
    }
}