package com.example.prepractice.constant;

import lombok.Getter;

public enum ExceptionCode {

    USER_NOT_FOUND(404, "USER NOT FOUND"),
    USER_EXISTS(409, "USER EXISTS"),
    QUESTION_NOT_FOUND(404, "QUESTION NOT FOUND"),
    ANSWER_NOT_FOUND(404, "ANSWER NOT FOUND"),
    NOT_FOUND(404, "NOT FOUND"),
    UNAUTHORIZED_ACCESS(401, "UNAUTHORIZED ACCESS"),

    INTERNAL_SERVER_ERROR(500, "INTERNAL SERVER ERROR"),
    NOT_IMPLEMENTED(501,"NOT IMPLEMENTED"),
    EXPIRED_ACCESS_TOKEN(403, "EXPIRED ACCESS TOKEN"),
    EXPIRED_REFRESH_TOKEN(403,"EXPIRED REFRESH TOKEN"),
    OAUTH2_ACCESS_ERROR(400, "OAUTH2 ACCESS ERROR"),
    BAD_REQUEST(400, "BAD REQUEST");

    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}
