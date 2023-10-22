package entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private Involce involce;
	
	public CarRental() {
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Involce getInvolce() {
		return involce;
	}

	public void setInvolce(Involce involce) {
		this.involce = involce;
	}

}
