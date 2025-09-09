// Define o pacote onde essa classe está localizada
package WagnerMoreiraTech.ProjetoAula.mode;

// Importa a classe LocalDate para representar datas (como validade da comida)
import java.time.LocalDate;

// Importa as anotações do Jakarta Persistence para mapear a entidade no banco
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Indica que essa classe é uma entidade JPA, ou seja, será mapeada para uma tabela no banco
@Entity

// Define o nome da tabela no banco de dados como "food_table"
@Table(name = "food_table")
public class Food {

    // Define o campo 'id' como chave primária da tabela
    @Id

    // Indica que o valor do 'id' será gerado automaticamente pelo banco (auto-incremento)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome da comida
    private String name;

    // Data de validade da comida
    private LocalDate ValidadeDaComida;

    // Quantidade disponível da comida
    private Integer quantity;

    // 🔧 Construtor vazio obrigatório para JPA funcionar corretamente
    public Food() {
    }

    // 🔍 Métodos Getters e Setters permitem acessar e modificar os atributos da classe

    // Retorna o ID da comida
    public Long getId() {
        return id;
    }

    // Define o ID da comida
    public void setId(Long id) {
        this.id = id;
    }

    // Retorna o nome da comida
    public String getName() {
        return name;
    }

    // Define o nome da comida
    public void setName(String name) {
        this.name = name;
    }

    // Retorna a data de validade da comida
    public LocalDate getValidadeDaComida() {
        return ValidadeDaComida;
    }

    // Define a data de validade da comida
    public void setValidadeDaComida(LocalDate validadeDaComida) {
        this.ValidadeDaComida = validadeDaComida;
    }

    // Retorna a quantidade disponível da comida
    public Integer getQuantity() {
        return quantity;
    }

    // Define a quantidade disponível da comida
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
