package pruebas;

import entidades.evento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prueba01 {
    public static void main(String[] args) {
        List<evento> eventos = new ArrayList<evento>();
        for (int i = 0; i < 10; i++) {
            eventos.add(new evento(
                    1,
                    "Tony rosado y su agrupacion Marilyn",
                    3.0,
                    74032020,
                    "19:00",
                    "22:00",
                    5.0,
                    74032041
            );
        }
    }
}
