public class AutomovelDisponivel implements AutomovelEstado {

    private AutomovelDisponivel() {};
    private static AutomovelDisponivel instance = new AutomovelDisponivel();
    public static AutomovelDisponivel getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Disponível";
    }
}
