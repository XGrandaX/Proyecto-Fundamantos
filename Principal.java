package fundamentos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
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
                    if (Sensor.sensores[ps][es].getEstado() == 0) {
                        placa = sc.next();
                        marca = sc.next();
                        color = sc.next();
                        Vehiculo vehiculos2 = new Vehiculo(placa, marca, color);
                        Vehiculo.vehiculos[ps][es] = vehiculos2;
                        Sensor.sensores[ps][es].setEstado(1);

                    } else {
                        System.out.println("No se pudo realisar la accion.");
                    }
                    break;
                case 3:
                    System.out.println("Piso y Espacio donde desee parquear:");
                    ps1 = sc.nextInt();
                    es1 = sc.nextInt();
                    if (Sensor.sensores[ps1][es1].getEstado() == 0) {
                        placa = sc.next();
                        marca = sc.next();
                        color = sc.next();
                        valor = sc.nextInt();
                        Vehiculo vehiculos2 = new Vehiculo(placa, marca, color, valor);
                        Vehiculo.vehiculos[ps1][es1] = vehiculos2;
                        Sensor.sensores[ps1][es1].setEstado(1);

                    } else {
                        System.out.println("No se pudo realisar la accion.");
                    }
                    break;
                case 4:
                    System.out.println(Vehiculo.VehiculosCompletos());
                    break;
                case 5:
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
                default:
                    System.out.println("Comando incorrecto");

            }
        }

    }
}
