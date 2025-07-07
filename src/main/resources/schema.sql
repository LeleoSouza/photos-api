create table if not exists photoz(
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     file_name varchar(255),
     content_type varchar(255),
     data binary
);