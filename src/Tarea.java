public class Tarea {

    private int id;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId(){
        return this.id;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void completar(){
        this.completada = true;
    }

    @Override
    public String toString(){
        return "{id: " + this.id + ", descripcion: " + this.descripcion + ", completada: " + this.completada + "}";
    }
}
