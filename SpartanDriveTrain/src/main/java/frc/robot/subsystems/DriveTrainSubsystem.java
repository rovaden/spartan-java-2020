package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class DriveTrainSubsystem extends SubsystemBase {

    private Victor leftVictor1;
    private Victor leftVictor2;
    private Victor rightVictor1;
    private Victor rightVictor2;

    public DriveTrainSubsystem() {
        leftVictor1 = new Victor(Constants.LEFT_VICTOR_1);
        leftVictor2 = new Victor(Constants.LEFT_VICTOR_2);
        leftVictor1 = new Victor(Constants.RIGHT_VICTOR_1);
        leftVictor1 = new Victor(Constants.RIGHT_VICTOR_2);
    }

    public void drive(double leftPower, double rightPower) {
        leftVictor1.set(leftPower);
        leftVictor2.set(leftPower);
        rightVictor1.set(rightPower);
        rightVictor2.set(rightPower);
    }

    @Override
    public void periodic() {
        double leftY = Robot.robotContainer.leftJoy.getY();
        double rightY = Robot.robotContainer.rightJoy.getY();
        drive(leftY, rightY);
    }

}
