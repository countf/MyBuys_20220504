package com.neuedu.service;

import com.neuedu.entity.TbPictures;

public interface PicturesService {

    public TbPictures selectImagePath(String picturesId);

    public void insertImager(TbPictures tbPictures);

    public void deleteImage(String picturesId);

    public void updateImage(TbPictures tbPictures);
}
