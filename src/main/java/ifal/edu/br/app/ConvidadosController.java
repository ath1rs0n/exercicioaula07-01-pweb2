package ifal.edu.br.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
    @Autowired
    private Convidados convidados;

    @RequestMapping
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListaConvidados");
        mv.addObject("convidados", convidados.todos());
        mv.addObject(new Convidado());
        return mv;

    }

    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Convidado convidado) {
        this.convidados.adicionar(convidado);
        return "redirect:/convidados";
    }

    @RequestMapping("/deleta")
    public String delete(@RequestParam(defaultValue = "0") int id) {        
        convidados.delete(new Convidado(id));
        return "redirect:/convidados";
    }
}