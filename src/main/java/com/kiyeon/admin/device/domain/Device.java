package com.kiyeon.admin.device.domain;

import com.kiyeon.admin.device.BaseAuditingEntity;
import com.kiyeon.admin.device.domain.enumerated.Platform;
import com.kiyeon.admin.device.domain.enumerated.DeviceType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Device extends BaseAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long serialNo;

    @Enumerated(value = EnumType.STRING)
    private Platform platform;

    @Enumerated(value = EnumType.STRING)
    private DeviceType type;

    private boolean isRental;

}
