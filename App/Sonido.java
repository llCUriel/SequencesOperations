package project15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sonido {

    private String ligaDeAudio;
    private InputStream in;
    private AudioStream audio;

    public Sonido(String ligaDeAudio) {
        try {
            this.ligaDeAudio = ligaDeAudio;
            in = new FileInputStream(ligaDeAudio);
            audio = new AudioStream(in);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Sonido() {
        this.ligaDeAudio = "";
        this.in = null;
        this.audio = null;
    }

    protected void finalize() {
        ligaDeAudio = null;
        in = null;
        audio = null;
        System.gc();
    }

    public void emitirSonidoDeTip() {
        emitirSonido("src/Sonido/light.wav");
    }

    public void emitirSonido_(String liga) {
        emitirSonido(liga);
    }

    public void emitirSonidoClick() {
        emitirSonido("src/Sonido/moneda.wav");
    }

    public void emitirSonidoEncimaDeIcono() {
        emitirSonido("src/Sonido/over.wav");
    }

    public void emitirSonidoWindows() {
        emitirSonido("src/Sonido/windows.wav");
    }

    public void emitirSonido(String liga) {
        try {
            this.in = new FileInputStream(liga);
            this.audio = new AudioStream(in);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AudioPlayer.player.start(audio);
    }
}
