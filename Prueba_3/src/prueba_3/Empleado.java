
package prueba_3;


public  abstract class  Empleado  implements Cloneable {
  // atributos
    private String codigo;
    private String nombre;
    private double salarioBase;

    public Empleado(String codigo, String nombre, double salarioBase) {
        setCodigo(codigo);
        setNombre(nombre);
        setSalarioBase(salarioBase);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salarioBase = salarioBase;
    }

    // metodo abstracto
    public abstract double calcularSalario();

    public String mostrarInformacion() {
        return "Codigo: " + codigo + " | Nombre: " + nombre + " | Salario: " + calcularSalario();
    }

    // Basico: < 10000 | Estandar: 10000 a 29999 | Superior: >= 30000
    public String obtenerCategoria() {
        double s = calcularSalario();
        if (s < 10000) return "Basico";
        if (s < 30000) return "Estandar";
        return "Superior";
    }

    @Override
    public Empleado clone() throws CloneNotSupportedException {
        try {
            return (Empleado) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("No se pudo clonar");
            return null;
        }
    }
}
