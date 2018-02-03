package org.usfirst.frc.team4456.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4456.RobotMap;

public class WheelControl extends Subsystem{
    protected void initDefaultCommand() { /* set default command here */ }

    public static void turnForward() {
        RobotMap.armTalon1.set(RobotMap.armTalon1.get() + 0.3);
    }

    public static void turnBackward() {
        RobotMap.armTalon1.set(RobotMap.armTalon1.get() - 0.3);
    }

    public static void stopWheel() {
        RobotMap.armTalon1.set(RobotMap.armTalon1.get());
    }
}
