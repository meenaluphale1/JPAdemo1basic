package com.lti.demo.JPAdemo1basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student {

	@Id   // autogenerate id 
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_stu")
	@SequenceGenerator(name="seq_stu",sequenceName="SEQ_STU",allocationSize=1)
	@Column(name="STU_ID")
	private int stuId;
	
	@Column(name="STU_NAME")
	private String stuName;
	
	@Column(name="SCORE")
	private double score;
	
	
	
	public Student(String stuName, double score) {
		super();
		this.stuName = stuName;
		this.score = score;
	}

	public Student(int stuId, String stuName, double score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.score = score;
	}

	public Student() {
		super();
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", score=" + score + "]";
	}
	
	
	
	
}
