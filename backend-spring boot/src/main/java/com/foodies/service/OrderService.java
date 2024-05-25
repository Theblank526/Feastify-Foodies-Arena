package com.foodies.service;

import java.util.List;

import com.foodies.Exception.CartException;
import com.foodies.Exception.OrderException;
import com.foodies.Exception.RestaurantException;
import com.foodies.Exception.UserException;
import com.stripe.exception.StripeException;
import com.foodies.model.Order;
import com.foodies.model.PaymentResponse;
import com.foodies.model.User;
import com.foodies.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
