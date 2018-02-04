package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music_contest")
public class Music_contestBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String music_contest_id;
	private String music_contest_name;
	private String music_contest_style;
	private String music_contest_status;
	
	
	@Override
	public String toString() {
		return "Music_contestBean [music_contest_id=" + music_contest_id + ", music_contest_name=" + music_contest_name
				+ ", music_contest_style=" + music_contest_style + ", music_contest_status=" + music_contest_status
				+ "]";
	}
	public String getMusic_contest_id() {
		return music_contest_id;
	}
	public void setMusic_contest_id(String music_contest_id) {
		this.music_contest_id = music_contest_id;
	}
	public String getMusic_contest_name() {
		return music_contest_name;
	}
	public void setMusic_contest_name(String music_contest_name) {
		this.music_contest_name = music_contest_name;
	}
	public String getMusic_contest_style() {
		return music_contest_style;
	}
	public void setMusic_contest_style(String music_contest_style) {
		this.music_contest_style = music_contest_style;
	}
	public String getMusic_contest_status() {
		return music_contest_status;
	}
	public void setMusic_contest_status(String music_contest_status) {
		this.music_contest_status = music_contest_status;
	}
	

}
