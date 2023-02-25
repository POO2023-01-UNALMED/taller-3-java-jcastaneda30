package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
	this.tv=tv;
	}
	public TV getTV() {
	return tv;
	}
	public void setTV(TV tv) {
	this.tv=tv;
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int can) {
		tv.setCanal(can);
	}
}