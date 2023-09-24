package notaaprobado_0;
import java.util.Scanner;


public class NotaAprobado {
    Scanner entrada = new Scanner(System.in);
    int nota;
    public void ent()
    {
        System.out.println("Introduzca nota a analizar:");
        nota = entrada.nextInt();
    }
    
    public void evalSal()
    {
        if (nota > 5) {
            System.out.println("Prueba superada ");
        }
    }
    
    public static void main(String[] args) {
        
        NotaAprobado not;
        not = new NotaAprobado();
        not.ent();
        not.evalSal();
    }

}
