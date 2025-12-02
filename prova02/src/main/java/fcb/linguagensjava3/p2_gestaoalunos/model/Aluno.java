package a8n.linguagensjava3.p2_gestaoalunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "A matrícula é obrigatória")
    private String matricula;

    // Relacionamento: Muitos alunos para um curso (@ManyToOne)
    @ManyToOne 
    @NotNull(message = "O curso é obrigatório")
    private Curso curso; // Referencia a entidade Curso

    // Construtor vazio (obrigatório para JPA)
    public Aluno() {}

    // --- Getters e Setters (Gerar no NetBeans) ---

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public Curso getCurso() {return curso;}
    public void setCurso(Curso curso) {this.curso = curso;}
}