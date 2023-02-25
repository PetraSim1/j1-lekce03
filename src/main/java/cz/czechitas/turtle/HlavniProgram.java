package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();


       pulkruh(1, Color.yellow);

       zofka.turnRight(90);
       zofka.penUp();
       zofka.move(130);
       zofka.turnRight(90);
       zofka.penDown();

       pulkruh(1.3f, Color.red);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(170);
        zofka.turnRight(90);
        zofka.penDown();

        pulkruh(1.7f, Color.green);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(210);
        zofka.turnRight(90);
        zofka.penDown();

        pulkruh(2f, Color.blue);
    }

    private void pulkruh (float delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i <180; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(1);

        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
