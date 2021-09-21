package com.heima.model.mappers.admin;

import com.heima.model.admin.pojos.AdChannel;

import java.util.List;

public interface AdChannelMapper {

    List<AdChannel> loadAdminsChannelList (AdChannel adChannel);
}
