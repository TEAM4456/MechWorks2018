package org.usfirst.frc.team4456.commands;

import org.usfirst.frc.team4456.Robot;
import org.usfirst.frc.team4456.RobotMap;
import org.usfirst.frc.team4456.subsystems.DriveDistance;

import edu.wpi.first.wpilibj.command.Command;

public class armMovement extends Command {

        boolean finished;
        double setPoint;

        public armMovement(double setPoint) {
            requires(Robot.armControl);
            finished = false;
            this.setPoint = setPoint;
        }

        protected void initialize() {}

        protected boolean isFinished() {
            return finished;
        }

        protected void execute() {
            Robot.armControl.ArmTalon1.setSelectedSensorPosition((int)setPoint,0,0);
        }

        protected void end() {
            Robot.drive.robotDrive.tankDrive(0, 0);
        }

        protected void interrupted() {
            end();
        }
    }

