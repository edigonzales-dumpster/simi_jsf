package ch.so.agi.simi;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ch.so.agi.simi.domain.SingleLayer;
import ch.so.agi.simi.repository.SingleLayerRepository;

@Component
public class MyRunner implements CommandLineRunner {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Autowired
    SingleLayerRepository singleLayerRepository;
    
    @Override
    public void run(String... args) throws Exception {
        singleLayerRepository.deleteAll();
        
        //SingleLayer singleLayer = new SingleLayer();
        //singleLayer.setIdentifier("fubar");
        //singleLayer.setInWGC(true);
        //singleLayer.setInWMS(true);
        //singleLayer.setDataPublished(true);
        singleLayerRepository.save(new SingleLayer("ch.so.agi.av.fixpunkte"));
        
        singleLayerRepository.findAll().forEach((singleLayer) -> {
            logger.info("{}", singleLayer);
        });
 
        
    }

}
