import java.util.Objects;

public class Doctor {
    private String nombre;
    private String especialidad;
    private Paciente paciente;
    private int valorConsulta;

    public Doctor(String nombre, String especialidad, Paciente paciente, int valorConsulta) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.paciente = paciente;
        this.valorConsulta = valorConsulta;
    }

    public void Doctor(){

    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double rebaja(){
        if (paciente.estadoPaciente().equals("Sobrepeso") || paciente.estadoPaciente().equals("Obeso")){
            return 0.3;
        } else {
            return 0.0;
        }

    }

    public int totalApagar(){
        return (int) (valorConsulta * rebaja());
    }
}
