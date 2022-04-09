
package simuladordebatalhapokemon;

import java.io.File;
import javax.sound.sampled.*;

public class AudioBatalha {
    void AudioBatalha() { //Método AudioAcerto para chamar na classe executavel.
        try {
            //URL do som que no caso esta no pendrive, mais ainda é uma fase de teste.
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\GIT\\SimuladorBatalhaPokemon\\sons\\battle.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }
}
