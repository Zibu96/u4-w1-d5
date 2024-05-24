package entities;

public abstract class ElementoRiproducibile extends ElementoMultimediale {

    protected int durata;
    protected int volume;


    public ElementoRiproducibile(String name, int durata, int volume) {
        super(name);
        this.durata = durata;
        this.volume = volume;
    }

    public void play() {
        String[] dur = new String[durata];
        String[] vol = new String[volume];
        for (int i = 0; i < dur.length; i++) {

            for (int j = 0; j < vol.length; j++) {
                vol[j] = "!";
                System.out.println(vol[j]);
            }
            dur[i] = name;
            System.out.println("il contenuto " + dur[i] + " ha volume: ");
        }
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
