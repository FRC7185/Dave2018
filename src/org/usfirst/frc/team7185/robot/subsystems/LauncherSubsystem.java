package org.usfirst.frc.team7185.robot.subsystems;

import org.usfirst.frc.team7185.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LauncherSubsystem extends Subsystem {
	
	WPI_TalonSRX leftLauncherMotor;
	WPI_TalonSRX rightLauncherMotor;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
public LauncherSubsystem() {
		
		leftLauncherMotor = new WPI_TalonSRX(RobotMap.leftLauncherDriver);
		rightLauncherMotor = new WPI_TalonSRX(RobotMap.rightLauncherDriver);
		
	}


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

