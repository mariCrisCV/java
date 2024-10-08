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
		}else {
			System.out.println("Cliente ya existe: "+nuevoCliente.getCedula());
		}
	}

}
