package com.shield.pay.shieldpayservice.infrastructure.util;

import java.lang.reflect.Field;

public class Mapper {


    public static <T, U> U map(T source, Class<U> destinationClass) {
        try {
            U destination = destinationClass.getDeclaredConstructor().newInstance();
            for (Field sourceField : source.getClass().getDeclaredFields()) {
                sourceField.setAccessible(true);
                try {
                    Field destinationField = destinationClass.getDeclaredField(sourceField.getName());
                    destinationField.setAccessible(true);
                    destinationField.set(destination, sourceField.get(source));
                } catch (NoSuchFieldException e) {
                    new RuntimeException();
                }
            }
            return destination;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao mapear objetos", e);
        }
    }



}
