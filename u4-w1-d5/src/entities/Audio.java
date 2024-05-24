package entities;

import interfaces.AbbassaVolume;
import interfaces.AlzaVolume;
import interfaces.Volume;

public class Audio extends ElementoRiproducibile implements Volume, AlzaVolume, AbbassaVolume {


    public Audio(String name, int durata, int volume) {
        super(name, durata, volume);
    }

    @Override
    public void volume() {
        String[] vol = new String[volume];
        for (int j = 0; j < vol.length; j++) {
            vol[j] = "!";
            System.out.println(vol[j]);
        }
    }


    @Override
    public void play() {
        String[] dur = new String[durata];

        for (int i = 0; i < dur.length; i++) {
            dur[i] = name;
            System.out.println("L'audio " + dur[i] + " ha volume: ");
            volume();

        }
    }


    @Override
    public void alzaVolume() {
        this.volume = this.volume + 1;
        System.out.println("il nuovo volume è" + this.volume);
    }

    @Override
    public void abbassaVolume() {
        this.volume = this.volume - 1;
        System.out.println("il nuovo volume è" + this.volume);
    }
}
