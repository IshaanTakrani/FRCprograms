package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
    // Motor Controllers for Falcon 500
    private WPI_TalonFX m_leftMotor;
    private WPI_TalonFX m_rightMotor;

    // Single Solenoid for Pneumatic Control
    private Solenoid m_solenoid;

    @Override
    public void robotInit() {
        // Initialize Falcon 500 motors with their CAN IDs
        m_leftMotor = new WPI_TalonFX(1); // Left motor on CAN ID 1
        m_rightMotor = new WPI_TalonFX(2); // Right motor on CAN ID 2

        // Set the right motor to invert its direction if needed
        m_rightMotor.setInverted(true);

        // Initialize the single solenoid on PCM channel 0
        m_solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
    }

    @Override
    public void teleopPeriodic() {
        // Hardcoded motor movement
        m_leftMotor.set(ControlMode.PercentOutput, 0.5); // Left motor at 50% power
        m_rightMotor.set(ControlMode.PercentOutput, 0.5); // Right motor at 50% power

        // Hardcoded pneumatic control: Activate the solenoid
        m_solenoid.set(true); // Set solenoid to ON
    }
}
