package curso_java;

import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a, b e c ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        double delta = b*b- 4*a*c;
        System.out.println(delta);
        if(delta>= 0){
            double x1 = -(b)-(Math.sqrt(delta))/ 2*a;
            double x2 = -(b)+(Math.sqrt(delta))/ 2*a;
            System.out.println("x1 é igual a "+x1);
            System.out.println("x2 é igual a "+x2);
        }
    }


}
