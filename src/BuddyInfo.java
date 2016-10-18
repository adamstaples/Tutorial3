import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;

public class BuddyInfo{
	private String name;
	private int age;
	private int phoneNumber;
	
	public BuddyInfo(){
		this.name = "";
		this.age = 0;
		this.phoneNumber = 0;
	}
	
	public BuddyInfo(String n, int age, int phoneNumber){
		this.name=n;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sayHi(){
		System.out.println("Sup");
		System.out.println("I like cheese");
	}
	
	public String toString(){
		return "Name: " + this.name + "/Age: " + this.age + "/Phone Number: " + this.phoneNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo me = new BuddyInfo("Bhavik", 20, 31313131);
		System.out.println("Hello " + me.getName());
		Menu m = new Menu();
	}
}
