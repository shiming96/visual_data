package edu.shu.service;

import javax.servlet.http.HttpServletRequest;

public interface KaptchaService {

    String createPicVerificationCode(String param, HttpServletRequest request);
}
