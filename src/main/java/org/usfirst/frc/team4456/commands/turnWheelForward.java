package org.usfirst.frc.team4456.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4456.Robot;

public class turnWheelForward extends Command {

	/*
	THIS COMMAND IS PROBABLY TEMPORARY
	PLANNED FUNCTIONALITY IS SWAPPING BETWEEN 2 SPECIFIC PID POSITIONS FOR HIGH GOAL/LOW GOAL
	*/

	boolean finished;

	public turnWheelForward() { requires(Robot.wheelControl); }
	
	protected void initialize() { finished = false; }
	
	protected boolean isFinished() { return finished; }
	
	protected void execute() {
		System.out.println("turnWheelForward");
		Robot.wheelControl.turnForward();
		finished = true;
	}
	
	protected void end() {  }
	
	protected void interrupted() { end(); }
	
}
