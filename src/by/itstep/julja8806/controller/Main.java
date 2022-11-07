package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.entity.*;

import javax.sql.rowset.CachedRowSet;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(3.50, 45, "Hot Wells");
        Car car2 = new Car(1.50, 200, "Палесье");
        Car car3 = new Car(50, 100, "Lego");

        Block block1 = new Block(0.50, 5, "Lego Duplo");
        Block block2 = new Block(1, 3, "Lego");
        Block block3 = new Block(0.30, 10, "Палесье");

        Doll doll1 = new Doll(10, 10, "Marvell");
        Doll doll12 = new Doll(20, 200, "Barby");
        Doll doll3 = new Doll(15, 50, "LOL");

        Ball ball1 = new Ball(100, 500, "UEFA");
        Ball ball2 = new Ball(50, 700, "Basketball");
        Ball ball3 = new Ball(5, 100, "Gammy");

        Child child1 = new Child(2);
        Child child2 = new Child(8);
        Child child3 = new Child(5);
        Child child4 = new Child(4);

    }


}
