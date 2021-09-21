package com.heima.article.apis;

import com.heima.model.admin.pojos.AdChannel;
import com.heima.model.common.dtos.ResponseResult;

public interface AdminChanelControllerApi {
    /**
     * 1 ：获取所有频道列表
     * 2 ： 添加用户频道
     */

    /**
     * 加載频道列表
     * @return 频道列表数据
     */
    ResponseResult load(AdChannel channel);


    /**
     * 添加用户频道
     * @param dto 封装参数对象
     * @return 添加状态
     */
}
