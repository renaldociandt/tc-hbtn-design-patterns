import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> nomeBebidas = new ArrayList<>();
        nomeBebidas.add("leite");
        return nomeBebidas;

    }

    @Override
    public double obterPreco() {
        return 3.2;
    }
}
