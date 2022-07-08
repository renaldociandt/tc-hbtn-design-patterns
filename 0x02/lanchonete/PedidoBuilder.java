package lanchonete;

public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido = new Pedido();

    @Override
    void setLanche(TipoLanche tipo) {
        ItemPedido lanche = new ItemPedido(TipoItemPedido.LANCHE, tipo.name());
        pedido.adicionarItemDentroCaixa(lanche);
    }

    @Override
    void setBatata(TamanhoBatata tamanho){
        ItemPedido batata = new ItemPedido(TipoItemPedido.BATATA, tamanho.name());
        pedido.adicionarItemDentroCaixa(batata);

    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        ItemPedido brinde = new ItemPedido(TipoItemPedido.BRINDE, tipo.name());
        pedido.adicionarItemDentroCaixa(brinde);

    }

    @Override
    void setBebida(TipoBebida tipo) {
        ItemPedido bebida = new ItemPedido(TipoItemPedido.BEBIDA, tipo.name());
        pedido.adicionarItemForaCaixa(bebida);

    }

    public Pedido build(){
        return pedido;
    }

//    ItemPedido bebida = new ItemPedido(TipoItemPedido.BEBIDA, tipoBebida.name());

//    subclasse de PedidoAbstractBuilder
//    possui atributo privado pedido do tipo Pedido que será retornado pelo método build.
//    implemente os métodos setLanche, etc que adiciona os itens ao pedido dentro ou fora da caixa conforme o enunciado.
//    crie o método build que retorne a instância de Pedido


}
