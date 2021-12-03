package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//表明我下面写的是实体类
@Entity
// 创建数据库中的表，我这边叫new
@Table(name = "user")

public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  // 标注用于声明一个实体类的属性映射为数据库的主键列
  @Id
  // 用于标注主键的生成策略，通过strategy 属性指定。默认情况下，JPA
  // 自动选择一个最适合底层数据库的主键生成策略：SqlServer对应identity，MySQL 对应 auto increment。
  @GeneratedValue
  // id 为主键
  private Long id;
  // 表中的列
  @Column(name = "username")
  private String userName;
  // 表中的列
  @Column(name = "password")
  private String passWord;

  // User的默认构造函数
  public User() {
    super();
  }

  // User的构造函数
  public User(String userName, String passWord) {
    super();
    this.userName = userName;
    this.passWord = passWord;
  }

  // 获取主键id
  public Long getId() {
    return id;
  }

  // 设置主键id
  public void setId(Long id) {
    this.id = id;
  }

  // 获得用户姓名
  public String getUserName() {
    return userName;
  }

  // 设置用户姓名
  public void setUserName(String userName) {
    this.userName = userName;
  }

  // 得到密码
  public String getPassWord() {
    return passWord;
  }

  // 设置密码
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }
}
