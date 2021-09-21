package com.heima.admin.controller.v1;

import com.heima.admin.service.AdChannelService;
import com.heima.article.apis.AdminChanelControllerApi;
import com.heima.model.admin.pojos.AdChannel;
import com.heima.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/channels")
public class AdminChanelController implements AdminChanelControllerApi {

    @Autowired
    private AdChannelService adChannelService;

    @Override
    @GetMapping("/load")
    public ResponseResult load(AdChannel channel) {
        return adChannelService.load(channel);
    }
}
