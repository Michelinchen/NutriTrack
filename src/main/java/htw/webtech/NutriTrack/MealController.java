package htw.webtech.NutriTrack;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MealController {

    private final MealService service;

    public MealController(MealService service) {
        this.service = service;
    }

    @GetMapping("/meals")
    public List<MealEntry> getAllMeals(){
        return service.getAllMeals();
    }

    @PostMapping("/meals")
    public MealEntry createMeal(@RequestBody MealEntry meal){
        return service.save(meal);
    }

    @DeleteMapping("/meals/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMeal(@PathVariable Long id){
        service.delete(id);
    }
}
