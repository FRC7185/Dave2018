package org.usfirst.frc.team7185.robot.subsystems;

import org.usfirst.frc.team7185.robot.RobotMap;
import org.usfirst.frc.team7185.robot.commands.DriveTrainCommand;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
		SpeedController leftFrontMotor, leftRearMotor, rightFrontMotor, rightRearMotor;
		SpeedControllerGroup leftDrive, rightDrive;
		DifferentialDrive drive;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public DriveTrainSubsystem() {
		
		leftFrontMotor = new Spark(RobotMap.LeftFront);
		leftRearMotor = new Spark(RobotMap.LeftRear);
		rightFrontMotor = new Spark(RobotMap.RightFront);
		rightRearMotor = new Spark(RobotMap.RightRear);
		
		leftDrive = new SpeedControllerGroup(leftFrontMotor, leftRearMotor);
		rightDrive = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);
		
		drive = new DifferentialDrive(leftDrive, rightDrive);
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

