package ch.so.agi.simi.jsf;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import ch.so.agi.simi.domain.SingleLayer;
import ch.so.agi.simi.repository.SingleLayerRepository;

@Named
@ViewScoped
public class SingleLayerBacking implements Serializable {
    
    private List<SingleLayer> singleLayers;
    
    private SingleLayer singleLayer = new SingleLayer();
    
    @Autowired
    private SingleLayerRepository singleLayerRepository;
    
    @PostConstruct
    public void init() {
        singleLayers = singleLayerRepository.findAll();
    }
    
    public void delete(SingleLayer singleLayer) {
        System.out.println("delete: " + singleLayer.getIdentifier());
    }

    // Setters and Getters
    public List<SingleLayer> getSingleLayers() {
        return singleLayers;
    }

    public void setSingleLayers(List<SingleLayer> singleLayers) {
        this.singleLayers = singleLayers;
    }
    
    
    
}
