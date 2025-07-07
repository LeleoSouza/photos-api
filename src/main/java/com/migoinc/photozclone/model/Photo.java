package com.migoinc.photozclone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("PHOTOZ")
public class Photo {

    @Id
    private Integer id ;

    @NotEmpty
    private String fileName;

    @JsonIgnore
    private byte[] data;

    private String contentType;

    public Photo() {
    }

    //raw data

    public byte[] getFile() {
        return data;
    }

    public void setFile(byte[] data) {
        this.data = data;
    }

    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
