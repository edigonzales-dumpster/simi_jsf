package ch.so.agi.simi.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class FacadeLayer extends SingleActor {
    
    public FacadeLayer(String identifier) {
        this.setIdentifier(identifier);
    }
    
    @OneToMany(mappedBy = "singleLayer")
    private Set<FacadeLayerSingleLayer> facadeLayerSingleLayers = new HashSet<>();
    
    public Set<FacadeLayerSingleLayer> getFacadeLayerSingleLayers() {
        return facadeLayerSingleLayers;
    }

    public void setFacadeLayerSingleLayers(Set<FacadeLayerSingleLayer> facadeLayerSingleLayers) {
        this.facadeLayerSingleLayers = facadeLayerSingleLayers;
    }
}
