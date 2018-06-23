package br.com.vanhack.customer.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.vanhack.customer.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
