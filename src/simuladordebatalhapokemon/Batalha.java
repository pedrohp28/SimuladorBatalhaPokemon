package simuladordebatalhapokemon;

import java.util.Random;

public class Batalha{
    
    public int causarDano(Pokemon pokemon) {

        Random multiplicador = new Random();
        int dano = (multiplicador.nextInt(10) + 1) * pokemon.forca;
        return dano;
    }

}
