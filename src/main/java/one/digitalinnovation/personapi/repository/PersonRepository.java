package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
//? essa clase/interface gerencia o banco de dados
//? para isso extend o JPA
//? person é o tipo de dados que quero gerenciar
//? e long o tipo de dado do ID
public interface PersonRepository extends JpaRepository<Person, Long> {
}
