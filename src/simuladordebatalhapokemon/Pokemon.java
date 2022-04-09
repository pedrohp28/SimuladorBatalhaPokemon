
package simuladordebatalhapokemon;


public class Pokemon {
    
    protected String nome;
    protected String tipo;
    protected int vida;
    protected int forca;

    public Pokemon(String nome, String tipo, int vida, int forca){
        
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        
    }
    
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }
    
}
