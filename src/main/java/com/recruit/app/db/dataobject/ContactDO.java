package com.recruit.app.db.dataobject;
import static com.recruit.app.db.tables.Contact.EMAIL;
import static com.recruit.app.db.tables.Contact.LOCATION;
import static com.recruit.app.db.tables.Contact.MOBILE_PHONE;
import static com.recruit.app.db.tables.Contact.PHONE;
import static com.recruit.app.db.tables.Contact.QQ;
import static com.recruit.app.db.tables.Contact.RESIDENCE;
import static com.recruit.app.db.tables.Contact.WEIXIN;
import android.content.ContentValues;

/**
 * 联系方式
 * 
 * @author wei.xinw
 * 
 */
public class ContactDO {
	private long id;
	private String email;
	private String phone;// 座机号码
	private String mobilePhone;// 手机号码
	private String qq;
	private String wx;// 微信号码
	private String residence;// 户籍所在地
	private String location;// 当前所在地

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWx() {
		return wx;
	}

	public void setWx(String wx) {
		this.wx = wx;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * 返回字段的ContentValues
	 * @return
	 */
	public ContentValues toContentValues() {
		ContentValues cv = new ContentValues();
		cv.put(EMAIL, email);
		cv.put(PHONE, phone);
		cv.put(MOBILE_PHONE, mobilePhone);
		cv.put(QQ, qq);
		cv.put(WEIXIN, wx);
		cv.put(RESIDENCE, residence);
		cv.put(LOCATION, location);
		return cv;
	}
}
