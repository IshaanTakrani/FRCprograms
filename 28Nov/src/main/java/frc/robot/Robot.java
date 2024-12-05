package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;

// XboxController exampleXbox = new XboxController(0); // 0 is the USB Port to be used as indicated on the Driver Station

public class Robot extends TimedRobot {

    private TalonFX motor; // TalonFX motor controller
    private Timer timer;   // Timer to control runtime

    @Override
    public void robotInit() {
        // Initialize motor and timer
        motor = new TalonFX(21); // Replace '1' with the actual CAN ID of your motor controller
        timer = new Timer();
    }

    @Override
    public void autonomousInit() {
        // Reset and start the timer
        timer.reset();
        timer.start();
    }

    @Override
    public void autonomousPeriodic() {
        if (timer.get() < 5.0) {
            // Run the motor forward at 50% power for 5 seconds
            motor.set(ControlMode.PercentOutput, 0.5);
        } else {
            // Stop the motor after 5 seconds
            motor.set(ControlMode.PercentOutput, 0.0);
        }
    }

    @Override
    public void teleopPeriodic() {
        // Stop the motor during teleop for safety
        motor.set(ControlMode.PercentOutput, 0.0);
    }

    @Override
    public void disabledInit() {
        // Stop the motor when the robot is disabled
        motor.set(ControlMode.PercentOutput, 0.0);
    }
}