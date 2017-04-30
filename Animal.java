import java.util.Scanner;
import java.util.*;

public class Animal {
	public static final double FAVNUMBER=1.6180;
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private int age;
	private int count;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberofAnimals = 0;
	
	static Scanner userinput = new Scanner(System.in);
	static Scanner i = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar() {
		int min=32; int max=127;
		int ran_num= min + (int)(Math.random() *((max-min) +1));
		System.out.println("Favorite character's ASCII int value is:" + ran_num);
		//char charc=char (ran_num);
		this.favoriteChar = (char) ran_num;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	public void setCount (int count) {
		//super();
		this.count = count;
	}

	public int getCount() {
		//uper();
		//this.count = count;
		return this.count;
	}

	/*public int geti()
	{
		return i;
	}*/
	
	
	
	

	public Animal(){
		// super();
		numberofAnimals++;
		int SumOfNumbers=5+1;
		System.out.println("5+1 = " + SumOfNumbers);
		System.out.println("Enter the name of the Animal: ");
		if(userinput.hasNextLine())
		{
			this.setName(userinput.nextLine());
			//String output=userinput.nextLine();
			System.out.println("Name of Animal is set to "+ this.getName());
		}
		System.out.println("Setting the weight, height,age, isHasOwner, and favorite character");
		int weight=100;
		this.setWeight(weight);
		int height=7;
		this.setHeight(height);
		int age=4;
		this.setAge(age);
		boolean owner= true;
		this.setHasOwner(owner);
		char favChar='a';
		this.setFavoriteChar();
		
		System.out.println("Getting the weight, height,age, isHasOwner, and favorite character");
		int get_w=this.getWeight();
		float get_h=this.getHeight();
		int get_a=this.getAge();
		boolean get_ow=this.isHasOwner();
		char get_fav_ch=this.getFavoriteChar();
		System.out.println("Weight="+get_w);
		System.out.println("Height="+get_h);
		System.out.println("Age="+get_a);
		System.out.println("Has Owner="+ get_ow);
		System.out.println("Favorite Character is: "+ get_fav_ch);
		
		System.out.println("Enter a value:");
		if(i.hasNextLine())
		{
			setCount(i.nextInt());
		}
	
		int new_c = getCount();
		for (int k =0; k <= new_c; k++)
		{
			System.out.println("*");
		}
	}
	public String makeSound()
	{
		return "Grr";
	}
	
	public static void speakanimal(Animal randanimal)
	{
		System.out.println("Animal Says" + randanimal.makeSound());
	}

	public static void main(String[] args)
	{
		Animal theAnimal = new Animal();
		
	}
}
