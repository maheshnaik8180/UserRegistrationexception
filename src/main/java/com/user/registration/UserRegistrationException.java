package com.user.registration;




public class UserRegistrationException extends Exception
{

    public ExceptionType type;

    public enum ExceptionType {
        EmptyEnter, NullEnter
    }
    public UserRegistrationException(String message,ExceptionType type)
    {
        super(message);
        this.type= type;
    }
}
