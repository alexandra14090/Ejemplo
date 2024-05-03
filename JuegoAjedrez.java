import java.util.HashMap;

// Clase Flyweight que representa una pieza de ajedrez
interface Pieza {
    void mover(int fila, int columna);
}   

// Implementación concreta de la pieza (peon)
class Peon implements Pieza {
    private String color;

    public Peon(String color) {
        this.color = color;
    }

    public void mover(int fila, int columna) {
        System.out.println("Peón " + color + " movido a fila " + fila + ", columna " + columna);
    }
}

// Clase que actúa como fábrica de piezas
class FabricaPiezas {
    private HashMap<String, Pieza> piezas = new HashMap<>();

    public Pieza getPieza(String color) {
        Pieza pieza = piezas.get(color);

        if (pieza == null) {
            pieza = new Peon(color);
            piezas.put(color, pieza);
        }

        return pieza;
    }
}

// Clase Cliente (representa el juego de ajedrez)
public class JuegoAjedrez {
    public static void main(String[] args) {
        FabricaPiezas fabrica = new FabricaPiezas();

        // Creamos algunas piezas compartidas
        Pieza peonBlanco1 = fabrica.getPieza("blanco");
        Pieza peonBlanco2 = fabrica.getPieza("blanco");
        Pieza peonNegro1 = fabrica.getPieza("negro");

        // Movemos las piezas
        peonBlanco1.mover(2, 3);
        peonBlanco2.mover(4, 5);
        peonNegro1.mover(7, 6);
    }
}