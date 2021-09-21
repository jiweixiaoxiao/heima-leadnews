package com.heima.admin.service.impl;

import com.heima.admin.service.AdChannelService;
import com.heima.model.admin.pojos.AdChannel;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.common.enums.AppHttpCodeEnum;
import com.heima.model.mappers.admin.AdChannelMapper;
import com.heima.model.user.pojos.ApUserArticleList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdChannelServiceImpl implements AdChannelService {

    @Autowired
    private AdChannelMapper adChannelMapper;
    @Override
    public ResponseResult load(AdChannel dto) {
        //如果为空则设置默认的值
        if (dto == null){
            dto = new AdChannel();
            dto.setIsDefault(true);
            dto.setStatus(true);
        }
        if (dto.getStatus() == null){
            dto.setStatus(true);
        }
        if (dto.getIsDefault() == null){
            dto.setIsDefault(true);
        }
        List<AdChannel> list = adChannelMapper.loadAdminsChannelList(dto);
        if (!list.isEmpty() && list.size() > 0){
            return ResponseResult.okResult(list);
        }
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR);
    }
}
