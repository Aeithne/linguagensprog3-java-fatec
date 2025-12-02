package a8n.linguagensjava3.p2_gestaoalunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity // Marca a classe como uma entidade JPA
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotNull(message = "A carga horária é obrigatória")
    private Integer cargaHoraria; // Usamos Integer para permitir validação @NotNull

    private String descricao;

    // Construtor vazio (obrigatório para JPA)
    public Curso() {}

    // --- Getters e Setters (Você deve gerar todos no NetBeans) ---

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Integer getCargaHoraria() {return cargaHoraria;}
    public void setCargaHoraria(Integer cargaHoraria) {this.cargaHoraria = cargaHoraria;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
}