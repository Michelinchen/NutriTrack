package htw.webtech.NutriTrack;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public void delete(Long id){ repository.deleteById(id); }

    public MealEntry update(Long id, MealEntry updated){
        MealEntry existing = repository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Meal not found"));
        existing.setName(updated.getName());
        existing.setMacro(updated.getMacro());
        existing.setFavorite(updated.isFavorite());
        return repository.save(existing);
    }
}
