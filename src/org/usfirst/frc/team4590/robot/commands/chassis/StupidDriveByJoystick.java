package org.usfirst.frc.team4590.robot.commands.chassis;

import org.usfirst.frc.team4590.robot.OI;
import org.usfirst.frc.team4590.robot.subsystems.Chassis;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives in a fucking weird way that i (ohad) am not sure i understand
 */
public class StupidDriveByJoystick extends Command {
	// kill me (Ohad) - OKAY! (Guyde)

	public StupidDriveByJoystick() {
		// Use requires() here to declare subsystem dependencies
		requires(Chassis.getInstance());
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		// double powerL = OI.getInstance().getMainLeftY();
		// double powerR = OI.getInstance().getMainLeftY();
		/*
		 * switch (direction){ case LEFT: powerL /= 2; case RIGHT: powerR /= 2;
		 * }
		 */
		double turn = 0;
		if (OI.getInstance().getMainL1()) {
			turn = -1;
		} else if (OI.getInstance().getMainR1()) {
			turn = 1;
		}
		Chassis.getInstance().arcadeDrive(OI.getInstance().getMainLeftY(), turn);
		System.out.println("Stupid (=Ohad (From Guy <3)): something went wrong");

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
