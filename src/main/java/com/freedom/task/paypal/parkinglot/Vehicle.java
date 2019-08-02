package com.freedom.task.paypal.parkinglot;

import java.util.ArrayList;

public abstract class Vehicle {
	
	protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
	
	protected String licenseplate;
	
	protected int spotsneeded;
	
	protected VehicleSize size;

	public int getSpotsneeded() {
		return spotsneeded;
	}

	public void setSpotsneeded(int spotsneeded) {
		this.spotsneeded = spotsneeded;
	}

	public VehicleSize getSize() {
		return size;
	}

	public void setSize(VehicleSize size) {
		this.size = size;
	}
	
	public abstract boolean canFitinSpots(ParkingSpot spot);
	

}
