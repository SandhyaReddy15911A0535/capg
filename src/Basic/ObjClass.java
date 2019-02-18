package Basic;

public class ObjClass {
	int a;
	int b;

	ObjClass() {
		this(20, 300);
		System.out.println("default one");
//new ObjClass();
	}

	public ObjClass(int a, int b) {
		

		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
		//new ObjClass();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjClass o = new ObjClass(20, 30);
		new ObjClass();
	}
}

