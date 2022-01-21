package com.faith.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Login;

@Repository
public interface ILoginRepository extends CrudRepository<Login, Integer> {

	@Query("FROM Login WHERE userName=?1 AND password=?2")
	Login findByUserNameAndPassword(String userName,String password);
}
 