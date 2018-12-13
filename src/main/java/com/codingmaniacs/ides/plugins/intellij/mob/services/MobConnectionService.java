package com.codingmaniacs.ides.plugins.intellij.mob.services;

import com.intellij.openapi.components.ServiceManager;

public interface MobConnectionService {
    static MobConnectionService getInstance() {
        return ServiceManager.getService(MobConnectionService.class);
    }
}
