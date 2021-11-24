public class Sensor {
    private int estado = 0;
    public static Sensor[][] sensores;
    public Sensor (){

    }

    public Sensor(int e){
        this.estado = e;
    }

    public String toString() {
        return "Sensor{" + "estado=" + estado + '}';
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public static Sensor[][] getSensores() {
        return sensores;
    }

    public static void setSensores(Sensor[][] sensores) {
        Sensor.sensores = sensores;
    }
    public static String sensorLibre (Sensor sensores[][]){
        String nada ="";
        for(int i = 0; i < sensores.length; i++){
            for(int j = 0; j < sensores[i].length; j++){
                if(sensores[i][j] != null && sensores[i][j].getEstado() == 0){
                    String dados =" piso "+i +" espacio "+j;
                    nada = nada + dados;

                }
            }
        } return nada;
    }

    public static String sensoresEstado (Sensor[][] sensores){
        String nada ="";
        for(int i = 0; i < sensores.length; i++){
            for(int j = 0; j < sensores[i].length; j++){
                if(sensores[i][j] != null){
                    String hola ="piso"+i +"espacio"+j + sensores[i][j].getEstado()+" ";
                    nada = nada + hola;

                }
            }
        } return nada;
    }




}

