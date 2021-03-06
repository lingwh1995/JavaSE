package com.dragonsoft.reflectanno.application_orm;

/**  
 * 这里用一句话描述这个类的作用
 * @author ronin  
 * @date 2019年3月24日  
 */

@Table(value="TB_STUDENT")
public class Student {
	@Column(cloumnName="ID",dadaType="VARCHAR2",length=32)
	private String id;
	@Column(cloumnName="NAME",dadaType="VARCHAR2",length=32)
	private String name;
	@Column(cloumnName="AGE",dadaType="NUMBER",length=5)
	private String age;
	
	/**  
	 * 创建一个新的实例 Student.  
	 *    
	 */ 
	public Student() {
		super();
	}

	/**  
	 * 创建一个新的实例 Student.  
	 *  
	 * @param id
	 * @param name
	 * @param age  
	 */ 
	public Student(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see Object#toString()
	 */  
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
