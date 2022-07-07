import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> nomeBebidas = super.obterIngredientes();
        nomeBebidas.add("acucar");
        return nomeBebidas;

    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
