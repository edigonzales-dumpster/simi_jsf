package ch.so.agi.simi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.so.agi.simi.domain.SingleLayer;

@Repository
public interface SingleLayerRepository extends JpaRepository<SingleLayer, Long> {

}
