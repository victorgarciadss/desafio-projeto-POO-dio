package structure.projetct.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    
    private String name;
    private String description;
    private final LocalDate currentDate = LocalDate.now();
    private final LocalDate finalDate = currentDate.plusDays(45);

    private Set<Developer> subscribedDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public Bootcamp(){

    }

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Developer> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void setSubscribedDevs(Set<Developer> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Bootcamp bootcamp = (Bootcamp) obj;

        return
            Objects.equals(name, bootcamp.name) &&
            Objects.equals(description, bootcamp.description) &&
            Objects.equals(currentDate, bootcamp.currentDate) &&
            Objects.equals(finalDate, bootcamp.finalDate) &&
            Objects.equals(subscribedDevs, bootcamp.subscribedDevs) &&
            Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, description, currentDate, finalDate, subscribedDevs, contents);
    }
}
