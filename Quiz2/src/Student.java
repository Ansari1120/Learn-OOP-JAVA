
class Student{
    String name;
    int id,age;
    Student(){
        name = "ahmed";
        age=0;
        id=0;

    }
    Student(String n, int i, int a){
        name = n;
        id = i;
        age = a;
    }

    public static void main(String arg[]){
        Student s1 = new Student("dont know",531,00);
        Student s2 = new Student();
        System.out.println("here's first person data including name,id,age");
        System.out.println("\n"+s1.name+"\n"+s1.id+"\n"+s1.age);
        System.out.println("here's Second person data including name,id,age");
        System.out.println("\n"+s2.name+"\n"+s2.id+"\n"+s2.age);
    }
   
}