import java.time.LocalTime;

public class Carro extends Vehiculo{
    private String tipo;

    public Carro() {

    }

    public Carro(String p, String m, String c, int valor, LocalTime t, int precio) {
        super(p, m, c, valor, t, precio);
        this.tipo = "Carro";
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + this.getPlaca() + '\'' +
                ", marca='" + this.getMarca() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", tipo='" + this.tipo + '\'' +
                ", valorComercial=" + this.getValorComercial() + '\'' +
                ", hora de ingreso=" + this.horaIngreso +
                '}';
    }
}
