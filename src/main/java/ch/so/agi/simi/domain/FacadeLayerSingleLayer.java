package ch.so.agi.simi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FacadeLayerSingleLayer {
    private Long id;

    private FacadeLayer facadeLayer;    
    private SingleLayer singleLayer;
    
    private boolean visibility;
    private int sort;
    private int transparency;
    
    // Annotations nicht mischen, d.h. bei Variable und Methode.
    // see: https://stackoverflow.com/questions/6164123/org-hibernate-mappingexception-could-not-determine-type-for-java-util-set
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    public FacadeLayer getFacadeLayer() {
        return facadeLayer;
    }
    
    public void setFacadeLayer(FacadeLayer facadeLayer) {
        this.facadeLayer = facadeLayer;
    }
    
    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn
    public SingleLayer getSingleLayer() {
        return singleLayer;
    }
    
    public void setSingleLayer(SingleLayer singleLayer) {
        this.singleLayer = singleLayer;
    }
    
    public boolean isVisibility() {
        return visibility;
    }
    
    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }
    
    public int getSort() {
        return sort;
    }
    
    public void setSort(int sort) {
        this.sort = sort;
    }
    
    public int getTransparency() {
        return transparency;
    }
    
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
}
