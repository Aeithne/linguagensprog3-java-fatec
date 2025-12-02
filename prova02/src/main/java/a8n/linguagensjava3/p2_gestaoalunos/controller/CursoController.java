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
@RequestMapping("/cursos") // Define a rota base para todas as ações desta classe
public class CursoController {

    @Autowired // Injeta a interface Repository para acesso ao banco de dados
    private CursoRepository cursoRepository;

    // Rota: GET /cursos
    // Função: Exibe a lista de todos os cursos
    @GetMapping
    public String listar(Model model) {
        // Envia todos os cursos encontrados no banco para a View (listagem.html)
        model.addAttribute("cursos", cursoRepository.findAll());
        return "curso/listagem"; 
    }

    // Rota: GET /cursos/novo
    // Função: Exibe o formulário de cadastro (View)
    @GetMapping("/novo")
    public String formularioCadastro(Curso curso) {
        // 'Curso curso' cria um objeto vazio para ser preenchido pelo formulário (Thymeleaf)
        return "curso/cadastro"; 
    }

    // Rota: POST /cursos/novo
    // Função: Processa os dados do formulário e salva no banco
    @PostMapping("/novo")
    public String salvar(@Valid Curso curso, BindingResult result) {
        // @Valid: Ativa as validações definidas na entidade Curso (ex: @NotBlank)
        // BindingResult: Contém os resultados das validações
        if (result.hasErrors()) {
            return "curso/cadastro"; // Se houver erro, retorna ao formulário, mostrando as mensagens de erro
        }
        
        cursoRepository.save(curso);
        return "redirect:/cursos"; // Salva o curso e redireciona para a rota de listagem (GET /cursos)
    }
    
    // Função: Exclui o curso pelo ID
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id) {
        // Usa o método deleteById do Spring Data JPA
        cursoRepository.deleteById(id);
        return "redirect:/cursos"; // Redireciona para a listagem atualizada
    }
}