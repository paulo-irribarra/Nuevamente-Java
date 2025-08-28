import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, valorConsulta, edad;
        String nomPa, nomDo, genero, especialidad;
        double pesoKg, estaturaCm;
        Paciente paciente = null;
        Doctor doctor = null;

        do {
            System.out.println("Clínica Olor a Clavel\n" +
                               "1. Crear Doctor\n" +
                               "2. Mostrar todos los datos (tanto del doctor como de su paciente)\n" +
                               "3. Estado del Paciente y su Metabolismo Basal\n" +
                               "4. Total a pagar\n" +
                               "5. Modificar el género del paciente (validar que no sea el mismo que tenía)\n" +
                               "6. Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Crear un paciente");
                    System.out.println("Ingresa el nombre del paciente: ");
                    teclado.nextLine();
                    nomPa = teclado.nextLine();
                    System.out.println("Ingrese el peso en kg: ");
                    pesoKg = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrese el genero: ");
                    genero = teclado.nextLine();
                    System.out.println("Ingrese la estatura del paciente en cm: ");
                    estaturaCm = teclado.nextDouble();
                    paciente = new Paciente(nomPa, pesoKg, genero, estaturaCm);

                    System.out.println("***** Paciente  Creado correctamente *****");

                    System.out.println("Crear un doctor");
                    teclado.nextLine();
                    System.out.println("Ingresar nombre del doctor: ");
                    nomDo = teclado.nextLine();
                    System.out.println("Ingrese una especialida: ");
                    especialidad = teclado.nextLine();
                    System.out.println("Ingrese el valor de la consulta: ");
                    valorConsulta = teclado.nextInt();
                    doctor = new Doctor(nomDo, especialidad, paciente, valorConsulta);
                    System.out.println("***** Doctor creado correctamente *****");
                    break;
                case 2:
                    if (paciente != null){
                        System.out.println("Nombre del Doctor: " + doctor.getNombre());
                        System.out.println("Especialidad del Doctor: " + doctor.getEspecialidad());
                        System.out.println("Valor de la consulta del Doctor: " + doctor.getValorConsulta());
                        System.out.println("Nombre del paciente: " + doctor.getPaciente().getNombre());
                        System.out.println("PesoKG del paciente: " + doctor.getPaciente().getPesoKg());
                        System.out.println("Genero del cliente: " + doctor.getPaciente().getGenero());
                        System.out.println("Estatura del cliente: " + doctor.getPaciente().getEstaturaCm());
                    }else {
                        System.out.println("Debe crear un Doctor");
                    }
                    break;
                case 3:
                    if (paciente != null){
                        System.out.println("Estado del paciente: " + doctor.getPaciente().estadoPaciente());
                        System.out.println("Ingresar la edad del paciente: ");
                        edad = teclado.nextInt();
                        System.out.println("metabolismo Basal del pciente: " + doctor.getPaciente().metabolismoBasal(edad));
                    }else {
                        System.out.println("Debe crear un Doctor");
                    }
                    break;
                case 4:
                    if (paciente != null){
                        System.out.println("Total a pagar es de " + doctor.totalApagar());
                        System.out.println(paciente.imc());
                    } else {
                        System.out.println("Debe crear un doctor");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }

        } while (opcion != 6);{

        }

    }
}