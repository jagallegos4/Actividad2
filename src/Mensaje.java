
public class Mensaje {
    private String frase;

    public Mensaje() {
        frase = "";
    }  

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    public void darFormato(){
        frase=frase.toLowerCase().replace(" ", "").replace(".","");
        frase=frase.toString();
    }
    
    public void fraseInvertida(){
        StringBuilder invertir = new StringBuilder(frase);
        frase = invertir.reverse().toString();
    }
}
