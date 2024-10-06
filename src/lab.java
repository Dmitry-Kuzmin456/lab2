import ru.ifmo.se.pokemon.*;
import my_pokemons.*;

public class lab {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Diancie("Чужой", 1);
        Pokemon p2 = new Diglett("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        System.out.println();
        b.go();
    }
}
