package com.example.demo.enity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.example.demo.models.User;

// 读取数据库的方法：继承CrudRepository，用CrudRepository中提供的方法来读写数据库
// CrudRepository需要传两个类，其中的第一个类User表示数据库操作实体类，第二类Integer表示实体User中id对应的类型。
// 这部分就是网上说的dao层
public interface Userrepository extends CrudRepository<User, Long> {

  @Query(value = "SELECT * FROM User WHERE id = :id", nativeQuery = true)
  public List<User> getUserById(@Param("id") Long id);

}
