package com.heima.model.mappers.app;

import com.heima.model.behavior.pojos.ApBehaviorEntry;
import org.apache.ibatis.annotations.Param;
@SuppressWarnings("all")
public interface ApBehaviorEntryMapper {
    ApBehaviorEntry selectByUserIdOrEquipment(@Param("userId") Long userId, @Param("equipmentId") Integer equipmentId);
}
