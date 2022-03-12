package com.myphotos.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myphotos.demo.model.Photo;

@Repository
public interface IPhotoRepository extends CrudRepository<Photo, Integer> {

}
