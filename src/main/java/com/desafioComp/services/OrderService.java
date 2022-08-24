package com.desafioComp.services;

import com.desafioComp.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderService {
    @Autowired
    private Order order;
    @Autowired
    private ShipmentService shipmentService;

    public Double total (Order order) {
        return order.getBasic() - (order.getBasic() * (order.getDiscount()/100)) + shipmentService.shipment(order);
    }


}
