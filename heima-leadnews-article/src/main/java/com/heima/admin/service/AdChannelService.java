package com.heima.admin.service;

import com.heima.model.admin.pojos.AdChannel;
import com.heima.model.common.dtos.ResponseResult;

public interface AdChannelService {
    /**
     *
     * @param dto 封装数据
     * @return 数据列表
     */
    public ResponseResult load(AdChannel dto);
}
