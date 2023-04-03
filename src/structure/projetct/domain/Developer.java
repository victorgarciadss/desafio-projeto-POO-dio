package structure.projetct.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Developer {
    
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();


    public void singUpBootcamp(Bootcamp bootcamp){

    }

    public void toProgress(){

    }

    public void calculateXp(){

    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, finishedContents);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        
        Developer developer = (Developer) obj;

        return 
            Objects.equals(name, developer.name) &&
            Objects.equals(subscribedContent, developer.subscribedContent) &&
            Objects.equals(finishedContents, developer.finishedContents);
    }

    

    
}
