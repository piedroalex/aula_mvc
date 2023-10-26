package models;

import java.util.ArrayList;
import java.util.List;

import util.Cliente;

/**
 * Modelo ClienteModel
 * 
 * @author Pedro Alex
 */
public class ClienteModel {
	
	private List<Cliente> clientes = new ArrayList<>();

    public Cliente buscarPorId(Integer id) {
    	for(Cliente cliente: clientes) {
    		if(cliente.getId() == id) {
    			return cliente;
    		}
    	}
        return null;
    }
    
    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void inserirCliente(Cliente cliente) {
    	clientes.add(cliente);
    }

    public void atualizarCliente(Cliente cliente) {
    	Cliente clienteBuscado = this.buscarPorId(cliente.getId());
    	cliente.setId(clienteBuscado.getId());
    	cliente.setNome(clienteBuscado.getNome());
    	this.excluirCliente(clienteBuscado);
        this.inserirCliente(cliente);
    }

    public void excluirCliente(Cliente cliente) {
    	clientes.remove(cliente);
    }
}
