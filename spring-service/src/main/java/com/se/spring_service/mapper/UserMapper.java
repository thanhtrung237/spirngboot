package com.se.spring_service.mapper;

import com.se.spring_service.dto.request.UserCreationRequest;
import com.se.spring_service.dto.request.UserUpdateRequest;
import com.se.spring_service.dto.response.UserResponse;
import com.se.spring_service.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
    UserResponse toUserResponse(User user);
}
