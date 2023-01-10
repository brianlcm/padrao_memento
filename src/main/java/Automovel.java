import java.util.ArrayList;
import java.util.List;

public class Automovel {

    private AutomovelEstado estado;
    private List<AutomovelEstado> memento = new ArrayList<AutomovelEstado>();

    public AutomovelEstado getEstado() {
        return this.estado;
    }

    public void setEstado(AutomovelEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<AutomovelEstado> getEstados() {
        return this.memento;
    }
}
