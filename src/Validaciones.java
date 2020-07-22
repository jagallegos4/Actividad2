
public class Validaciones {
    private boolean palindromo, letras;
    private Mensaje frase;
    
    //Mensaje ob1 = new Mensaje();  

    public Validaciones() {
        palindromo = false;
        letras= false;
        frase = frase;
    }

    public Mensaje getFrase() {
        return frase;
    }

    public void setFrase(Mensaje frase) {
        this.frase = frase;
    }
    
    
    
    public boolean isPalindromo(Mensaje frase){
        
        String comparar = frase.getFrase();
        frase.darFormato();
        StringBuilder invertir = new StringBuilder(comparar);
        invertir.reverse();
        if(comparar.equals(invertir)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean soloLetras(Mensaje frase){
        char [] palax = new char[frase.getFrase().length()];
        palax = frase.getFrase().toCharArray();
        for(char c:palax){
            if(Character.isDigit(c))
                return false;
        }
        return true;
    }
}
