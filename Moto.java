import java.time.LocalTime;

public class Moto extends Vehiculo{
    private String tipo;
    public Moto() {

    }

    public Moto(String placa, String marca, String color, int valor, LocalTime t, int precio) {
        super(placa, marca, color, valor, t, precio);
        this.tipo = "Moto";
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + this.getPlaca() + '\'' +
                ", marca='" + this.getMarca() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", tipo='" + this.tipo + '\'' +
                ", valorComercial=" + this.getValorComercial() + '\'' +
                ", hora de ingreso=" + this.horaIngreso +
                '}';
    }
}
