package ch.so.agi.simi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@MappedSuperclass
public abstract class DataProduct {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @NotNull    
    private String identifier;
    private String title;
    private String synonymous;
    private String description;
    private String keywords;
    private String remarks;
    private boolean inWMS;
    private boolean inWGC;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSynonymous() {
        return synonymous;
    }
    public void setSynonymous(String synonymous) {
        this.synonymous = synonymous;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public boolean isInWMS() {
        return inWMS;
    }
    public void setInWMS(boolean inWMS) {
        this.inWMS = inWMS;
    }
    public boolean isInWGC() {
        return inWGC;
    }
    public void setInWGC(boolean inWGC) {
        this.inWGC = inWGC;
    }
}
