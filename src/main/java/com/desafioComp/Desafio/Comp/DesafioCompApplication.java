package com.desafioComp.Desafio.Comp;

import com.desafioComp.services.OrderService;
import com.desafioComp.services.ShipmentService;
import com.desafioComp.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.desafioComp"})
public class DesafioCompApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;


	public DesafioCompApplication() {
	}


	public static void main(String[] args) {
		SpringApplication.run(DesafioCompApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Código: ");
		int code = sc.nextInt();
		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("Porcentagem de desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.printf("Pedido código %d%n", code);
		System.out.print("Valor total: R$: " + orderService.total(order));




	}
}
