package db_game.repositories;

import db_game.entities.Cash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashRepo extends JpaRepository <Cash, Long> {
}
