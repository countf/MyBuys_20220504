package com.neuedu.service.impl;

import com.neuedu.dao.BrdBrandMapper;
import com.neuedu.entity.BrdBrand;
import com.neuedu.service.BrdBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("BrdBrand")
public class BrdBrandServiceImpl implements BrdBrandService {

    @Autowired
    private BrdBrandMapper brdBrandMapper;
    @Override
    public ArrayList<BrdBrand> getBrdBrands(int mid) {
        return  brdBrandMapper.selectByMId(mid);
    }

    @Override
    public int newBrdBrand(BrdBrand brdBrand) {
        return brdBrandMapper.insert(brdBrand);
    }

    @Override
    public int saveBrdBrand(BrdBrand brdBrand) {
        return brdBrandMapper.updateByPrimaryKey(brdBrand);
    }

    @Override
    public int changeSTSForBrdBrand(int bid, String sts) {

        return brdBrandMapper.updateSTSByBId(bid, sts);
    }
}
