import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Paciente paciente = new Paciente("paulo irribarra", 55.4, "Masculino", 1.75);

        Doctor doctor = new Doctor("Dr House", "General", paciente, 100000);


    }
}