package com.lz.rhapi.character.service;

import com.lz.rh.common.core.api.Res;
import org.springframework.stereotype.Component;

@Component
public interface CharacterService {
    Res characterQuery(String cId);
}
