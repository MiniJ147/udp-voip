package sound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundPlayer {
    Clip clip;
    AudioInputStream audioInputStream;

    // constructor to initialize streams and clip
    public SoundPlayer()
            throws UnsupportedAudioFileException,
            IOException,
            LineUnavailableException {
        // create AudioInputStream object
        audioInputStream =
                AudioSystem.getAudioInputStream(new File("C:\\Users\\Jake Paul\\Desktop\\Programming\\Java\\udp-voip\\samples\\RecordAudio.wav"));

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

        clip.loop(Clip.LOOP_CONTINUOUSLY);

        clip.start();
    }
}
