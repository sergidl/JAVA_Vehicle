abstract class Vehicle {
	abstract void bikeLine();
	abstract void needITV();
	private String brand;
	private int wheels;
	
	public Vehicle(String brand, int wheels) {
		this.setBrand(brand);
		this.setWheels(wheels);
	}

	public Vehicle(){
		this(null, 0);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



}
