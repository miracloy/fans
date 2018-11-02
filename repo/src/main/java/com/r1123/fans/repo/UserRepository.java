package com.r1123.fans.repo;

import com.r1123.fans.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by helloqdz on 2018/10/30.
 */
@Repository("c_userRepo")
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
