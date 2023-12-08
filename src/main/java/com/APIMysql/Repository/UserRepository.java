package com.APIMysql.Repository;


import com.APIMysql.Model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,Integer> {
}
