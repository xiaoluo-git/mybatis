package com.jd.smartpark.accessdoor.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ConditionVo implements Serializable {

	private Long current;

	private Long size;

	private Integer deviceId;

	private Date startTime;

	private Date endTime;

	private String name;
}
