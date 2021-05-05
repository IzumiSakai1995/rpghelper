package com.lz.rhapi.character.service;

import com.lz.rhapi.common.Res;
import org.springframework.stereotype.Component;

@Component
public interface CharacterService {
    Res characterQuery(String cId);
}
