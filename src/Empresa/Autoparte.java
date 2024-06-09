package Empresa;
import java.util.ArrayList;
import java.util.Date;


public class Autoparte {
    private int codigo;
    private String denominacion;
    private String descripcion;
    private String categoria;
    private String marca;
    private String vehiculo;
    private String modelo;
    private double precioUnitario;
    private String enlace;
    private int cantidadStock;
    private int stockMinimo;
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public int getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public void cargarAutoparte() {
        // Lógica para cargar una nueva autoparte en el catálogo
    }

    public void modificarAutoparte() {
        // Lógica para modificar una autoparte existente
    }

    public void listarAutopartes() {
        // Lógica para listar todas las autopartes disponibles
    }

    public void darDeBaja() {
        // Lógica para dar de baja una autoparte del catálogo
    }
	
}