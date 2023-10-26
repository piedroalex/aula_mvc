package aula_mvc;

import controllers.ClienteController;
import models.ClienteModel;
import util.Cliente;
import views.ClienteView;

/**
 * Classe Principal
 * 
 * @author Pedro Alex
 */
public class Principal {

	public static void main(String[] args) {
		ClienteModel clienteModel = new ClienteModel();
        ClienteView clienteView = new ClienteView();
        ClienteController clienteController = new ClienteController(clienteModel, clienteView);

        clienteController.listarClientes();

        clienteController.inserirCliente(new Cliente(1, "Pedro"));
        clienteController.inserirCliente(new Cliente(2, "Maria"));

        clienteController.listarClientes();

        Cliente cliente = clienteController.buscarPorId(1);
        clienteController.excluirCliente(cliente);
        
        clienteController.listarClientes();

        cliente = clienteController.buscarPorId(2);
        clienteController.excluirCliente(cliente);

        clienteController.listarClientes();
	}

}
