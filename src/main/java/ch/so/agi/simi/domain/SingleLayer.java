package ch.so.agi.simi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SingleLayer extends SingleActor {
    private String owner;
    private boolean dataPublished;
    
    public SingleLayer() {}
    
    public SingleLayer(String identifier) {
        this.setIdentifier(identifier);
    }
    
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public boolean isDataPublished() {
        return dataPublished;
    }
    public void setDataPublished(boolean dataPublished) {
        this.dataPublished = dataPublished;
    }

    @Override
    public String toString() {
        return "SingleLayer [getOwner()=" + getOwner() + ", isDataPublished()=" + isDataPublished() + ", getId()="
                + getId() + ", getIdentifier()=" + getIdentifier() + ", getTitle()=" + getTitle() + ", getSynonymous()="
                + getSynonymous() + ", getDescription()=" + getDescription() + ", getKeywords()=" + getKeywords()
                + ", getRemarks()=" + getRemarks() + ", isInWMS()=" + isInWMS() + ", isInWGC()=" + isInWGC() + "]";
    }
}
