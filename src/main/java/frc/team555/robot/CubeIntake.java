package frc.team555.robot;

import org.montclairrobotics.sprocket.loop.Priority;
import org.montclairrobotics.sprocket.loop.Updatable;
import org.montclairrobotics.sprocket.loop.Updater;
import org.montclairrobotics.sprocket.motors.Motor;
import org.montclairrobotics.sprocket.utils.Input;

public class CubeIntake implements Updatable {
	public final Motor left;
	public final Motor right;
	
	public final Input<Double> power;
	
	public CubeIntake() {
		this.left = new Motor(Hardware.motorIntakeL);
		this.right = new Motor(Hardware.motorIntakeR);
		
		this.power = new Input<Double>() {
			@Override
			public Double get() {
				return -Control.auxStick.getY();
			}
		};
		
		Updater.add(this, Priority.CALC);
	}

	@Override
	public void update() {
		left.set(power.get());
		right.set(power.get());
	}
}