public class AutomovelAlugado implements AutomovelEstado {

    private AutomovelAlugado() {};
    private static AutomovelAlugado instance = new AutomovelAlugado();
    public static AutomovelAlugado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Alugado";
    }
}
