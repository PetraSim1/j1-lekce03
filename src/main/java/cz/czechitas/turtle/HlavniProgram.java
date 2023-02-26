package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        //zmrzlina

        zofka.setLocation(100,400);

        nakresliKruznici(2,Color.pink);

        zofka.turnRight(90);
        zofka.setLocation(100,430);

        nakresliRovnostrannyTrojuhelnik(230, Color.yellow);



        //sněhulák


        zofka.setLocation(600,200);

        zofka.turnLeft(180);
        nakresliKruznici(1.5, Color.blue);

        zofka.turnLeft(180);
        nakresliKruznici(2, Color.blue);

        for (int i = 0; i < 90; i++) {
            zofka.move(2);
            zofka.turnRight(1);
        }

        zofka.turnRight(180);
        nakresliKruznici(0.5, Color.blue);
        zofka.turnRight(180);

        for (int i = 0; i < 180; i++) {
            zofka.move(2);
            zofka.turnRight(1);
        }

        zofka.turnRight(180);
        nakresliKruznici(0.5, Color.blue);

        for (int i = 0; i < 90; i++) {
            zofka.move(2);
            zofka.turnLeft(1);
        }

        nakresliKruznici(2.5, Color.blue);


        //vlak


        zofka.setLocation(1500,600);
        zofka.turnLeft(90);

        nakresliObdelnik(300, 200, Color.green);

        nakresliKruznici(1.75, Color.green);

        zofka.turnLeft(90);

        nakresliObdelnik(350, 150, Color.green);

        zofka.move(100);
        zofka.turnRight(180);
        nakresliKruznici(0.7, Color.green);
        zofka.turnRight(180);

        zofka.move(100);
        zofka.turnRight(180);
        nakresliKruznici(0.7, Color.green);
        zofka.turnRight(180);

        zofka.move(100);
        zofka.turnRight(180);
        nakresliKruznici(0.7, Color.green);
        zofka.turnRight(180);

        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(135);
        zofka.penDown();

        nakresliRovnostrannyPravouhlyTrojuhelnik(150, Color.green);




    }

    private void nakresliRovnostrannyPravouhlyTrojuhelnik(double delkaStrany, Color barva) {
        var velikostPrepony = Math.sqrt(2*Math.pow(delkaStrany, 2));

            zofka.setPenColor(barva);
            zofka.move(velikostPrepony);
            zofka.turnRight(135);
            zofka.move(delkaStrany);
            zofka.turnRight(90);
            zofka.move(delkaStrany);


    }

    private void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva) {
        for (int i = 0; i < 2; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    private void nakresliCtverec(double delkaStrany, Color barva) {
        for (int i = 0; i < 4; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(double delkaStarany, Color barva) {
        for (int i = 0; i < 3; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStarany);
            zofka.turnRight(120);
        }
    }

    private void nakresliKruznici(double delkaStrany, Color barva) {
        for (int i = 0; i < 360; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(1);

        }
    }

    private void pulkruh (double delkaStrany, Color barva) {
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
