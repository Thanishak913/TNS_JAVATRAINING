package org.tnsif.cap.c2tc.interfacedemo;

interface  SmartDevice
{
	void turnOn();
	void turnOff();
	void getStatus();
}
class SmartLight implements SmartDevice
{

	@Override
	public void turnOn() {
		System.out.println("Smart Light is ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Light is Off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light is in standby mode");	
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		SmartDevice smart=new SmartLight();
		smart.turnOn();
		smart.turnOff();
		smart.getStatus(); 
	}

}
