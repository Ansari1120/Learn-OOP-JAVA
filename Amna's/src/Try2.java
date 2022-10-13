import Try1.Try2;

class Try2 extends Try1 {
	public void world() {
		System.out.println("world");	
	}
public void main(String[]args) {
	Try1 obj = new Try1();
	Try2 obj2 = new Try2();
	obj.hello();
	obj2.world();
}	
}
}