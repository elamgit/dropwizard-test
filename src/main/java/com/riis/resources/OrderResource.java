package com.riis.resources;

import com.codahale.metrics.annotation.Timed;
import com.riis.api.Order;

import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/order")
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource {

    private static Map<String, Order> orders = new HashMap<>();

    static {
        orders.put("tv", new Order("tv", 10));
        orders.put("phone", new Order("iphone", 20));
    }

    @GET
    @Timed
    public Order getOrder(@QueryParam("name") String name) {
        return orders.get(name);
    }

}
