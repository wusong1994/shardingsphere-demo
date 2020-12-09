package com.hfocean.platform.core.po;

import javax.persistence.Id;
import javax.persistence.Table;

@Table( name ="t_user" )
public class UserPo {

    @Id
    //分库分表，此处不能用单库的自增，必须要生成全局唯一ID
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
