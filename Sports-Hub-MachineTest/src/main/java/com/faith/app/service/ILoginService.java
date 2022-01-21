package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Login;


public interface ILoginService {
	
	public List<Login>getAllLogins();
	
	public Optional<Login>getLoginById(Integer logId);
	
	public void addLogin(Login login);
	
	public void updateLogin(Login login);
	
	public void deleteLogin(Integer logId);
	
	public Login findByUserNameAndPassword(String userName,String password);

}
