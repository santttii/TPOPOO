package Empresa;

import java.util.Date;

public class Pedido {
	private int id;
    private Date fecha;
    private double montoTotal;
    private Usuario usuario;
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
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	public void reservarProductos() {
        // Lógica para reservar los productos del pedido
    }

    public void cancelarPedido() {
        // Lógica para cancelar el pedido y liberar los productos reservados
    }
    
}
