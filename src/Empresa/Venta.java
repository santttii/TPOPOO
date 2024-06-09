package Empresa;
import java.util.Date;

public class Venta {
	private int id;
    private Date fecha;
    private double montoTotal;
    private Usuario usuario;
    private MedioPago medioPago;
    private String detalles;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public MedioPago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public double calcularMontoTotal() {
        // Lógica para calcular el monto total de la venta según el medio de pago
        // y aplicar descuentos/recargos si corresponde
		return 0;
    }

    public void registrarVenta() {
        // Lógica para registrar la venta y actualizar el stock de las autopartes vendidas
    }
}
