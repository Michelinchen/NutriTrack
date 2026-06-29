package htw.webtech.NutriTrack;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private final MealRepository repository;

    public MealService(MealRepository mealRepository) {
        this.repository = mealRepository;
    }

    public List<MealEntry> getAllMeals(){
        return repository.findAll();
    }

    public MealEntry save(MealEntry mealEntry){
        return repository.save(mealEntry);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
