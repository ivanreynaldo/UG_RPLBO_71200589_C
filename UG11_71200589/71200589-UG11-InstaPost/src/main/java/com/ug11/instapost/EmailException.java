package com.ug11.instapost;

public class EmailException extends Throwable {
    private String errorMessage;
    private int errorCode;

    public EmailException(int c){

    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
