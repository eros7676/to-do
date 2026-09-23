import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Tarea> lista;
    private final Scanner in;
    private int contador;

    public Menu(){
        this.lista = new ArrayList<>();

        this.in = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Menu menu = new Menu();

        boolean flag = true;

        while (flag){


            System.out.println("""
                    Que desea hacer?
                    
                    1. Agregar Tarea
                    2. Ver Tareas
                    3. Completar Tarea
                    4. Eliminar Tarea
                    5. Salir""");

            int opcion = menu.in.nextInt();

            switch(opcion){
                case 1:
                    menu.agregarTarea();
                    break;
                case 2:
                    menu.verTareas();
                    break;
                case 3:
                    menu.completarTarea();
                    break;
                case 4:
                    menu.eliminarTarea();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }

    public void agregarTarea(){

        System.out.println("Dame la descripcion de la tarea");

        String descripcion = in.next();

        lista.add(new Tarea(contador++, descripcion));

        System.out.println("Tarea generada con éxito\n");
    }

    public void verTareas(){
        System.out.println(lista + "\n");
    }

    public void completarTarea(){
        System.out.println("Que id tiene la tarea?");

        int id = in.nextInt();

        for (Tarea tarea : lista) {
            if (tarea.getId() == id){
                tarea.completar();

                System.out.println("La tarea se completó con éxito");
                return;
            }
        }

        System.out.println("La tarea no se encontró");
    }

    public void eliminarTarea(){
        System.out.println("Que id tiene la tarea?");

        int id = in.nextInt();

        for (Tarea tarea : lista) {
            if (tarea.getId() == id){
                lista.remove(tarea);

                System.out.println("La tarea se eliminó con éxito");
                return;
            }
        }

        System.out.println("La tarea no se encontró");
    }
}
