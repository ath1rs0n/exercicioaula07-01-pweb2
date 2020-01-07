package ifal.edu.br.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Convidados {
    private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();
    static {
        LISTA_CONVIDADOS.add(new Convidado(1, "Athirson", 2));
        LISTA_CONVIDADOS.add(new Convidado(2, "Madson", 3));
        LISTA_CONVIDADOS.add(new Convidado(3,"Ricardo", 1));
    }

    public List<Convidado> todos() {
        return Convidados.LISTA_CONVIDADOS;
    }

    
    public void adicionar(Convidado convidado) {
        Convidados.LISTA_CONVIDADOS.add(convidado);
    }

    public void delete(Convidado convidado) {
        

        Convidados.LISTA_CONVIDADOS.remove(convidado);

        
	}
}