package ch.so.agi.simi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import ch.so.agi.simi.domain.DataProduct;

@NoRepositoryBean
public interface DataProductRepository<T extends DataProduct> extends CrudRepository<T, Long> {

}
