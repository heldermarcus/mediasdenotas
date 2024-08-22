package mediadasnotas;

import java.util.Scanner;

public class Mediadasnotas {

    public static void main(String[] args) {
        System.out.println("Seu boletim escolar. Descubra se você passou de ano. De acordo com suas notas e faltas.");
        
        Scanner ler=new Scanner(System.in);
        
        System.out.println("Em seguida vocè colocara suas medias das quatro unidades");
        
        System.out.println("Escreva a sua nota da primeira unidade e tecle enter");
        
        Float n1=ler.nextFloat();
        
        System.out.println("Escreva a sua nota da segunda unidade e tecle enter");
        
        Float n2=ler.nextFloat();
        System.out.println("Escreva a sua nota da terceira unidade e tecle enter");
        Float n3=ler.nextFloat();
        System.out.println("Escreva a sua nota da quarta unidade e tecle enter");
        Float n4=ler.nextFloat();
        Float media=((n1+n2+n3+n4)/4);
        System.out.println("Coloque a quantidade de faltas do seu ano letivo e tecle enter. \nOBS: Perde com 50 faltas");
        int faltas=ler.nextInt();
        if (media >=7 & faltas<50){
            System.out.println("Aprovado. Não fez mais que sua obrigacao");
        }else 
            System.out.println("Reprovado. So estuda e perdeu. Eh burro mesmo");
        System.out.println("A media das sua notas eh: "+media);
    }
    
}
