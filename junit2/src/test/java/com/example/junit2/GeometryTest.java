package com.example.junit2;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeometryTest {

    private Geometry geometry;

    @BeforeEach
    public void activate() {
        geometry = new Geometry();
    }

    @AfterEach
    public void shutdown() {
        geometry = null;
    }

    @Test
    public void externalAngleTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            geometry.externalAngle(3);
        });
    }

    @Test
    public void internalAngleTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            geometry.internalAngle(7);
        });
    }

    @Test
    public void totalInternalAngleTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            geometry.totalInternalAngle(7);
        });
    }
}
