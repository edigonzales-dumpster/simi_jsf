package ch.so.agi.simi;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ch.so.agi.simi.domain.FacadeLayer;
import ch.so.agi.simi.domain.FacadeLayerSingleLayer;
import ch.so.agi.simi.domain.SingleLayer;
import ch.so.agi.simi.repository.FacadeLayerRepository;
import ch.so.agi.simi.repository.FacadeLayerSingleLayerRepository;
import ch.so.agi.simi.repository.SingleLayerRepository;

@Component
public class MyRunner implements CommandLineRunner {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Autowired
    SingleLayerRepository singleLayerRepository;
    
    @Autowired
    FacadeLayerRepository facadeLayerRepository;
    
    @Autowired
    FacadeLayerSingleLayerRepository facadeLayerSingleLayerRepository;


    @Override
    public void run(String... args) throws Exception {
        singleLayerRepository.deleteAll();
        
        SingleLayer sl1 = new SingleLayer("ch.so.agi.av.fixpunkte");
        SingleLayer sl2 = new SingleLayer("ch.so.agi.av.liegenschaften");
//        singleLayer.setInWGC(true);
//        singleLayer.setInWMS(true);
//        singleLayer.setDataPublished(true);
        
        singleLayerRepository.save(sl1);
        singleLayerRepository.save(sl2);
        
        // -------

        FacadeLayer fl1 = new FacadeLayer("ch.so.agi.grundbuchplan_sw");
        
        facadeLayerRepository.save(fl1);
        
        // -------

        FacadeLayerSingleLayer flsl1 = new FacadeLayerSingleLayer();
        flsl1.setFacadeLayer(fl1);
        flsl1.setSingleLayer(sl1);
        flsl1.setSort(1);
        
        FacadeLayerSingleLayer flsl2 = new FacadeLayerSingleLayer();
        flsl2.setFacadeLayer(fl1);
        flsl2.setSingleLayer(sl2);
        flsl2.setSort(2);

        facadeLayerSingleLayerRepository.save(flsl1);
        facadeLayerSingleLayerRepository.save(flsl2);
        
        // -------
        
//        singleLayerRepository.findAll().forEach((singleLayer) -> {
//            logger.info("{}", singleLayer);
//        });
        
    }

}
