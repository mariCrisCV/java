package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		prestamos = new ArrayList<>();
		clientes = new ArrayList<>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncontrado = null;
		Cliente elementoCliente = null;
		for (int i = 0; i < clientes.size(); i++) {
			elementoCliente = clientes.get(i);
			if (cedula.equals(elementoCliente.getCedula())) {
				clienteEncontrado = elementoCliente;
				return clienteEncontrado;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente nuevoCliente) {
		if (buscarCliente(nuevoCliente.getCedula()) == null) {
			clientes.add(nuevoCliente);
		} else {
			System.out.println("Cliente ya existe: " + nuevoCliente.getCedula());
		}
	}

	public void asignarPrestamo(String cedula, Prestamo prestamoCliente) {
		Cliente cliente = buscarCliente(cedula);
		if (cliente==null) {
			System.out.println("No es cliente del Banco");
		} else {
			prestamoCliente.setCliente(cliente);
			prestamos.add(prestamoCliente);
			CalculadoraAmortizacion.generarTabla(prestamoCliente);
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente){
		ArrayList<Prestamo> prestamosCliente = new ArrayList<>();
		Cliente clientePrestamo = buscarCliente(cedulaCliente);
		Prestamo elementoPrestamo = null;
		if(clientePrestamo == null) {
			System.out.println("Cliente no encontrado: "+ cedulaCliente);
			return null;
		}
		for(int i=0; i<prestamos.size();i++) {
			elementoPrestamo=prestamos.get(i);
			if(elementoPrestamo.getCliente().getCedula().equals(cedulaCliente)) {
				prestamosCliente.add(elementoPrestamo);
			}
		}
		if(prestamosCliente.isEmpty()) {
			return null;
		}else {
			return prestamosCliente;
		}
		
	}
	
	

}
