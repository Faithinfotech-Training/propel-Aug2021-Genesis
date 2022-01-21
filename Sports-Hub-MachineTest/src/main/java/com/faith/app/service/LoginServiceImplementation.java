package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Login;
import com.faith.app.repository.ILoginRepository;
@Service
public class LoginServiceImplementation implements ILoginService {

	@Autowired
	private ILoginRepository loginRepository;
	
	@Override
	public List<Login> getAllLogins() {
		// TODO Auto-generated method stub
		return (List<Login>) loginRepository.findAll();
	}

	@Override
	public Optional<Login> getLoginById(Integer logId) {
		// TODO Auto-generated method stub
		return loginRepository.findById(logId);
	}

	@Override
	public void addLogin(Login login) {
		loginRepository.save(login);
		
	}

	@Override
	public void updateLogin(Login login) {
		loginRepository.save(login);		
	}

	@Override
	public void deleteLogin(Integer logId) {
		loginRepository.deleteById(logId);
		
	}

	@Override
	public Login findByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return loginRepository.findByUserNameAndPassword(userName, password);
	}

}
