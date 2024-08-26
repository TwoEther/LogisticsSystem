package com.java.system.service;

import com.java.system.domain.Storage;
import com.java.system.repository.StorageRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StorageService {
    private StorageRepository storageRepository;

    public StorageService(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    // 창고를 생성 하는 로직
}

