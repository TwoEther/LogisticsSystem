package com.java.system.service;

import com.java.system.domain.Storage;
import com.java.system.repository.StorageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StorageServiceTest {
    @Autowired
    private StorageRepository storageRepository;


    @Test
    public void 창고_추가로직() {
        // 중복된 창고가 없으면 추가
        Storage storage = new Storage(23425897, "s1",100,true);
        storageRepository.save(storage);

        Storage anotherStorage = new Storage(34235, "s2",100,true);
        Storage duplicatedStorage = new Storage(23425897, "s1",100,true);

        storageRepository.save(anotherStorage);
        storageRepository.save(duplicatedStorage);
    }
}