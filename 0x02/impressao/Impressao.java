package impressao;

public class Impressao {

    private int paginasTotais, paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso, double valorPretoBrancoFrenteVerso, double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal() {

        if (ehFrenteVerso) {
            return (paginasColoridas * valorColoridasFrenteVerso) + ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso);
        }
        return (paginasColoridas * valorColoridasFrenteApenas) + ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas);

    }

    @Override
    public String toString() {

       return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
               paginasTotais, paginasColoridas, (paginasTotais- paginasColoridas), ehFrenteVerso ? "frente e verso" : "frente apenas", calcularTotal());

    }


    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }
}
