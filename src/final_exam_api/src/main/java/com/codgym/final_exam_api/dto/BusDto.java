package com.codgym.final_exam_api.dto;

import com.codgym.final_exam_api.model.BusWareHouse;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BusDto implements Validator {
    private Integer busId;
    private Integer licensePlates;
    private String departurePosition;
    private String destination;
    private String phone;
    private String departureTime;
    private String destinationTime;
    private String busType;
    private BusWareHouse busWareHouse;


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

    public BusDto() {
    }

    public BusDto(Integer busId, Integer licensePlates, String departurePosition, String destination, String phone, String departureTime, String destinationTime, String busType, BusWareHouse busWareHouse) {
        this.busId = busId;
        this.licensePlates = licensePlates;
        this.departurePosition = departurePosition;
        this.destination = destination;
        this.phone = phone;
        this.departureTime = departureTime;
        this.destinationTime = destinationTime;
        this.busType = busType;
        this.busWareHouse = busWareHouse;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(Integer licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getDeparturePosition() {
        return departurePosition;
    }

    public void setDeparturePosition(String departurePosition) {
        this.departurePosition = departurePosition;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(String destinationTime) {
        this.destinationTime = destinationTime;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public BusWareHouse getBusWareHouse() {
        return busWareHouse;
    }

    public void setBusWareHouse(BusWareHouse busWareHouse) {
        this.busWareHouse = busWareHouse;
    }
}
