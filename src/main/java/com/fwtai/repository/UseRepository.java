package com.fwtai.repository;

import com.fwtai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-03 11:01
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Repository
public interface UseRepository extends JpaRepository<User,Integer>{

}