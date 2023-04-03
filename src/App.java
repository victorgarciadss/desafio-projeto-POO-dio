import java.time.LocalDate;

import structure.projetct.domain.Course;
import structure.projetct.domain.Mentoring;

public class App {
    public static void main(String[] args) throws Exception {
        
        Course course = new Course();
        course.setTitle("Curso Java");
        course.setDescription("Descrição do curso Java");
        course.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Curso JavaScript");
        course2.setDescription("Descrição do curso JavaScript");
        course2.setWorkload(1);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria de java");
        mentoring.setDescription("descrição da mentoria de java");
        mentoring.setDate(LocalDate.now());

        System.out.println(course);
        System.out.println(course2);

        System.out.println(mentoring);
    }
}
