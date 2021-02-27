package app.ws.service;

import app.ws.model.request.UserDetailsRequestModel;
import app.ws.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
