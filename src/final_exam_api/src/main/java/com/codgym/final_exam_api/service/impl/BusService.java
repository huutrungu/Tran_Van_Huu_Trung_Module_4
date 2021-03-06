package com.codgym.final_exam_api.service.impl;

import com.codgym.final_exam_api.model.Bus;
import com.codgym.final_exam_api.repository.IBusRepository;
import com.codgym.final_exam_api.service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IBusService {
    @Autowired
    private IBusRepository iBusRepository;

    @Override
    public List<Bus> findAllBus() {
        return iBusRepository.findAll();
    }

    @Override
    public Bus save(Bus bus) {
        return iBusRepository.save(bus);
    }

    @Override
    public Bus findById(int id) {
        return this.iBusRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        this.iBusRepository.deleteById(id);
    }

    @Override
    public List<Bus> searchBy(String name, String id) {
        if (id.equals("")) {
            return this.iBusRepository.findAllByBusWareHouse_BusWareHouseNameContaining(name);
        } else {
            return this.iBusRepository.findAllByBusWareHouse_BusWareHouseNameContainingAndBusWareHouse_BusWareHouseId
                    (name, Integer.parseInt(id));

        }
    }
}
//    @Override
//    public Page<Bus> getAllBus(Pageable pageable) {
//        return this.iBusRepository.getAllBus(pageable);
//    }


