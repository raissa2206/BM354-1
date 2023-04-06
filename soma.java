import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class soma {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
       int numero1;
       boolean continuar = true;
       do{

   
        try{
           
            System.out.println("digite um:");
            numero1 = valor.nextInt();
            valor.close();
           System.out.println("O numero é: "+(numero1));
           break;
            }
            catch(Exception e){
                System.out.println("só aceita numeros");
             break;
            

               
               
                

            }
            
        }while (continuar); 

       

    }
}