package com.example.upbit_api.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.ArrayList;
import java.util.List;

@Component
public class MinuteCandleValidator implements Validator {

    private List<Integer> allowedUnites = new ArrayList<>();

    MinuteCandleValidator() {
        allowedUnites.add(1);
        allowedUnites.add(3);
        allowedUnites.add(5);
        allowedUnites.add(10);
        allowedUnites.add(15);
        allowedUnites.add(30);
        allowedUnites.add(60);
        allowedUnites.add(240);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(Integer.class);
    }

    @Override
    public void validate(Object target, Errors errors){
        Integer unit = (Integer) target;

        if(!allowedUnites.contains(unit)){
            errors.rejectValue("unit","invalid unit");
        }
    }

}
