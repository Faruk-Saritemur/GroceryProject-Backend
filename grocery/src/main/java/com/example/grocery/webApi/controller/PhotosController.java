package com.example.grocery.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.grocery.business.abstracts.PhotoService;
import com.example.grocery.core.utilities.results.DataResult;
import com.example.grocery.core.utilities.results.Result;
import com.example.grocery.webApi.responses.image.GetAllImageResponse;
import com.example.grocery.webApi.responses.image.GetByIdImageResponse;
import com.example.grocery.webApi.responses.image.GetByUrlImageResponse;

@RestController
@RequestMapping("/api/image")
public class PhotosController {

    @Autowired
    private PhotoService photoService;

    @PostMapping("/add")
    public ResponseEntity<Result> add(MultipartFile file) {
        return ResponseEntity.ok(photoService.upload(file));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Result> delete(String imageUrl) {
        return ResponseEntity.ok(photoService.delete(imageUrl));
    }

    @PutMapping("/update")
    public ResponseEntity<Result> update(Long id, MultipartFile file) {
        return ResponseEntity.ok(photoService.update(id, file));
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<GetAllImageResponse>>> getAll() {
        return new ResponseEntity<>(this.photoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getbyid")
    public ResponseEntity<DataResult<GetByIdImageResponse>> getById(@RequestParam Long id) {
        return new ResponseEntity<>(this.photoService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/getbyurl")
    public ResponseEntity<DataResult<GetByUrlImageResponse>> getById(@RequestParam String imageUrl) {
        return new ResponseEntity<>(this.photoService.getByUrl(imageUrl), HttpStatus.OK);
    }

    @GetMapping("/getlistbysorting")
    public ResponseEntity<DataResult<List<GetAllImageResponse>>> getListBySorting(
            @RequestParam(defaultValue = "id") String sortBy) {
        return ResponseEntity.ok(photoService.getListBySorting(sortBy));
    }

    @GetMapping("/getlistbypagination")
    public ResponseEntity<DataResult<List<GetAllImageResponse>>> getListByPagination(
            @RequestParam(defaultValue = "0") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        return ResponseEntity.ok(photoService.getListByPagination(pageNo, pageSize));
    }

    @GetMapping("/getlistbypaginationandsorting")
    public ResponseEntity<DataResult<List<GetAllImageResponse>>> getListByPaginationAndSorting(
            @RequestParam(defaultValue = "0") int pageNo, @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortBy) {
        return ResponseEntity.ok(photoService.getListByPaginationAndSorting(pageNo, pageSize, sortBy));
    }
}
