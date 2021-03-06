package org.usfirst.frc.team4183.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4183.robot.Robot;

/**
 *
 */
public class LoggerCommand extends Command {

    public LoggerCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.prototypeSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.prototypeSubsystem.startLogger();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	// We're only interested in initialize(), 
    	// so might as well finish immediately
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
