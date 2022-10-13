
public class QuestionThree {
public int count;
public void init() {
	count =1;
}
public int increment() {
	count += 1;
	return count;
}
}
class Q3Main{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		QuestionThree q3 = new QuestionThree();
		q3.init();
		q3.count = q3.increment() + q3.increment();
		System.out.println(q3.increment());
}
}