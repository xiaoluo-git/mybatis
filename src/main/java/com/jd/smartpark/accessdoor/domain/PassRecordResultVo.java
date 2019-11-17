package com.jd.smartpark.accessdoor.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PassRecordResultVo implements Serializable{

	private String name;

	private Integer sex;

	private String deviceName;

	private String companyName;

	private Date passTime;

	private String faceUrl;
}
