package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

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

}

