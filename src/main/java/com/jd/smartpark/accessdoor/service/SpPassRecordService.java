package com.jd.smartpark.accessdoor.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jd.smartpark.accessdoor.domain.ConditionVo;
import com.jd.smartpark.accessdoor.domain.PassRecordResultVo;
import com.jd.smartpark.accessdoor.domain.SpPassRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 通行记录表 通行记录表 服务类
 * </p>
 *
 * @author xiaoluo
 * @since 2019-11-16
 */
public interface SpPassRecordService extends IService<SpPassRecord> {

	void passRecordPage(Page<PassRecordResultVo> passRecordResultVoPage, ConditionVo conditionVo);
}
