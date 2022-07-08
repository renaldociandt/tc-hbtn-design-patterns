

import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public Pedido() {
    }

    public Pedido(HashSet<ItemPedido> itensDentroCaixa, HashSet<ItemPedido> itensForaCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
        this.itensForaCaixa = itensForaCaixa;
    }
    //    possui um HashSet<ItemPedido> privado chamado itensDentroCaixa que contém todos itens que serão entregues dentro da caixa.
//    possui um HashSet<ItemPedido> privado chamado itensForaCaixa que contém todos itens que serão entregues fora da caixa.
//    possui método adicionarItemDentroCaixa(ItemPedido item) que adiciona o nome do item que será entregue dentro da caixa.
//    possui método adicionarItemForaCaixa(ItemPedido item) que adiciona o nome do item que será entregue fora da caixa.
//    sobrescreva o método toString() para apresentar os itens contidos no pedido da seguinte forma:
//    Fora da caixa:
//            - BEBIDA COCA_COLA
//    Dentro da caixa:
//            - BRINDE CARRO
//   - LANCHE CHEESEBURGUER


    @Override
    public String toString() {

        String foraDaCaixa = "\tFora da Caixa:\n";
        for (ItemPedido item : itensForaCaixa) {
            foraDaCaixa += String.format("\t\t - %s %s\n " , item.getTipo(), item.getNome());

        }
        String dentroDacaixa = "\tDentro da Caixa:\n";
        for (ItemPedido item : itensDentroCaixa) {
            dentroDacaixa += String.format("\t\t - %s %s\n" , item.getTipo(), item.getNome());

        }

        return foraDaCaixa + dentroDacaixa;
    }


        public void adicionarItemDentroCaixa (ItemPedido item){
            itensDentroCaixa.add(item);


        }

        public void adicionarItemForaCaixa (ItemPedido item){
            itensForaCaixa.add(item);

        }

        public HashSet<ItemPedido> getItensDentroCaixa () {
            return itensDentroCaixa;
        }

        public void setItensDentroCaixa (HashSet < ItemPedido > itensDentroCaixa) {
            this.itensDentroCaixa = itensDentroCaixa;
        }

        public HashSet<ItemPedido> getItensForaCaixa () {
            return itensForaCaixa;
        }

        public void setItensForaCaixa (HashSet < ItemPedido > itensForaCaixa) {
            this.itensForaCaixa = itensForaCaixa;
        }



}
