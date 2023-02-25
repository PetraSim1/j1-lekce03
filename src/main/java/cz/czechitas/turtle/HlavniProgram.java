package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        zofka.setLocation(100,500);

        nakresliRovnostrannyTrojuhelnik(300, Color.green);

        zofka.setLocation(400,500);

       nakresliCtverec(150, Color.yellow);

        zofka.setLocation(700,500);

        nakresliObdelnik(100, 200, Color.red);

        zofka.setLocation(1000,500);

        nakresliKruznici(3, Color.blue);

    }

    private void nakresliObdelnik(float delkaStranyA, float delkaStranyB, Color barva) {
        for (int i = 0; i < 2; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    private void nakresliCtverec(float delkaStrany, Color barva) {
        for (int i = 0; i < 4; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(float delkaStarany, Color barva) {
        for (int i = 0; i < 3; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStarany);
            zofka.turnRight(120);
        }
    }

    private void nakresliKruznici(float delkaStrany, Color barva) {
        for (int i = 0; i < 360; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(1);

        }
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
