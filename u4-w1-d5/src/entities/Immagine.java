package entities;

import interfaces.AbbassaLumos;
import interfaces.AlzaLumos;
import interfaces.Lumos;


public class Immagine extends ElementoMultimediale implements Lumos, AlzaLumos, AbbassaLumos {
    private int lumin;

    public Immagine(String name, int lumin) {
        super(name);
        this.lumin = lumin;
    }

    @Override
    public void luminosità() {
        String[] lum = new String[lumin];
        for (int i = 0; i < lum.length; i++) {
            lum[i] = "*";
            System.out.println(lum[i]);
        }

    }

    public void show() {
        System.out.println("L'immagine " + this.name + " ha luminosità: ");
        luminosità();

    }

    public void setLumin(int lumin) {
        this.lumin = lumin;

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
