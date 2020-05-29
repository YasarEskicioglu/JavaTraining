package hw_7;

public class Rocket extends Q16 {
 
	public int weight = 2;
	public int height = 4;
	public void printDetails() {
		System.out.print(super.getWeight()+","+super.height);
	}