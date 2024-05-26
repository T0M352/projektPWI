package tomasz.morgas.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import tomasz.morgas.backend.entity.Goal;

public interface GoalRepository extends JpaRepository<Goal, Integer> {
}
