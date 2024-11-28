package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
    
    private final WPI_TalonFX m_leftMotor = new WPI_TalonFX(1); // Left motor on CAN ID 1
    private final WPI_TalonFX m_rightMotor = new WPI_TalonFX(2); // Right motor on CAN ID 2
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);

    
    private Solenoid m_solenoid;

    @Override
    public void robotInit() {
    
        m_rightMotor.setInverted(true);

    
        m_solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
    }

    @Override
    public void teleopPeriodic() {
    
        m_robotDrive.arcadeDrive(0.5, 0.0);

    
        m_solenoid.set(true);
    }
}
