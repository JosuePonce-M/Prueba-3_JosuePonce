
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

    

}