package practica;

public class Car {
	private String brand;
	private int maxSpeed = 220;
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	public Car(String brand, int maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	public void inSpeed() {
		double speed  = 110/(this.maxSpeed /20);
		System.out.printf("скорость разгона до 100км/ч :%s\n", speed);
	}
	// мы сделалай гет для того что доступ была на гараж
	public String getBrand() {
		return brand;
	}

}
