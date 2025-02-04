package streams.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repositorio<T> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    public void remover(T elemento) {
        lista.remove(elemento);
    }

    public List<T> getLista() {
        return lista;
    }

    public Optional<T> buscar(T elemento) {
        return lista.stream().filter(elemento::equals).findFirst();
    }
}
