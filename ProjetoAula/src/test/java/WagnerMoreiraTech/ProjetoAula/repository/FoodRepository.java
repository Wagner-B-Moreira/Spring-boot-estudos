package WagnerMoreiraTech.ProjetoAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import WagnerMoreiraTech.ProjetoAula.mode.Food;

@Repository // Opcional, mas deixa explícito que é repositório
public interface FoodRepository extends JpaRepository<Food, Long> {
    
    // Aqui você pode criar métodos customizados, ex:
    // List<Food> findByName(String name);
}
 