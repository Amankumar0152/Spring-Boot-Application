package com.cloud.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.cloud.demo.model.Bug;

public interface BugRepo extends CrudRepository<Bug, Integer>
{

}
