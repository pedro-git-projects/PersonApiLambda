package lambda.abstracao.personapi.repository;

import lambda.abstracao.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
