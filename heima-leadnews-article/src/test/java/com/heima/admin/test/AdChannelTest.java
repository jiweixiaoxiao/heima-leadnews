package com.heima.admin.test;

import com.heima.AdminJarApplication;
import com.heima.admin.service.AdChannelService;
import com.heima.model.admin.pojos.AdChannel;
import com.heima.model.common.dtos.ResponseResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = AdminJarApplication.class)
@RunWith(SpringRunner.class)
@SuppressWarnings("all")
public class AdChannelTest {

    @Autowired
    private AdChannelService adChannelService;

    @Test
    public void testAdChannel(){
        AdChannel adChannel = new AdChannel();
        adChannel.setIsDefault(true);
        adChannel.setStatus(true);
        ResponseResult result = adChannelService.load(adChannel);
        System.out.println("-------------- " + result.getData() + " --------------");
    }
}
