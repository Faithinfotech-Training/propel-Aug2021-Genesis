package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Visit;
@Repository
public interface IVisitRepository extends CrudRepository<Visit, Integer> {

}
