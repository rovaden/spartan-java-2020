package frc.robot.controls;

import com.ctre.phoenix.motorcontrol.ControlMode;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;



/**

 * Custom TalonSRX which allows it to be treated as a SpeedController

 */

public class CustomVictor extends VictorSPX implements SpeedController, Sendable {



    private double currentSpeed;



    public CustomVictor(int channel) {

        super(channel);

    }



    @Override

    public void pidWrite(double output) {

        

    }



    @Override

    public void set(double speed) {

        currentSpeed = speed;

        super.set(ControlMode.PercentOutput, currentSpeed);

    }



    @Override

    public double get() {

        return currentSpeed;

    }



    @Override

    public void disable() {

        set(0);

    }



    @Override

    public void stopMotor() {

        set(0);

    }



    @Override

    public String getName() {

        return CustomVictor.class.getSimpleName();

    }



    @Override

    public void setName(String name) {



    }



    @Override

    public String getSubsystem() {

        return null;

    }



    @Override

    public void setSubsystem(String subsystem) {



    }



    @Override

    public void initSendable(SendableBuilder builder) {

        builder.addDoubleProperty("speed", () -> get(), d -> set(d));

	}

}