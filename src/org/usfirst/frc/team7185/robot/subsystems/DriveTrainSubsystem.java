package org.usfirst.frc.team7185.robot.subsystems;

import org.usfirst.frc.team7185.robot.RobotMap;
import org.usfirst.frc.team7185.robot.commands.DriveTrainCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
		SpeedController leftFrontMotor, leftRearMotor, rightFrontMotor, rightRearMotor;
		RobotDrive drive;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public DriveTrainSubsystem() {
		
		leftFrontMotor = new Spark(RobotMap.LeftFront);
		leftRearMotor = new Spark(RobotMap.LeftRear);
		rightFrontMotor = new Spark(RobotMap.RightFront);
		rightRearMotor = new Spark(RobotMap.RightRear);
		
		drive = new RobotDrive(leftFrontMotor, leftRearMotor, rightFrontMotor, rightRearMotor);
	}
	
	public void arcadeDrive(double x, double y) {
		drive.arcadeDrive(x, y);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveTrainCommand());
    }
}

