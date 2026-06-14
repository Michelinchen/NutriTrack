package htw.webtech.NutriTrack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
