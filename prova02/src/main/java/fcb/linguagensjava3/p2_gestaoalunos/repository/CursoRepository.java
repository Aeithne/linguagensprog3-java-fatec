package a8n.linguagensjava3.p2_gestaoalunos.repository;

import a8n.linguagensjava3.p2_gestaoalunos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    // A anotação @Repository é opcional aqui, mas ajuda na clareza.
    // O Spring Boot cuida da implementação de todos os métodos (save, findAll, etc.).
}