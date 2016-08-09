package com.github.hualuomoli.demo.raml.app.origin.entity;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.annotation.JSONField;

public class GetObjectResultJsonEntity {
  
  private GetObjectResultJsonEntityAddress address;
  private String sex;
  private String nickname;
  private java.util.List<GetObjectResultJsonEntityOrder> orders;
  private Integer age;
  private String username;
  
  public GetObjectResultJsonEntityAddress getAddress(){
    return address;
  }
  
  public void setAddress(GetObjectResultJsonEntityAddress address){
    this.address = address;
  }
  public String getSex(){
    return sex;
  }
  
  public void setSex(String sex){
    this.sex = sex;
  }
  public String getNickname(){
    return nickname;
  }
  
  public void setNickname(String nickname){
    this.nickname = nickname;
  }
  public java.util.List<GetObjectResultJsonEntityOrder> getOrders(){
    return orders;
  }
  
  public void setOrders(java.util.List<GetObjectResultJsonEntityOrder> orders){
    this.orders = orders;
  }
  public Integer getAge(){
    return age;
  }
  
  public void setAge(Integer age){
    this.age = age;
  }
  public String getUsername(){
    return username;
  }
  
  public void setUsername(String username){
    this.username = username;
  }
  
}
