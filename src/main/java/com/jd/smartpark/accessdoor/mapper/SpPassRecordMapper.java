package com.jd.smartpark.accessdoor.mapper;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jd.smartpark.accessdoor.domain.ConditionVo;
import com.jd.smartpark.accessdoor.domain.PassRecordResultVo;
import com.jd.smartpark.accessdoor.domain.SpPassRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 通行记录表 通行记录表 Mapper 接口
 * </p>
 *
 * @author xiaoluo
 * @since 2019-11-16
 */
@Repository
public interface SpPassRecordMapper extends BaseMapper<SpPassRecord> {


	List<PassRecordResultVo> selectRecordPage(Page<PassRecordResultVo> passRecordResultVoPage, @Param("conditionVo") ConditionVo conditionVo);
}
