package frc.team555.robot;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SPI;

/**
 * The hardware class is in charge of storing all hardware
 * devices and configurations that the 2018 PowerUp robot
 * will use. The configurations are based on the google sheet
 * that can be found Here: <link>https://docs.google.com/a/montclairrobotics.org/spreadsheets/d/1iIJKKJEcQqPI1OJBf50IBtUTwjSuhOJbNW4E8-niwl4/edit?usp=sharing</link>
 * The sheet is in place so that both code and electronics are
 * on the same page from the start on what the device configurations
 * are.
 *
 *
 * Hardware device: Any physical device on the robot that is connected to the electronics
 * board or on roborio. This includes motors, cameras, servos, etc.
 *
 * Sensors and inputs should be defined in the control class and not in hardware
 * @see Control
 *
 * Structure
 *
 * - Device Port configuration: All port ID's for hardware devices.
 *      - Drive Train Motor ID's: motor ports to be used for the drive train
 * - Motor Configuration: Declaration of all motor controllers on the robot
 *      - Drive Train Motors: Declaration of the drive train motors
 *
 */
public class Hardware {
	private static class DeviceID {
		// Drive Train Motor IDS
	    public static final int motorDriveBR = 1;
	    public static final int motorDriveBL = 2;
	    public static final int motorDriveFR = 3;
	    public static final int motorDriveFL = 4;
	    
	    // Gyroscope ID
	    public static final SPI.Port navxPort = SPI.Port.kMXP;
	}
    
    // Drive Train Motors
    public static WPI_TalonSRX motorDriveBR;
    public static WPI_TalonSRX motorDriveBL;
    public static WPI_TalonSRX motorDriveFR;
    public static WPI_TalonSRX motorDriveFL;

    // Gyroscope
    public static AHRS navx;

    public static void init(){
        // Instantiate drive train motors using motor ID's
<<<<<<< HEAD
        motorDriveBR = new WPI_TalonSRX(DeviceID.motorDriveBR);
        motorDriveBL = new WPI_TalonSRX(DeviceID.motorDriveBL);
        motorDriveFR = new WPI_TalonSRX(DeviceID.motorDriveFR);
        motorDriveFL = new WPI_TalonSRX(DeviceID.motorDriveFL);
        
        navx = new AHRS(DeviceID.navxPort);
=======
        motorDriveBR = new WPI_TalonSRX(motorDriveBRID);
        motorDriveBR.setInverted(true);
        motorDriveBL = new WPI_TalonSRX(motorDriveBLID);
        motorDriveFR = new WPI_TalonSRX(motorDriveFRID);
        motorDriveFR.setInverted(true);
        motorDriveFL = new WPI_TalonSRX(motorDriveFLID);



        navx = new AHRS(navxPort);
>>>>>>> 2d9c55aca1a2010615632761bb1af310f3be3d40
    }
}
