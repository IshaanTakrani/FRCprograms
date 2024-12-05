package frc.robot;


import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.controls.DutyCycleOut;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
    // Motors for each swerve module (drive and turn)
    private final TalonFX frontLeftDrive = new TalonFX(1);
    private final TalonFX frontLeftTurn = new TalonFX(2);
    private final TalonFX frontRightDrive = new TalonFX(3);
    private final TalonFX frontRightTurn = new TalonFX(4);
    private final TalonFX backLeftDrive = new TalonFX(5);
    private final TalonFX backLeftTurn = new TalonFX(6);
    private final TalonFX backRightDrive = new TalonFX(7);
    private final TalonFX backRightTurn = new TalonFX(8);

    private final Joystick joystick = new Joystick(0);

    @Override
    public void robotInit() {
        // Configure TalonFX controllers
        configureMotor(frontLeftDrive);
        configureMotor(frontLeftTurn);
        configureMotor(frontRightDrive);
        configureMotor(frontRightTurn);
        configureMotor(backLeftDrive);
        configureMotor(backLeftTurn);
        configureMotor(backRightDrive);
        configureMotor(backRightTurn);
    }

    @Override
    public void teleopPeriodic() {
        // Get joystick inputs for basic control
        double xSpeed = joystick.getRawAxis(1); // Forward/Backward
        double ySpeed = joystick.getRawAxis(0); // Strafe
        double rotation = joystick.getRawAxis(4); // Rotation

        // Example: drive motors only for simple demo
        frontLeftDrive.set(ControlMode.PercentOutput, xSpeed);
        frontRightDrive.set(ControlMode.PercentOutput, xSpeed);
        backLeftDrive.set(ControlMode.PercentOutput, xSpeed);
        backRightDrive.set(ControlMode.PercentOutput, xSpeed);

        // Turn motors to some fixed angle (e.g., 45 degrees)
        // For simplicity, we assume raw percent output here
        frontLeftTurn.set(ControlMode.PercentOutput, 0.5);
        frontRightTurn.set(ControlMode.PercentOutput, 0.5);
        backLeftTurn.set(ControlMode.PercentOutput, 0.5);
        backRightTurn.set(ControlMode.PercentOutput, 0.5);
    }

    private void configureMotor(TalonFX motor) {
        TalonFXConfiguration config = new TalonFXConfiguration();
        motor.configAllSettings(config);
        motor.setSelectedSensorPosition(0);
    }
}
