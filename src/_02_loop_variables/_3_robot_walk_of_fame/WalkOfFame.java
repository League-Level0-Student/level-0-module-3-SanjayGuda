
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("batman");
		
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.setX(100);
		rob.penDown();
		rob.setSpeed(20);
		// You also need to show the robot to see the result of this line.
			int star = 0;
		// 2. Make the robot draw a star shape. Hint: angle=144.
			while(star < 10) {
				rob.penDown();
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.move(30);
			rob.turn(144);
			rob.penUp();
			rob.move(50);
			star+=1;
			}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		
		 * Hint: The distance between stars is 50.
		 */
			
	}

}
