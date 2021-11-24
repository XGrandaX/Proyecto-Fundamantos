import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        boolean todo = true;
        Scanner sc = new Scanner(System.in);
        String placa;
        String marca;
        String color;
        String color1;
        int valor;
        int ps2;
        int es2;
        int ps1;
        int es1;
        int ps;
        int es;
        String tipo;
        int precioCarro;
        int precioMoto;
        int tiempoOcupado;

        System.out.println("Ingrese la cantidad de pisos");
        int pisos = sc.nextInt();

        System.out.println("Ingrese la cantidad de espacios");
        int espacios = sc.nextInt();

        Vehiculo[][] vehiculos = new Vehiculo[pisos][espacios];
        Sensor[][] sensores = new Sensor[pisos][espacios];

        Vehiculo.tamaño = pisos * espacios;
        Vehiculo.vehiculos = vehiculos;
        Sensor.sensores = sensores;
        for (int i = 0; i < Sensor.sensores.length; i++) {
            for (int j = 0; j < Sensor.sensores[i].length; j++) {
                Sensor sens = new Sensor(0);
                Sensor.sensores[i][j] = sens;

            }
        }
        System.out.println("Ingrese precio parqueadero carros: ");
        precioCarro = sc.nextInt();
        System.out.println("Ingrese precio parqueadero motos: ");
        precioMoto = sc.nextInt();

        while (todo) {
            System.out.println("Ingrese un numero:");
            int solo = sc.nextInt();
            switch (solo) {
                case 0:
                    System.out.println("Saliendo");
                    todo = false;
                    break;
                case 1:
                    System.out.println(Sensor.sensorLibre(sensores));
                    break;
                case 2:
                    System.out.println("Piso y Espacio donde desee parquear:");
                    ps = sc.nextInt();
                    es = sc.nextInt();
                    System.out.println("Ingrese tipo de vehículo:");
                    tipo = sc.next();
                    if (tipo.equalsIgnoreCase("moto")) {
                        if (Sensor.sensores[ps][es].getEstado() == 0) {
                            System.out.println("Ingrese placa");
                            placa = sc.next();
                            System.out.println("Ingrese marca ");
                            marca = sc.next();
                            System.out.println("Ingrese color ");
                            color = sc.next();
                            System.out.println("Ingrese valor comercial ");
                            valor = sc.nextInt();
                            LocalTime horaIngreso = LocalTime.now();
                            Vehiculo vehiculos2 = new Moto(placa, marca, color, valor, horaIngreso, precioMoto);
                            Vehiculo.vehiculos[ps][es] = vehiculos2;
                            Sensor.sensores[ps][es].setEstado(1);

                        } else {
                            System.out.println("No se pudo realizar la accion.");
                        }
                    }
                    if (tipo.equalsIgnoreCase("carro")) {
                        if (Sensor.sensores[ps][es].getEstado() == 0) {
                            System.out.println("Ingrese placa");
                            placa = sc.next();
                            System.out.println("Ingrese marca ");
                            marca = sc.next();
                            System.out.println("Ingrese color ");
                            color = sc.next();
                            System.out.println("Ingrese valor comercial ");
                            valor = sc.nextInt();
                            LocalTime horaIngreso = LocalTime.now();
                            Vehiculo vehiculos2 = new Carro(placa, marca, color, valor, horaIngreso, precioCarro);
                            Vehiculo.vehiculos[ps][es] = vehiculos2;
                            Sensor.sensores[ps][es].setEstado(1);

                        } else {
                            System.out.println("No se pudo realizar la accion.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Piso y Espacio donde desee parquear:");
                    ps = sc.nextInt();
                    es = sc.nextInt();
                    System.out.println("Ingrese tipo de vehículo:");
                    tipo = sc.next();
                    if (tipo.equalsIgnoreCase("moto")) {
                        if (Sensor.sensores[ps][es].getEstado() == 0) {
                            System.out.println("Ingrese placa");
                            placa = sc.next();
                            System.out.println("Ingrese marca ");
                            marca = sc.next();
                            System.out.println("Ingrese color ");
                            color = sc.next();
                            System.out.println("Ingrese valor comercial ");
                            valor = sc.nextInt();
                            LocalTime horaIngreso = LocalTime.now();
                            Vehiculo vehiculos2 = new Moto(placa, marca, color, valor, horaIngreso, precioMoto);
                            Vehiculo.vehiculos[ps][es] = vehiculos2;
                            Sensor.sensores[ps][es].setEstado(1);

                        } else {
                            System.out.println("No se pudo realizar la accion.");
                        }
                    }
                    if (tipo.equalsIgnoreCase("carro")) {
                        if (Sensor.sensores[ps][es].getEstado() == 0) {
                            System.out.println("Ingrese placa");
                            placa = sc.next();
                            System.out.println("Ingrese marca ");
                            marca = sc.next();
                            System.out.println("Ingrese color ");
                            color = sc.next();
                            System.out.println("Ingrese valor comercial ");
                            valor = sc.nextInt();
                            LocalTime horaIngreso = LocalTime.now();
                            Vehiculo vehiculos2 = new Carro(placa, marca, color, valor, horaIngreso, precioCarro);
                            Vehiculo.vehiculos[ps][es] = vehiculos2;
                            Sensor.sensores[ps][es].setEstado(1);
                            System.out.println(Vehiculo.vehiculos[ps][es].toString());
                        } else {
                            System.out.println("No se pudo realizar la accion.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Vehiculos almacenados: ");
                    System.out.println(Vehiculo.VehiculosCompletos());
                    break;
                case 5:
                    System.out.println("Cantidad de vehículos creados: ");
                    System.out.println(Vehiculo.VhCantidad(vehiculos));
                    break;
                case 6:
                    ps2 = sc.nextInt();
                    es2 = sc.nextInt();
                    System.out.println(Sensor.sensores[ps2][es2].getEstado());
                    break;
                case 7:
                    System.out.println(Sensor.sensoresEstado(sensores));
                    break;
                case 8:
                    System.out.println("Ingrese un color:");
                    color1 = sc.next();
                    for (int i = 0; i < Vehiculo.vehiculos.length; i++) {
                        for (int j = 0; j < Vehiculo.vehiculos[i].length; j++) {
                            if (Vehiculo.vehiculos[i][j] != null) {
                                String color2 = Vehiculo.vehiculos[i][j].getColor();
                                if (color1.equalsIgnoreCase(color2)) {
                                    System.out.println(Vehiculo.vehiculos[i][j].toString());
                                }
                            }

                        }
                    }
                    break;
                case 10:
                    System.out.println("Ingrese piso del sensor a desactivar");
                    ps = sc.nextInt();
                    System.out.println("Ingrese estacionamiento del sensor a desactivar");
                    es = sc.nextInt();
                    System.out.println("Ingrese tiempo ocupado en el parquedero: ");
                    tiempoOcupado = sc.nextInt();
                    System.out.println(Vehiculo.calcularPrecio(ps, es, tiempoOcupado));
                    System.out.println("El vehículo ha salido eliminado del parqueadero.");
                    Vehiculo.desactivarSensor(ps, es);
                    break;
                case 11:
                    Vehiculo.exportarVehiculos();
                    System.out.println("La información de los vehículos ha sido almacenada.");
                    break;
                default:
                    System.out.println("Comando incorrecto");

            }
        }

    }
}
