package com.family.tree.dto;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

public class CommonUtils {

	private CommonUtils() {
	}

	public static <T> GenericResponse<T> getHttpResponse(Map<String, String> errors, T data, HttpStatus status) {
		GenericResponse<T> genericResponse = new GenericResponse<>();
		genericResponse.setError(!MapUtils.isEmpty(errors));
		genericResponse.setErrors(errors);
		genericResponse.setStatus(status.value());
		genericResponse.setBody(data);
		return genericResponse;
	}

	public static <T> GenericResponse<T> getHttpResponse(Map<String, String> errors, T data, HttpStatus status,
		Map<String, Object> pageNationInfo) {
		GenericResponse<T> genericResponse = new GenericResponse<>();
		genericResponse.setError(!MapUtils.isEmpty(errors));
		genericResponse.setErrors(errors);
		genericResponse.setStatus(status.value());
		genericResponse.setBody(data);
		genericResponse.setPageable(pageNationInfo);
		return genericResponse;
	}

	public static Map<String, Object> pageNationUtilityBuilder(Page<?> page) {
		Map<String, Object> response = new HashMap<>();
		response.put("currentPage", page.getNumber());
		response.put("totalRecords", page.getTotalElements());
		response.put("totalPages", page.getTotalPages());
		return response;
	}
}
