

public class ItemPedido {

    private TipoItemPedido tipo;
    private String nome;

    public ItemPedido() {
    }

    public ItemPedido(TipoItemPedido tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

