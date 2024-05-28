import java.util.Scanner;

public class Contador {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro parametro");
    int parametroUm = sc.nextInt();

    System.out.println("Digite o segundo parametro");
    int parametroDois = sc.nextInt();

    try {
        contador(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo paramentro deve ser maior que o primeiro");
    }
 }

    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
         }


         int contagem = parametroDois - parametroUm;
         for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
         }
    }




}
