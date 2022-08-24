package com.desafioComp.services;

import com.desafioComp.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {


       public Double shipment(Order order) {
            if (order.getBasic() < 100.00){
                return 20.00;
            } else if (order.getBasic() <200.00){
                return 12.00;
            } else {
                return 0.0;
            }
       }

}
