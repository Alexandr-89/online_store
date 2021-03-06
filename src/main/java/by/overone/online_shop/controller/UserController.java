package by.overone.online_shop.controller;

import by.overone.online_shop.dao.UserDAO;
import by.overone.online_shop.dto.*;
import by.overone.online_shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;


    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") @Valid @Min(1) Long id){
        return userService.getUserById(id);
    }


    @GetMapping
    public List<UserDTO> findUsers(@RequestBody UserForGetDTO userForGetDTO){
        return userService.findUsers(userForGetDTO);
    }


    @GetMapping("/all")
    public List<UserAllInfoDTO> findUsersAllInfo(@RequestBody UserForGetDTO userForGetDTO){
        return userService.findUsersAllInfo(userForGetDTO);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@Validated @RequestBody UserRegistrationDTO userRegistrationDTO) {
        userService.addUser(userRegistrationDTO);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("id") @Valid @Min(1) Long id) {
        userService.deleteUser(id);
    }


    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateUser(@PathVariable("id") @Valid @Min(1) Long id, @Validated @RequestBody UserUpdateDTO userUpdateDTO) {
        userService.userUpdate(id, userUpdateDTO);
    }


    @PatchMapping("/details/{userId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateDetailsUser(@PathVariable("userId") @Valid @Min(1) Long userId, @Validated @RequestBody UserDetailUpdateDTO userDetailUpdateDTO) {
        userService.userDetailUpdate(userId, userDetailUpdateDTO);
    }

}
