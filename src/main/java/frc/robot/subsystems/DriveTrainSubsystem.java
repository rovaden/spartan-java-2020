package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.controls.CustomVictor;

public class DriveTrainSubsystem extends SubsystemBase {

    private CustomVictor leftVictor1;
    private CustomVictor leftVictor2;
    private CustomVictor rightVictor1;
    private CustomVictor rightVictor2;
    private DifferentialDrive differentialDrive;

    public DriveTrainSubsystem() {
        leftVictor1 = new CustomVictor(Constants.LEFT_VICTOR_1);
        leftVictor2 = new CustomVictor(Constants.LEFT_VICTOR_2);
        rightVictor1 = new CustomVictor(Constants.RIGHT_VICTOR_1);
        rightVictor2 = new CustomVictor(Constants.RIGHT_VICTOR_2);

        leftVictor2.follow(leftVictor1);
        rightVictor2.follow(rightVictor1);

        differentialDrive = new DifferentialDrive(leftVictor1, rightVictor1);
    }

    public void drive(double leftPower, double rightPower) {
        leftVictor1.set(ControlMode.PercentOutput, leftPower);
        leftVictor2.set(ControlMode.PercentOutput, leftPower);
        rightVictor1.set(ControlMode.PercentOutput, rightPower);
        rightVictor2.set(ControlMode.PercentOutput, rightPower);
    }
//
//    public void arcadeDrive(double forward, double rotation) {
//
//        differentialDrive.arcadeDrive(forward, rotation);
//
//    }

    @Override
    public void periodic() {

        double leftPower = Robot.robotContainer.getLeftY();
        double rightPower = Robot.robotContainer.getRightY();
        drive(rightPower, -leftPower);

       
    }
//        System.out.println(Robot.robotContainer.primaryJoy.getButtonCount());
//
//        int button = Robot.robotContainer.primaryJoy.getButtonCount();
//        switch (button)
//        {
//             case 5 :
//                 double forwardPower = Robot.robotContainer.getLeftY();
//                 double turnPower = Robot.robotContainer.getRightX();
//                 arcadeDrive(forwardPower, turnPower);
//                 break;
//            case 6 :
//                double leftPower = Robot.robotContainer.getLeftY();
//                double rightPower = Robot.robotContainer.getRightY();
//                drive(leftPower, rightPower);
//                break;
//        }
}
