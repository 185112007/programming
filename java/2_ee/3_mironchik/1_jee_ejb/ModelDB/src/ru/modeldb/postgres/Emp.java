package ru.modeldb.postgres;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Entity implementation class for Entity: emp
 *
 */
@Entity(name="emp")
@Table(name = "emp"/*, schema = "test"*/)
@javax.persistence.NamedQueries(
		value = {
				@NamedQuery(name = "GetEmpsByDeptNo", 
						    query = "SELECT o FROM emp AS o WHERE o.deptno = :p")
		}
		)
public class Emp implements Serializable {

	@Id
	private int empno;
	private String ename;
	private String job;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	private Timestamp hiredate;
	private Float sal;
	private Integer deptno;
	
	private static final long serialVersionUID = 1L;

	public Emp() {
		super();
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Timestamp getHiredate() {
		return hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", deptno=" + deptno + "]";
	}
	
}
