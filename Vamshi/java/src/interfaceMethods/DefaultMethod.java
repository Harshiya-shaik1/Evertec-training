package interfaceMethods;

interface DefaultMethod {
	void add();
	default void show() {
		System.out.println("using default keyword");
	}

}
