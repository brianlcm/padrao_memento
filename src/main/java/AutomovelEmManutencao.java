public class AutomovelEmManutencao implements AutomovelEstado {

    private AutomovelEmManutencao() {};
    private static AutomovelEmManutencao instance = new AutomovelEmManutencao();
    public static AutomovelEmManutencao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em manutenção";
    }
}
