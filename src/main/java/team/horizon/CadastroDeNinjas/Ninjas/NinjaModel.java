package team.horizon.CadastroDeNinjas.Ninjas;

//BIBLIOTECAS
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.horizon.CadastroDeNinjas.Missoes.MissoesModel;
import java.util.*;

//JPA == Java Persistence API

// ENTITY == transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key = Chave Estrangeira
    private MissoesModel missoes;


}
