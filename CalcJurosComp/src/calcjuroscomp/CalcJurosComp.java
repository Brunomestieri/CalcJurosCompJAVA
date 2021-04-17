package calcjuroscomp;
 //@author bruno
import java.util.Scanner;
public class CalcJurosComp {


    public static void main(String[] args){
        
        int valor;
        int taxa;
        int prazo;
        
        Scanner ler = new Scanner(System.in);
   
        
        System.out.println("Digite o valor:");
        valor = ler.nextInt();
        System.out.println("Digite a taxa de juros");
        taxa = ler.nextInt();
        System.out.println("Digite o prazo:");
        prazo = ler.nextInt();
        
        //=======================================================
        
        System.out.println("==============================================================");
        System.out.println("==  O valor inserido foi: R$" + valor);
        System.out.println("==  A taxa de juros aplicada é: " + taxa + "%");
        System.out.println("==  O prazo inserido é: " + prazo + " vezes");
        System.out.println("==============================================================");
        
        //======================================================
        
        double multiplicador = Math.pow(1.0 + taxa / 100.0, prazo) - 1.0;
        System.out.printf("==  Os juros dos " + prazo + " meses somam: R$ %.2f", multiplicador*valor);
        System.out.println("");
        System.out.printf("==  A soma do valor aos juros dos meses é: R$ %.2f", (valor + (multiplicador * valor)));
        System.out.println("");
        System.out.println("===============================================================");
        
        ler.close();
        
    }
}
        