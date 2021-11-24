
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class Vehiculo {
    private String placa;
    private String marca;
    private String color;
    private int valorComercial;
    public static Vehiculo vehiculos[][];
    public static int cantidad = 0;
    public static int tamaño;
    LocalTime horaIngreso;
    private int precio;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(int valorComercial) {
        this.valorComercial = valorComercial;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Vehiculo.cantidad = cantidad;
    }

    public Vehiculo() {

    }

    public Vehiculo(String p, String m, String c) {
        this.placa = p;
        this.marca = m;
        this.color = c;
    }

    public Vehiculo(String p, String m, String c, int v, LocalTime t, int precio) {
        this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial = v;
        cantidad = cantidad + 1;
        this.horaIngreso = t;
        this.precio = precio;
    }

    public static String toString(Vehiculo vehiculo) {
        return "Vehiculo{" + "placa=" + vehiculo.placa + ", marca=" + vehiculo.marca + ", color=" + vehiculo.color + ", " +
                "valorComercial=" + vehiculo.valorComercial + '}';
    }

    public static String VehiculosCompletos() {
        String res = "";
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos[i].length; j++) {
                if (vehiculos[i][j] != null) {
                    res = res + vehiculos[i][j].toString() + "\n";
                }
            }
        }
        return res;
    }

    public static int VhCantidad(Vehiculo vehiculos[][]) {
        int c = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos[i].length; j++) {
                if (vehiculos[i][j] != null) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void desactivarSensor(int piso, int est) {
        Sensor.sensores[piso][est].setEstado(0);
        Vehiculo.vehiculos[piso][est] = null;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static String calcularPrecio(int piso, int est, int t) {
        return "El valor total a pagar es: " + Vehiculo.vehiculos[piso][est].getPrecio() * t;
    }
    public String toString() {
        return "Vehiculo{" + "placa=" + this.placa + ", marca=" + this.marca + ", color=" + this.color + ", valorComercial=" + this.valorComercial + '}';
    }
    public static void exportarVehiculos() throws IOException {
        File archivo = new File("Vehiculos.txt");
        FileWriter escribir = new FileWriter(archivo);
        escribir.write("Vehículos almacenados: " + "\n" + Vehiculo.VehiculosCompletos());
        escribir.write("\r\n");
        escribir.close();
    }
}
