package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.ActivityRemark;

import java.util.List;

public interface ActivityRemarkMapper {

    int deleteByPrimaryKey(String id);

    int insert(ActivityRemark record);


    int insertSelective(ActivityRemark record);


    ActivityRemark selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(ActivityRemark record);


    int updateByPrimaryKey(ActivityRemark record);

    /**
     * 根据activityId查询该市场活动下所有备注的明细信息
     * @param activityId
     * @return
     */
    List<ActivityRemark> selectActivityRemarkForDetailByActivityId(String activityId);

    /**
     * 保存创建的市场活动备注
     * @param remark
     * @return
     */
    int insertActivityRemark(ActivityRemark remark);
}