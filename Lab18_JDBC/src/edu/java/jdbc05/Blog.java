package edu.java.jdbc05;
// MVC(Model - View - Controller) 아키텍쳐에서 Model에 해당하는 클래스
// DTO(Data Tansfer Object), VO(Value Object)
import java.util.Date;

public class Blog {
	private int blogNo; // blog_no 컬럼
	private String title; //title 컬럼
	private String content; // content 컬럼
	private Date updateTime; // update_time 컬럼
	
	public Blog(int blogNo, String title, String content, Date updateTime) {
		super();
		this.blogNo = blogNo;
		this.title = title;
		this.content = content;
		this.updateTime = updateTime;
	}

	public int getBlogNo() {
		return blogNo;
	}
	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return super.toString();
//		return 
	}
	
	
}
