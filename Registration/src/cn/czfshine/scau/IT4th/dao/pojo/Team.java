package cn.czfshine.scau.IT4th.dao.pojo;

import org.nutz.dao.entity.annotation.*;

@Table("dev_1_team_info")   // 声明了Person对象的数据表
public class Team { // 不会强制要求继承某个类

    @Id       // 表示该字段为一个自增长的Id,注意,是数据库表中自增!!
    private int id; // @Id与属性名称id没有对应关系.

    @Column   // 表示该字段可以用来标识此对象，或者是字符型主键，或者是唯一性约束
    private String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Column      // 表示该对象属性可以映射到数据库里作为一个字段
    private int age;


	


    // 省略getter/setter
}