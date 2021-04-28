package homework;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Kategori", "Tümü");
		Category category2 = new Category(2, "Kategori", "Engin Demiroð");
		
		Category[] categories = {category1, category2};
		
		
		
		Course course1 = new Course();
		course1.setCourseName("Java&React Kampý");
		
		Course course2 = new Course();
		course2.setCourseName("Programlamaya Giriþ Kampý");
	
		Course course3 = new Course();
		course3.setCourseName("C# + Angular Kampý");
		
		Course[] courses = {course1, course2, course2};
		
		
		
		Student student = new Student();
		student.joinToCourse(course2);
		
		
		Student student1 = new Student();
		student.completeCourse(course3);
		
		
		
		
	
		
		
	}

}
