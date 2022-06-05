package com.company.springrest.rest.model.response;

import com.company.springrest.rest.model.dto.EmployeeDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private List<EmployeeDto> employees;
}
