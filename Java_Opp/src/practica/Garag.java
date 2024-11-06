package practica;

public class Garag {
	private Car car1;
	private Car car2;
	
	public Garag() {
		// сейчась здесь пустой поэтому мы создаеом сеттер и геттер
	}
	
	public void setCar1(Car car1) {
		this.car1 = car1;
	}
	
	public void setCar2(Car car2) {
		this.car2 = car2;
	}
	
	public void getInn() {
		getIss(car1);
		getIss(car2);
		
	}
	
	public void getIss(Car car) {
		System.out.println(getBrand());
		car.inSpeed();
	}

	
	

}
