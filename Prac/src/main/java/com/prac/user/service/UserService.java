package com.prac.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
	int join(HttpServletRequest request, HttpServletResponse response);
}
