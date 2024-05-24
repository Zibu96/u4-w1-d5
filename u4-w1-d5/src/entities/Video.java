package entities;

import interfaces.*;

public class Video extends ElementoRiproducibile
        implements Volume, Lumos, AlzaVolume, AbbassaVolume, AlzaLumos, AbbassaLumos {
    private int lumin;

    public Video(String name, int durata, int volume, int lumin) {
        super(name, durata, volume);
        this.lumin = lumin;
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
    public void luminosità() {
        String[] lum = new String[lumin];
        for (int i = 0; i < lum.length; i++) {
            lum[i] = "*";
            System.out.println(lum[i]);
        }

    }

    @Override
    public void play() {
        String[] dur = new String[durata];
        String[] vol = new String[volume];
        for (int i = 0; i < dur.length; i++) {

            dur[i] = name;
            System.out.println("Il video " + dur[i] + " ha volume: ");
            volume();
            System.out.println("E luminosità: ");
            luminosità();
        }
    }

    public void setLumin(int lumin) {
        this.lumin = lumin;
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

    @Override
    public void abbassaLumos() {
        this.lumin = this.lumin + 1;
        System.out.println("La nuova luminosità è " + this.lumin);
    }

    @Override
    public void alzaLumos() {
        this.lumin = this.lumin - 1;
        System.out.println("La nuova luminosità è " + this.lumin);
    }
}

