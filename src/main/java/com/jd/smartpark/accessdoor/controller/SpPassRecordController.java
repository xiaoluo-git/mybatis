package com.jd.smartpark.accessdoor.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jd.smartpark.accessdoor.domain.ConditionVo;
import com.jd.smartpark.accessdoor.domain.PassRecordResultVo;
import com.jd.smartpark.accessdoor.domain.SpPassRecord;
import com.jd.smartpark.accessdoor.service.SpPassRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 通行记录表 通行记录表 前端控制器
 * </p>
 *
 * @author xiaoluo
 * @since 2019-11-16
 */
@RestController
@RequestMapping("/accessdoor/sp-pass-record")
public class SpPassRecordController {

	@Autowired
	private SpPassRecordService passRecordService;

	@PostMapping("page")
	public Map<String,Object> page(@RequestBody ConditionVo conditionVo){

		Page<PassRecordResultVo> passRecordResultVoPage =  new Page<>(conditionVo.getCurrent(),conditionVo.getSize());
		passRecordService.passRecordPage(passRecordResultVoPage,conditionVo);
		Map<String,Object> map = new HashMap<>();
		map.put("result",passRecordResultVoPage);
		return map;
	}

	@PostMapping("testPage")
	public Page<SpPassRecord> testPage(@RequestBody ConditionVo conditionVo){
		Page<SpPassRecord> spPassRecordPage = new Page<>(conditionVo.getCurrent(),conditionVo.getSize());
		passRecordService.page(spPassRecordPage);
		return spPassRecordPage;
	}


}

