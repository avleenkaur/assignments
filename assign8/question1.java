interface Animals {
    void speak();
    void eat();	
}
 class Dog implements Animals{
	public void speak() {
		System.out.println("Dog bark");
	}
	public void eat() {
		System.out.println("Dog eat bones");
	}
 }
 class cat implements Animals{
		public void speak() {
			System.out.println("Cat meow");
		}
		public void eat() {
			System.out.println("Cat veggies");
		}
	 }

class question1{
 public static void main(String[] args) {
      Animals d=new Dog();
      d.speak();
      d.eat();
      d=new cat();
System.out.println("\n---------------------\n");
      d.speak();
      d.eat();
}
}