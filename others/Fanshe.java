package others;
public class Fanshe {
	public static void main(String[] args){
		// 通过object-->getClass
		Student stu1 = new Student();
		Class stuClass = stu1.getClass();
		System.out.print(stuClass.getName());
		// 类名.Class
		Class stuClass2 = Student.class;
		System.out.print(stuClass2.getName());
		
		
	}
}
