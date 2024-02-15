package by.red.lab5.repository;

import java.util.List;

import by.red.lab5.entities.Actor;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends CrudRepository <Actor, Long> {

    List<Actor> findAll(Sort sort);
}
