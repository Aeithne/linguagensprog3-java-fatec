package a8n.linguagensjava3.p2_gestaoalunos.controller;

import a8n.linguagensjava3.p2_gestaoalunos.model.Aluno;
import a8n.linguagensjava3.p2_gestaoalunos.repository.AlunoRepository;
import a8n.linguagensjava3.p2_gestaoalunos.repository.CursoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository; 

    // Método auxiliar para carregar dados comuns (cursos)
    private void adicionarCursosAoModel(Model model) {
        model.addAttribute("cursos", cursoRepository.findAll());
    }

    // Rota: GET /alunos/novo 
    @GetMapping("/novo")
    public String formularioCadastro(Aluno aluno, Model model) {
        adicionarCursosAoModel(model); // Carrega a lista de cursos para o dropdown
        return "aluno/cadastro"; 
    }
    
    // Rota: GET /alunos/editar/{id}
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        // 1. Busca o aluno no banco de dados pelo ID
        Aluno aluno = alunoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("ID do aluno inválido:" + id));

        // 2. Adiciona o objeto 'aluno' (com dados) ao Model
        model.addAttribute("aluno", aluno);

        // 3. Recarrega a lista de cursos para o dropdown
        adicionarCursosAoModel(model);
        
        return "aluno/cadastro"; 
    }


    // Rota: POST /alunos/novo 
    @PostMapping("/novo")
    public String salvar(@Valid Aluno aluno, BindingResult result, Model model) {
        if (result.hasErrors()) {
            adicionarCursosAoModel(model); 
            return "aluno/cadastro"; 
        }
        alunoRepository.save(aluno);
        return "redirect:/alunos"; 
    }

    // Rota: GET /alunos (Listagem)
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("alunos", alunoRepository.findAll());
        return "aluno/listagem";
    }
    
    // Rota: GET /alunos/excluir/{id}
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id) {
        alunoRepository.deleteById(id);
        return "redirect:/alunos"; 
    }
}