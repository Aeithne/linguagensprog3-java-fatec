package a8n.linguagensjava3.p2_gestaoalunos.controller;

import a8n.linguagensjava3.p2_gestaoalunos.model.Curso;
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
@RequestMapping("/cursos") 
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    // Rota: GET /cursos
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cursos", cursoRepository.findAll());
        return "curso/listagem"; 
    }

    // Rota: GET /cursos/novo 
    @GetMapping("/novo")
    public String formularioCadastro(Curso curso) {
        return "curso/cadastro"; 
    }

    // Rota: GET /cursos/editar/{id}
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        // 1. Busca o curso no banco de dados pelo ID. O .orElseThrow é uma boa prática
        Curso curso = cursoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("ID do curso inválido:" + id));

        // 2. Adiciona o objeto 'curso' (com dados) ao Model
        // O Thymeleaf irá preencher o formulário 'curso/cadastro' automaticamente
        model.addAttribute("curso", curso);
        
        return "curso/cadastro"; 
    }
    
    // Rota: POST /cursos/novo 
    @PostMapping("/novo")
    public String salvar(@Valid Curso curso, BindingResult result) {
        // ...
        if (result.hasErrors()) {
            // Se houver erro, retorna ao formulário, mantendo os dados e erros
            return "curso/cadastro"; 
        }
        
        // Se o objeto 'curso' tiver ID, o JPA faz um UPDATE. Se não tiver ID, faz um INSERT.
        cursoRepository.save(curso); 
        return "redirect:/cursos"; // Redireciona para a listagem
    }
    
    // Rota: GET /cursos/excluir/{id}
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id) {
        cursoRepository.deleteById(id);
        return "redirect:/cursos";
    }
}