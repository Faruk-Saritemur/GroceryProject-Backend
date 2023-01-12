package com.example.grocery.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocery.business.abstracts.CustomerService;
import com.example.grocery.business.constants.Messages.ErrorMessages;
import com.example.grocery.business.constants.Messages.GetByIdMessages;
import com.example.grocery.business.constants.Messages.GetListMessages;
import com.example.grocery.core.utilities.exceptions.BusinessException;
import com.example.grocery.core.utilities.mapper.MapperService;
import com.example.grocery.core.utilities.results.DataResult;
import com.example.grocery.core.utilities.results.SuccessDataResult;
import com.example.grocery.dataAccess.abstracts.CustomerRepository;
import com.example.grocery.entity.concretes.Customer;
import com.example.grocery.webApi.responses.customer.GetAllCustomerResponse;
import com.example.grocery.webApi.responses.customer.GetByIdCustomerResponse;

@Service
public class CustomerManager implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private MapperService mapperService;

    @Override
    public DataResult<List<GetAllCustomerResponse>> getAll() {
        List<Customer> inDbCustomers = customerRepository.findAll();
        List<GetAllCustomerResponse> returnList = inDbCustomers.stream()
                .map(c -> mapperService.getModelMapper().map(c, GetAllCustomerResponse.class)).toList();
        return new SuccessDataResult<List<GetAllCustomerResponse>>(returnList, GetListMessages.CUSTOMERS_LISTED);
    }

    @Override
    public DataResult<GetByIdCustomerResponse> getById(int id) {
        Customer inDbCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new BusinessException(ErrorMessages.ID_NOT_FOUND));
        GetByIdCustomerResponse returnObj = mapperService.getModelMapper().map(inDbCustomer,
                GetByIdCustomerResponse.class);
        return new SuccessDataResult<GetByIdCustomerResponse>(returnObj, GetByIdMessages.CUSTOMER_LISTED);
    }
}