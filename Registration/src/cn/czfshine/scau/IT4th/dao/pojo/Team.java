package cn.czfshine.scau.IT4th.dao.pojo;

import org.nutz.dao.entity.annotation.*;


@Table("dev_2_team_info")   // 声明了Person对象的数据表
public class Team { // 不会强制要求继承某个类

    @Id       
    private int id; // @Id与属性名称id没有对应关系.

    @Column   
    private String team_name;
    @Column   
    private String master_name;
    @Column   
    private String master_id;
    @Column   
    private String master_college;
    @Column   
    private String master_level;
    @Column   
    private String master_phone;
    @Column   
    private String master_email;
    @Column   
    private String master_major;
	public String getMaster_college() {
		return master_college;
	}
	public String getMaster_email() {
		return master_email;
	}
	public String getMaster_id() {
		return master_id;
	}
	public String getMaster_level() {
		return master_level;
	}
	public String getMaster_major() {
		return master_major;
	}
	public String getMaster_name() {
		return master_name;
	}
	public String getMaster_phone() {
		return master_phone;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setMaster_college(String master_college) {
		this.master_college = master_college;
	}
	public void setMaster_email(String master_email) {
		this.master_email = master_email;
	}
	public void setMaster_id(String master_id) {
		this.master_id = master_id;
	}
	public void setMaster_level(String master_level) {
		this.master_level = master_level;
	}
	public void setMaster_major(String master_major) {
		this.master_major = master_major;
	}
	public void setMaster_name(String master_name) {
		this.master_name = master_name;
	}
	public void setMaster_phone(String master_phone) {
		this.master_phone = master_phone;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
    




    // 省略getter/setter
}