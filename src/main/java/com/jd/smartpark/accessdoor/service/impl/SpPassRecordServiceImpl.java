package com.jd.smartpark.accessdoor.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jd.smartpark.accessdoor.domain.ConditionVo;
import com.jd.smartpark.accessdoor.domain.PassRecordResultVo;
import com.jd.smartpark.accessdoor.domain.SpPassRecord;
import com.jd.smartpark.accessdoor.mapper.SpPassRecordMapper;
import com.jd.smartpark.accessdoor.service.SpPassRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 通行记录表 通行记录表 服务实现类
 * </p>
 *
 * @author xiaoluo
 * @since 2019-11-16
 */
@Service
public class SpPassRecordServiceImpl extends ServiceImpl<SpPassRecordMapper, SpPassRecord> implements SpPassRecordService {

	@Autowired
	private SpPassRecordMapper passRecordMapper;

	@Override
	public void passRecordPage(Page<PassRecordResultVo> passRecordResultVoPage, ConditionVo conditionVo) {

		List<PassRecordResultVo> list = passRecordMapper.selectRecordPage(passRecordResultVoPage,conditionVo);
		passRecordResultVoPage.setRecords(list);
	}
}
