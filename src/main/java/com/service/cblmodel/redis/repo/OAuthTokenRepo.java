package com.service.cblmodel.redis.repo;

import com.service.cblmodel.redis.model.OAuthToken;

import java.util.Map;


public interface
OAuthTokenRepo {
	void save(OAuthToken OAuthToken);

	Map<String, OAuthToken> findAll();

	OAuthToken findById(String serialNumber);

	void update(OAuthToken realTimeActivationDto);

	void delete(String serialNumber);
}
