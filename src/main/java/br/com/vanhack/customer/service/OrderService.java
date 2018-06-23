package br.com.vanhack.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vanhack.customer.model.Order;
import br.com.vanhack.customer.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository repository;

	public List<Order> findAll() {
		List<Order> orders = new ArrayList<>();
		repository.findAll().forEach(orders::add);
		return orders;
	}

	public void saveOrder(Order convidado) {
		repository.save(convidado);
	}

	public Order findById(Long id) {
		return repository.findById(id).get();
	}
}
