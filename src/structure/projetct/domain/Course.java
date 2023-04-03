package structure.projetct.domain;

public class Course extends Content {
    
    private int workload;

    public Course() {

    }    

    @Override
    public double calculateXp() {
        return STANDARD_XP * workload;
    }


    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso [título = " + getTitle() + ", descrição = " + getDescription() + ", carga horária = " +
         workload + "]";
    }

    
    
}
