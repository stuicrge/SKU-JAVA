package Day0724;

public class ECar {

	int distance=0;
	int battery=100;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public void charge() {
		battery-=10;
	}
	public void drive() {
		distance++;
	}
	public void dispDistance() {
		System.out.println("총주행거리 : "+ distance + "km");
	}
	
	public void dispBattery() {
		System.out.println("배터리충전량 : "+ battery + "%");
	}
	public void full_battery() {
		battery = 100;
	}
	
}
