package com.haochang.service;

import com.baomidou.mybatisplus.service.IService;
import com.haochang.commons.result.PageInfo;
import com.haochang.model.SysLog;

/**
 *
 * SysLog 表数据服务层接口
 *
 */
public interface ISysLogService extends IService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);

}