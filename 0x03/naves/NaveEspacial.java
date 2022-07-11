

public class NaveEspacial {

    private int saude;
    private int ataque;

    public NaveEspacial() {
    }

    public NaveEspacial(int saude, int ataque) {
        this.saude = saude;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
       return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
