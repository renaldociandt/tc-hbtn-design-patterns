import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{


    @Override
    public List<String> obterIngredientes() {

        List<String> nomeBebidas = new ArrayList<>();
        nomeBebidas.add("cafe");
        return nomeBebidas;

    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}
