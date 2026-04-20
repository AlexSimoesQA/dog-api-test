package org.dog.com.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageEnum {

    BREED_NOT_FOUND("Breed not found (main breed does not exist)");

    private final String msg;
}
