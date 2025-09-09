package WagnerMoreiraTech.ProjetoAula.service;

import java.util.List;
import org.springframework.stereotype.Service;
import WagnerMoreiraTech.ProjetoAula.repository.FoodRepository;

@Service // Marca a classe como Service gerenciado pelo Spring
public class FoodService { 

    private final FoodRepository foodRepository; // variável final para injeção de dependência

    // Construtor para injeção de dependência
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // 🔹 Listar todos os alimentos 
    public List<WagnerMoreiraTech.ProjetoAula.mode.Food> getAll() {
        return foodRepository.findAll(); // Corrigido: uso da variável correta
    }

    // 🔹 Salvar um alimento
    public Food save(Food food) {
        return foodRepository.save(food); // Corrigido: bloco limpo e funcional
    }

    // 🔹 Deletar um alimento pelo ID
    public void delete(Long id) {
        foodRepository.deleteById(id); // Corrigido: método direto e funcional
    } 

}
