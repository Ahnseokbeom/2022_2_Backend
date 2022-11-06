package net.skhu.info.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 값이 null이 아닌 것만 return
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project {
	public String projectName;
	// 변수의 이름을 변경해서 return
	@JsonProperty(value="hello")
	public String author;
	// @JsonIgnore - return 값에 포함되지 않음
	// dateformat
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date createDate;
}
