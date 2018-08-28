abstract class A {
	public abstract void start();
	public void stop(){
		System.out.println("Stopping Vehicle in abstract class");
	}}
class B extends A{
	public void start() { 
		System.out.println("Starting Two Wheeler");
}}
class C extends A{
	public void start() {
		System.out.println("Starting Four Wheeler");
	}}
public class Question4 {
	public static void main(String[] args) {
		B a = new B();
		C b = new C();
		a.start();
		a.stop();
		b.start();
		b.stop();
	}
}