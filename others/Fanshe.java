package others;
public class Fanshe {
	public static void main(String[] args){
		// ͨ��object-->getClass
		Student stu1 = new Student();
		Class stuClass = stu1.getClass();
		System.out.print(stuClass.getName());
		// ����.Class
		Class stuClass2 = Student.class;
		System.out.print(stuClass2.getName());
		
		
	}
}
