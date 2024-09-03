package com.weatherforecasting.weatherforecasting.service;

import com.weatherforecasting.weatherforecasting.remote.DTO.prevision.GetPrevisionDTO;

public interface PrevisionService {
    GetPrevisionDTO getPrevisionByCity(String city);
}
