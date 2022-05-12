package com.neuedu.service;

import com.neuedu.entity.BrdBrand;
import com.neuedu.entity.ManManufacturer;

import java.util.ArrayList;

public interface BrdBrandService {

    public ArrayList<BrdBrand> getBrdBrands(int mid);

    public int newBrdBrand(BrdBrand brdBrand);

    public int saveBrdBrand(BrdBrand brdBrand);

    public int changeSTSForBrdBrand(int bid,String sts);
}
