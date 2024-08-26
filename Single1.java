package inheritance;


	class A{
		void Bro() {
			System.out.println("ena bro ithu");
		}
	}
		class B extends A{
			void hari() {
				System.out.println("va da");
			}
		}
public class Single1 {	
  public static void main(String[]args) {
	B obj = new B();
	obj.Bro();
	obj.hari();
}
}

