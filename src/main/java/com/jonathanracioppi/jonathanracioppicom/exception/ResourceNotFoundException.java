package com.jonathanracioppi.jonathanracioppicom.exception;

import java.io.Serial;

public class ResourceNotFoundException extends Exception {

    @Serial
    private static final long serialVersionUID = 1926897332292568039L;

    public ResourceNotFoundException(String str){
        super(str);
    }

}
