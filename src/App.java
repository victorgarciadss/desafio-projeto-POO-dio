import java.time.LocalDate;

import structure.projetct.domain.Bootcamp;
import structure.projetct.domain.Course;
import structure.projetct.domain.Developer;
import structure.projetct.domain.Mentoring;

public class App {
    public static void main(String[] args) throws Exception {
        
        Course course = new Course("Curso Java", "Descrição do curso Java", 8);
        

        Course course2 = new Course(
            "Curso JavaScript", "Descrição do curso JavaScript", 2
        );
        

        Mentoring mentoring = new Mentoring(
            "Mentoria de java", "descrição da mentoria de java", LocalDate.now()
        );
        

        Bootcamp bootcamp = new Bootcamp(
            "Bootcamp Java Developer", "Descrição do bootcamp Java"
        );
        
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);
        
        Developer Victor = new Developer();
        Victor.setName("Victor");
        Victor.signUpBootcamp(bootcamp);
        System.out.println("Conteudos inscritos - Victor: " + Victor.getSubscribedContent());
        Victor.toProgress();
        Victor.toProgress();
        Victor.toProgress();
        System.out.println("-");
        System.out.println("Conteudos inscritos - Victor: " + Victor.getSubscribedContent());
        System.out.println("Conteudos concluídos - Victor: " + Victor.getFinishedContents());
        System.out.println("XP: " + Victor.calculateXp());

        System.out.println("-----------");

        Developer Carlos = new Developer();
        Carlos.setName("Carlos");
        Carlos.signUpBootcamp(bootcamp);
        System.out.println("Conteudos inscritos - Carlos: " + Carlos.getSubscribedContent());
        Carlos.toProgress();
        System.out.println("-");
        System.out.println("Conteudos inscritos - Carlos: " + Carlos.getSubscribedContent());
        System.out.println("Conteudos concluídos - Carlos: " + Carlos.getFinishedContents());
        System.out.println("XP: " + Carlos.calculateXp());
    }
}
