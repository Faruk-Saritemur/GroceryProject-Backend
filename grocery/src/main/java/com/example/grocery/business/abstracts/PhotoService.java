package com.example.grocery.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.grocery.core.utilities.results.DataResult;
import com.example.grocery.core.utilities.results.Result;
import com.example.grocery.entity.concretes.Image;
import com.example.grocery.webApi.responses.image.GetAllImageResponse;
import com.example.grocery.webApi.responses.image.GetByIdImageResponse;
import com.example.grocery.webApi.responses.image.GetByUrlImageResponse;

public interface PhotoService {

    DataResult<?> upload(MultipartFile file);

    Result delete(String imageUrl);

    DataResult<?> update(Long id, MultipartFile file);

    DataResult<List<GetAllImageResponse>> getAll();

    DataResult<GetByIdImageResponse> getById(Long id);

    DataResult<GetByUrlImageResponse> getByUrl(String imageUrl);

    Image getImageById(Long id);

    List<Image> getImagesByIds(Long[] imageId);

}