package by.red.lab5.repository;


import by.red.lab5.entities.Film;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FilmRepository extends CrudRepository <Film, Long> {

    List<Film> findAll(Sort sort);
}
