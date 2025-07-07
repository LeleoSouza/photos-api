package com.migoinc.photozclone.services;

import com.migoinc.photozclone.model.Photo;
import com.migoinc.photozclone.repository.PhotozRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//@Component
@Service
public class PhotoService {
    private final PhotozRepository photozRepository;

    public PhotoService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
         photozRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setFile(data);
        photozRepository.save(photo);
        return photo;
    }


}
