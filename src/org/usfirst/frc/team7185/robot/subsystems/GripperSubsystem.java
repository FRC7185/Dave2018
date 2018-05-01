package org.usfirst.frc.team7185.robot.subsystems;

import org.usfirst.frc.team7185.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GripperSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands. 
	
	DoubleSolenoid gripperSolenoid;
	
	public GripperSubsystem() {
		
		gripperSolenoid = new DoubleSolenoid(RobotMap.gripperSolenoidOpen, RobotMap.gripperSolenoidClose);
		
	}
	
	public void set(Value value) {
		gripperSolenoid.set(value);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
}

