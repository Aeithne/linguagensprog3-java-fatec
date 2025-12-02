package a8n.linguagensjava3.p2_gestaoalunos.repository;

import a8n.linguagensjava3.p2_gestaoalunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    //
}