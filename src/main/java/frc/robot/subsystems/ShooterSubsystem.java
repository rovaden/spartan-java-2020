package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{

    private VictorSPX shootVic;

    public ShooterSubsystem(){
        shootVic = new VictorSPX(3);

    }

    public void shoot(double power) {
        shootVic.set(ControlMode.PercentOutput, power);
    }

    public void stopShoot() {
        shootVic.set(ControlMode.PercentOutput, 0);
    }

}