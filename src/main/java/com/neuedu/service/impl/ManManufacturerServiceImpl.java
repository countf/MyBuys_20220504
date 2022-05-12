package com.neuedu.service.impl;

import com.neuedu.dao.ManManufacturerMapper;
import com.neuedu.entity.ManManufacturer;
import com.neuedu.service.ManManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("manManufacturerService")
public class ManManufacturerServiceImpl implements ManManufacturerService {

    @Autowired
    private ManManufacturerMapper manManufacturerMapper;

    @Override
    public ManManufacturer getManManufacturer(int mid) {
        return manManufacturerMapper.selectByPrimaryKey(mid);
    }

    @Override
    public int newManManufacturer(ManManufacturer manManufacturer) {
        return manManufacturerMapper.insert(manManufacturer);
    }

    @Override
    public int saveManManufacturer(ManManufacturer manManufacturer) {
        return manManufacturerMapper.updateByPrimaryKey(manManufacturer);
    }
}
