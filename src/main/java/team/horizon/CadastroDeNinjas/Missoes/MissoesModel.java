package team.horizon.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.horizon.CadastroDeNinjas.Ninjas.NinjaModel;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany - Uma missão para muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;


}
