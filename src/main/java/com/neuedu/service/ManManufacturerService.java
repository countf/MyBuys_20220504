package com.neuedu.service;

import com.neuedu.entity.ManManufacturer;

public interface ManManufacturerService {

    public ManManufacturer getManManufacturer(int mid);

    public int newManManufacturer(ManManufacturer manManufacturer);

    public int saveManManufacturer(ManManufacturer manManufacturer);

    public int inserManManufacturer(ManManufacturer manManufacturer);
}
