package db_game.repositories;

import db_game.entities.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepo extends JpaRepository <Day, Long> {
}
