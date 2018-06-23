package br.com.vanhack.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.vanhack.customer.model.Order;
import br.com.vanhack.customer.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService service;

	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public ResponseEntity<Object> buscar() {
		List<Order> orders = service.findAll();
		return new ResponseEntity<Object>(orders, HttpStatus.OK);
	}
}
