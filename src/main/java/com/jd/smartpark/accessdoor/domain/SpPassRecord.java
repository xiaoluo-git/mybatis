package com.jd.smartpark.accessdoor.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 通行记录表 通行记录表
 * </p>
 *
 * @author xiaoluo
 * @since 2019-11-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class SpPassRecord implements Serializable {

    private static final long serialVersionUID=1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    private Integer deviceId;

    private Integer userId;

    private Date createTime;

    private String faceUrl;

    private Integer passStatus;

    private String userName;


}
