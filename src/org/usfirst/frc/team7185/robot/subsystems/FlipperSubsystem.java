package org.usfirst.frc.team7185.robot.subsystems;

import org.usfirst.frc.team7185.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FlipperSubsystem extends Subsystem {
	
	private WPI_TalonSRX flipperMotor;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public FlipperSubsystem(){
		
		flipperMotor = new WPI_TalonSRX(RobotMap.flipperDriver);
		flipperMotor.configOpenloopRamp (3, 2000); 
		
	}
	
	public void set(double speed) {
		
		flipperMotor.set(speed);

	}

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
}

