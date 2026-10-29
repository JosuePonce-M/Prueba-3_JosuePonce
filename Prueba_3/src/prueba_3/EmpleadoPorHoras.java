
package prueba_3;


public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String codigo, String nombre, double salarioBase,   int horasTrabajadas, double tarifaPorHora) {
        super(codigo, nombre, salarioBase);
        setHorasTrabajadas(horasTrabajadas);
        setTarifaPorHora(tarifaPorHora);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas no pueden ser menor a cero");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

       

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
          if (tarifaPorHora < 0) {
            throw new IllegalArgumentException("La tarifa no puede ser menor a cero");
        }
        this.tarifaPorHora = tarifaPorHora;
    }
    @Override
      public double calcularSalario() {
        return getSalarioBase() + (horasTrabajadas * tarifaPorHora);
    }
    }
    

