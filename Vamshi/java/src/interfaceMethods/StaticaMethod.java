package interfaceMethods;

 interface StaticaMethod {
	static void show() {
		
		System.out.println("im printing");
	}

}
class MainMethod{
public static void main(String[] args) {
	StaticaMethod.show();
}
}