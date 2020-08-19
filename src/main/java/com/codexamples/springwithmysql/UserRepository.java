package com.codexamples.springwithmysql;

import org.springframework.data.repository.CrudRepository;
import com.codexamples.springwithmysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
