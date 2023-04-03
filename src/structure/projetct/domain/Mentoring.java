package structure.projetct.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    
    private LocalDate date;

    public Mentoring(){

    }

    @Override
    public double calculateXp() {
        return STANDARD_XP + 10d;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo = " + getTitle() + ", descrição = " + getDescription() + ", data = " + date
        + "]";
    }

    
    
}
