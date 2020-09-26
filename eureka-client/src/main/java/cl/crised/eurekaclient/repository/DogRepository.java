package cl.crised.eurekaclient.repository;

import cl.crised.eurekaclient.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
