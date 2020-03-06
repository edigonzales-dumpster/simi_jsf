package ch.so.agi.simi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.so.agi.simi.domain.SingleLayer;

@Repository
public interface SingleLayerRepository extends CrudRepository<SingleLayer, Long> {

}
