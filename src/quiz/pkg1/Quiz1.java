/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author anisoaraavram
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city
        City kw = new City();

        //creating robot
        Robot karel = new Robot(kw, 4, 0, Direction.EAST);

        //creating wall
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        //creating the things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        //getting karel to move
        karel.move();
        //getting karel to pick up the thing
        karel.pickThing();
        //getting karel to turn
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to turn left
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to pick up
        karel.pickThing();
        //getting karel to turn Left
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to turn Left
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to pick up
        karel.pickThing();
        //getting karel to turn left
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to turn left
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to pick thing
        karel.pickThing();
        //getting karel to move
        karel.move();
        //getting karel to drop thing
        karel.putThing();
        //getting karel to move
        karel.move();
        //getting karel to turn left
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to put thing
        karel.putThing();
        //getting karel to 
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to turn
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to put thing
        karel.putThing();
        //getting karel to turn left
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to turn left
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        //getting karel to move
        karel.move();
        //getting karel to put thing
        karel.putThing();
        //getting karel to turn left
        karel.turnLeft();
        //getting karel to move
        karel.move();

    }

}
