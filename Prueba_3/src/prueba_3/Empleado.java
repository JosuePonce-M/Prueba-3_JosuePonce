
package prueba_3;


public  abstract class  Empleado  implements Cloneable {
    // atributos
 private String codigo ;
    private String nombre;
    private double SalarioBase;

  

    public Empleado (String codigo , String nombre , double SalarioBase) {
        this.codigo = codigo;
        this.nombre = nombre ;
        setSalarioBase(SalarioBase);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty())
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
         if (codigo == null || codigo.trim().isEmpty())
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
          if (SalarioBase < 0) {
            throw new IllegalArgumentException("El Salario no puede ser negativo");
        }
        this.SalarioBase = SalarioBase;
       
    }
    // metodo abstrato
    public abstract double calcularSalario();
  
    public String MostrarInformacion() {
        return "Codigo: " + codigo + " | nombre: " + nombre + " | Salario: " + calcularSalario();
    }
    // Básico: < 10000 | Estándar: 10000 a 29999 | Superior: >= 30000.
    public String obtenerCategoria() {
        double p = calcularSalario();
        if (p < 10000) return "Basico";
        if (p < 30000) return "Estandar";
        return "Superior";
    }

    @Override
    public Empleado clone() {
        try {
            return (Empleado) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("No se pudo clonar", e);
        }
    }
}
    

