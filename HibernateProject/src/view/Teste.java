package view;

import java.util.Collection;

import model.Cliente;
import dao.HibernateDAO;

public class Teste {

	public static void main(String[] args) {
		HibernateDAO dao = new HibernateDAO();
		Collection<Cliente> clientes = (Collection<Cliente>) dao.consultar("from Cliente");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getIdCliente());
			System.out.println(cliente.getNome());
			System.out.println(cliente.getIdade());
		}
	}
}
