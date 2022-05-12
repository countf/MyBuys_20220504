package com.neuedu.service.impl;

import com.neuedu.dao.TbPicturesMapper;
import com.neuedu.entity.TbPictures;
import com.neuedu.service.PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("picturesService")
public class PicturesServiceImpl implements PicturesService {

    @Autowired
    private TbPicturesMapper tbPicturesMapper;

    @Override
    public TbPictures selectImagePath(String picturesId) {
        return tbPicturesMapper.selectByPrimaryKey(picturesId);
    }

    @Override
    public void insertImager(TbPictures tbPictures) {
        tbPicturesMapper.insert(tbPictures);
    }

    @Override
    public void deleteImage(String picturesId) {
        tbPicturesMapper.deleteByPrimaryKey(picturesId);
    }

    @Override
    public void updateImage(TbPictures tbPictures) {
        tbPicturesMapper.updateByPrimaryKey(tbPictures);
    }
}
