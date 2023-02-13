package com.example.grocery.outservices.mernisValidator;

import com.example.grocery.core.utilities.exceptions.BusinessException;
import com.example.grocery.core.utilities.results.ErrorResult;
import com.example.grocery.core.utilities.results.Result;
import com.example.grocery.core.utilities.results.SuccessResult;
import com.example.grocery.core.validation.mernisValidation.MernisValidationService;
import com.example.grocery.entity.concretes.Employee;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MernisValidationServiceImpl implements MernisValidationService {

    @Override
    public Result validate(Employee employee) {

        return new SuccessResult();
    }
}
