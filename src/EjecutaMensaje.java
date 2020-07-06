
import java.util.Scanner;


public class EjecutaMensaje {
    
    public static void main(String[] args) {
        
        Mensaje frase = new Mensaje();
        Validaciones frase1 = new Validaciones();
        Scanner entrada = new Scanner(System.in);
        String oracion, comparar1, comparar2;
        System.out.print("Ingrese una frase Palindroma: ");
        oracion=entrada.nextLine();
        frase.setFrase(oracion);
        
        frase.darFormato();
        comparar1 = frase.getFrase();
        System.out.print("La frase sin espacios ni puntos es: "+comparar1);
        frase.fraseInvertida();
        comparar2 = frase.getFrase();
        //System.out.println("La frase invertida es: "+comparar2);
        
        if(comparar1.equals(comparar2)){
            System.out.println("\nLa frase es palindroma");
        }
        else{
            System.out.println("\nLa frase no es palindroma");
        }
        
        boolean resultado;
        /*resultado = frase1.isPalindromo(frase);
        if(resultado){
            System.out.println("La frase es Palindroma");
        }
        else{
            System.out.println("la frase no es palindroma");
        }*/
        resultado = frase1.soloLetras(frase);
        if(resultado){
            System.out.println("La frase es alfabetica");
        }
        else{
            System.out.println("la frase no es Alfabetica");
        }
    }
    
}
