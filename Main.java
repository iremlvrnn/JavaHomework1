package homework;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Kategori", "T�m�");
		Category category2 = new Category(2, "Kategori", "Engin Demiro�");
		
		Category[] categories = {category1, category2};
		
		
		
		Course course1 = new Course();
		course1.setCourseName("Java&React Kamp�");
		
		Course course2 = new Course();
		course2.setCourseName("Programlamaya Giri� Kamp�");
	
		Course course3 = new Course();
		course3.setCourseName("C# + Angular Kamp�");
		
		Course[] courses = {course1, course2, course2};
		
		
		
		Student student = new Student();
		student.joinToCourse(course2);
		
		
		Student student1 = new Student();
		student.completeCourse(course3);
		
		
		
		
	
		
		
	}

}
