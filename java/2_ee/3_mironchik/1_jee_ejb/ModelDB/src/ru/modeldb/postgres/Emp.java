package ru.modeldb.postgres;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

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
//	private Date hiredate;		// just date like '2001-02-17'
	private Timestamp hiredate;	// same with java.util.Date
//	private java.util.Date hiredate;
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
}
