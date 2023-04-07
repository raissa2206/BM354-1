import java.util.Scanner;

public class mostra_número {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valido = false;
        while (!valido){
        System.out.println("Digite um numero: ");
       String input = sc.nextLine();
        try {
            num = Integer.parseInt(input);
            valido = true;
        }
        catch
        (NumberFormatException e){
            System.out.println("Número inválido");
        }
    }
    System.out.println("Número digitado foi: "+num);        
       
        }   
    
}
