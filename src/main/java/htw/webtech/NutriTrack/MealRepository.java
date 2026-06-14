package htw.webtech.NutriTrack;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<MealEntry, Long> {}