import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Audio el1 = new Audio("ciao", 5, 7);
        Video video1 = new Video("gattini", 6, 4, 2);
        Immagine img1 = new Immagine("foto", 6);

        img1.show();
        video1.play();
        el1.play();

        el1.alzaVolume();
        img1.abbassaLumos();
        video1.abbassaVolume();
        video1.alzaLumos();

        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] multi = new ElementoMultimediale[5];
        for (int i = 0; i < multi.length; i++) {


            System.out.println("Cosa vuoi creare?");
            String elem = scanner.nextLine();

            if (elem.equals("immagine")) {
                ElementoMultimediale elemArr = new Immagine(null, 0);
                System.out.println("Come la vuoi chiamare?");
                elemArr.setName(scanner.nextLine());
                System.out.println("Quanto la vuoi luminosa?");
                ((Immagine) elemArr).setLumin(scanner.nextInt());
                multi[i] = elemArr;
            } else if (elem.equals("video")) {
                ElementoMultimediale elemArr = new Video(null, 0, 0, 0);
                System.out.println("Come lo vuoi chiamare?");
                elemArr.setName(scanner.nextLine());
                System.out.println("Quanto vuoi che duri?");
                ((Video) elemArr).setDurata(scanner.nextInt());
                System.out.println("Quanto volume vuoi che abbia?");
                ((Video) elemArr).setVolume(scanner.nextInt());
                System.out.println("Quanto lo vuoi luminoso?");
                ((Video) elemArr).setLumin(scanner.nextInt());
                multi[i] = elemArr;
            } else if (elem.equals("audio")) {
                ElementoMultimediale elemArr = new Audio(null, 0, 0);
                System.out.println("Come lo vuoi chiamare?");
                elemArr.setName(scanner.nextLine());
                System.out.println("Quanto vuoi che duri?");
                ((Audio) elemArr).setDurata(scanner.nextInt());
                System.out.println("Quanto volume vuoi che abbia?");
                ((Audio) elemArr).setVolume(scanner.nextInt());
                multi[i] = elemArr;
            } else System.out.println("Devi aver sbagliato qualcosa... riprova");
            scanner.nextLine();

        }
        System.out.println("Hai creato tutti gli elementi con successo");

        int input = 0;
        do {


            System.out.println("Scegli un oggetto da riprodurre:");
            input = scanner.nextInt();
            switch (input) {
                case 1: {
                    if (multi[0] instanceof Immagine) {
                        ((Immagine) multi[0]).show();

                    } else if (multi[0] instanceof Audio) {
                        ((Audio) multi[0]).play();

                    } else if (multi[0] instanceof Video) {
                        ((Video) multi[0]).play();

                    }
                    break;
                }
                case 2: {
                    if (multi[1] instanceof Immagine) {
                        ((Immagine) multi[1]).show();

                    } else if (multi[1] instanceof Audio) {
                        ((Audio) multi[1]).play();

                    } else if (multi[1] instanceof Video) {
                        ((Video) multi[1]).play();

                    }
                    break;
                }
                case 3: {
                    if (multi[2] instanceof Immagine) {
                        ((Immagine) multi[2]).show();

                    } else if (multi[2] instanceof Audio) {
                        ((Audio) multi[2]).play();

                    } else if (multi[2] instanceof Video) {
                        ((Video) multi[2]).play();

                    }
                    break;
                }
                case 4: {
                    if (multi[3] instanceof Immagine) {
                        ((Immagine) multi[3]).show();

                    } else if (multi[3] instanceof Audio) {
                        ((Audio) multi[3]).play();

                    } else if (multi[3] instanceof Video) {
                        ((Video) multi[3]).play();

                    }
                    break;
                }
                case 5: {
                    if (multi[4] instanceof Immagine) {
                        ((Immagine) multi[4]).show();

                    } else if (multi[4] instanceof Audio) {
                        ((Audio) multi[4]).play();

                    } else if (multi[4] instanceof Video) {
                        ((Video) multi[4]).play();

                    }
                    break;
                }
                case 0: {
                    System.out.println("Grazie per aver giocato con noi");
                    break;
                }
                default:
                    System.out.println("Scelta non valida, riprova");


            }
        } while (input != 0);


        scanner.close();
    }
}


