package com.hanyang.service;

import com.hanyang.domain.ResponseResult;
import com.hanyang.domain.User;

/**
 * ClassName: LoginService
 * Package: com.hanyang.service
 * Description:
 *
 * @Author: renkelin
 * @Create: 2023/6/4 - 16:44
 * @Version: v1.0
 */
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
