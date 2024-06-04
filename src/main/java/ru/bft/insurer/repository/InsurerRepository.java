package ru.bft.insurer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bft.insurer.entity.Insurer;

import java.util.List;

@Repository
public interface InsurerRepository extends CrudRepository<Insurer, Long> {
    List<Insurer> getByRegNum(String regNum);
}
