package ec.ups.edu.proyecto.g1.transaccional.modelo;

import java.util.Date;

public class CuentaBancaria {
	private int numBancaria;
	private Date fechaApertura;
	private Usuario usuario;
	private CuentaAhorro cuentaAhorro;
	private CuentaCorriente cuentaCorriente;
	private Poliza poliza;
	
	public int getNumBancaria() {
		return numBancaria;
	}
	public void setNumBancaria(int numBancaria) {
		this.numBancaria = numBancaria;
	}
	public Date getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public CuentaAhorro getCuentaAhorro() {
		return cuentaAhorro;
	}
	public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
		this.cuentaAhorro = cuentaAhorro;
	}
	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}
	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	public Poliza getPoliza() {
		return poliza;
	}
	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	
	
}
