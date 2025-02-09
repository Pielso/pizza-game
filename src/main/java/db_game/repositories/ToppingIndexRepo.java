package db_game.repositories;

import db_game.entities.ToppingIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingIndexRepo extends JpaRepository <ToppingIndex, Long> {

    void deleteByPizzaId(String pizzaId);
}
