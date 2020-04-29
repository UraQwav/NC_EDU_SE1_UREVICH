package com.subs.pluto.repository;

import com.subs.pluto.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    List<Users> findAllBy();

}