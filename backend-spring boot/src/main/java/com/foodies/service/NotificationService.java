package com.foodies.service;

import java.util.List;

import com.foodies.model.Notification;
import com.foodies.model.Order;
import com.foodies.model.Restaurant;
import com.foodies.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
