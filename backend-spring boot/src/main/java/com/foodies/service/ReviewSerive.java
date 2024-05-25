package com.foodies.service;

import java.util.List;

import com.foodies.Exception.ReviewException;
import com.foodies.model.Review;
import com.foodies.model.User;
import com.foodies.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
