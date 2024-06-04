package ru.bft.insurer.service;

import org.springframework.stereotype.Service;
import ru.bft.insurer.config.ApplicationContextHolder;
import ru.bft.insurer.entity.Insurer;
import ru.bft.insurer.model.GetInsurerDataResponse;
import ru.bft.insurer.repository.InsurerRepository;


import java.util.List;

@Service
public class InsurerServiceImpl implements InsurerService {

    @Override
    public GetInsurerDataResponse getInsurerData(String regNum) {
        GetInsurerDataResponse response = new GetInsurerDataResponse();
        InsurerRepository insurerRepository = ApplicationContextHolder.getContext().getBean(InsurerRepository.class);

        List<Insurer> insurerList = insurerRepository.getByRegNum(regNum);
        if (insurerList.size() != 0) {
            response.setRegNum(insurerList.get(0).getRegNum());
            response.setRegNumPf(insurerList.get(0).getRegNumPf());
            response.setState(insurerList.get(0).getState());
            response.setFssDepartmentCode(insurerList.get(0).getFssDepartmentCode());
        } else {
            response.setErrorText("Insurer not found by regNum " + regNum);
        }
        return response;
    }
}
