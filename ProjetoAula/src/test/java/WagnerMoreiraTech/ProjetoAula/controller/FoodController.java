
import WagnerMoreiraTech.ProjetoAula.mode.Food;
import WagnerMoreiraTech.ProjetoAula.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }; 
     @PostMapping 
     
     public Food create (@RequestiBody Food fod) {return foodSerivce.save();}
 

}
 