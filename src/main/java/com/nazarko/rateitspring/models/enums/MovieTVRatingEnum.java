package com.nazarko.rateitspring.models.enums;

public enum MovieTVRatingEnum {

    ALL_AUDIENCE(0),
    OLDER_THAN_12(12),
    OLDER_THAN_16(16),
    OLDER_THAN_18(18);

    private final int value;

    MovieTVRatingEnum(final int value) {
        this.value = value;
    }

    public int getValue() { return value; }
}
