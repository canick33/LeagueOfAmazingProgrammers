package gridWorld;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 0. Download the Gridworld JAR. 1. maxke a new Java Project and add
		 * this JAR to it. Right click Colour project and add it as an External
		 * JAR (Under Java Build Path > Libraries). 2. Figure out how to get the
		 * World to show. 3. Figure out how to add a Bug to the world (clue:
		 * Colou will need the Bug and Location objects) 4. Add another bug at a
		 * random location in the world. 5. Change the color of that bug to
		 * blue. 6. maxke the bug face to the right. 7. Add flowers to the left
		 * and right of the bug. 8. Fill the whole world with flowers! 9.
		 * [Optional] Color the flowers in rows like the American flag (red &
		 * white) 10. [Optional] Use a new class to maxke an Row out of bugs.
		 * 
		 */
		/* Define some constants for Bug World */
		int maxRowLocation = 9;
		int minRowLocation = 0;
		int maxColLocation = 9;
		int minColLocation = 0;

		/* Instantiate a world */
		World myWorld = new World();
		/* Show the World */
		myWorld.show();
		/* Create a bug */
		Bug myBug1 = new Bug();
		/* Create a location for the bug */
		int myBug1Row = 5;
		int myBug1Col = 5;
		Location myBug1Location = new Location(myBug1Row, myBug1Col);
		/* Add myBug1 to the world at myBug1Location */
		myWorld.add(myBug1Location, myBug1);
		/* Wait a second before going on to the next step */
		TimeUnit.SECONDS.sleep(1);

		/* Instantiate a random number generator */
		Random random = new Random();
		/* Create a second bug */
		Bug myBug2 = new Bug();
		/* Figure out the random location for bug2 */
		int myBug2Row = random.nextInt((maxRowLocation - minRowLocation) + 1) + minRowLocation;
		int myBug2Col = random.nextInt(((maxColLocation - 1) - (minColLocation + 1)) + 1) + (minColLocation + 1);

		/* Don't let it land on bug1's location */
		if ((myBug2Row == myBug1Row) && (myBug2Col == myBug1Col)) {
			/* Choose another Row for bug2 */
			while (myBug2Row == myBug1Row) {
				myBug2Row = random.nextInt((maxRowLocation - minRowLocation) + 1) + minRowLocation;
			}
		}
		/* Create a location for bug 2 */
		Location myBug2Location = new Location(myBug2Row, myBug2Col);
		myWorld.add(myBug2Location, myBug2);

		/* Wait a second before going on to the next step */
		TimeUnit.SECONDS.sleep(1);

		/* Change myBug2 to blue */
		myBug2.setColor(Color.BLUE);

		/* Wait a second before going on to the next step */
		TimeUnit.SECONDS.sleep(1);

		/* Get the bug to turn to the right */
		myBug2.turn();
		/* Wait a second before going on to the next step */
		TimeUnit.SECONDS.sleep(1);
		myBug2.turn();

		/* Add a flower to the left and right of the bug */
		Flower myFlowerL = new Flower(Color.BLUE);
		/* Figure the location to the left of myBug2 */
		Location myFlowerLLocation = new Location(myBug2Row, myBug2Col - 1);
		/* Add the flower to the left of myBug2 */
		myWorld.add(myFlowerLLocation, myFlowerL);
		Flower myFlowerR = new Flower(Color.RED);
		/* Figure the location to the right of myBug2 */
		Location myFlowerRLocation = new Location(myBug2Row, myBug2Col + 1);
		/* Add the flower to the right of myBug2 */
		myWorld.add(myFlowerRLocation, myFlowerR);
		/* Wait a second before going on to the next step */
		TimeUnit.SECONDS.sleep(1);

		/* Fill the world with Flowers */
		for (int row = minRowLocation; row <= maxRowLocation; row++) {
			for (int col = minColLocation; col <= maxColLocation; col++) {
				myWorld.add(new Location(row, col), new Flower(Color.YELLOW));
			}
		}

		/* Wait a second before going on to the next step */
		TimeUnit.SECONDS.sleep(1);

		/* Fill the world with Flowers */
		for (int row = minRowLocation; row <= maxRowLocation; row++) {
			for (int col = minColLocation; col <= maxColLocation; col++) {
				myWorld.add(new Location(row, col), ((row % 2 == 0) ? new Flower(Color.RED) : new Flower(Color.BLUE)));
			}
		}

		/* Wait a second before going on to the next step */
		TimeUnit.SECONDS.sleep(1);

		/* Make an X out of bugs */
		for (int i = 0; i <= maxRowLocation; i++) {
			myWorld.add(new Location(i, i), new Bug(Color.GREEN));
			myWorld.add(new Location((maxRowLocation - i), i), new Bug(Color.GREEN));
		}
	}

}
