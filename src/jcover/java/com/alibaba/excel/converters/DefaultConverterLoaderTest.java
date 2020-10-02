package com.alibaba.excel.converters;

import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.DefaultConverterLoader
 *
 * @author Diffblue Cover
 */

class DefaultConverterLoaderTest {

    @Test
    void loadDefaultWriteConverter() {
        Map<String, Converter> result =
             DefaultConverterLoader.loadDefaultWriteConverter();
        // pojo Converter result.get("[B")
        // pojo Converter result.get("[Ljava.lang.Byte;")
        // pojo Converter result.get("java.io.File")
        // pojo Converter result.get("java.io.InputStream")
        // pojo Converter result.get("java.lang.Boolean")
        // pojo Converter result.get("java.lang.Byte")
        // pojo Converter result.get("java.lang.Double")
        // pojo Converter result.get("java.lang.Float")
        // pojo Converter result.get("java.lang.Integer")
        // pojo Converter result.get("java.lang.Long")
        // pojo Converter result.get("java.lang.Short")
        // pojo Converter result.get("java.lang.String")
        // pojo Converter result.get("java.math.BigDecimal")
        // pojo Converter result.get("java.net.URL")
        // pojo Converter result.get("java.util.Date")
    }

    @Test
    void loadDefaultReadConverter() {
        Map<String, Converter> result =
             DefaultConverterLoader.loadDefaultReadConverter();
        // pojo Converter result.get("java.lang.Boolean-BOOLEAN")
        // pojo Converter result.get("java.lang.Boolean-NUMBER")
        // pojo Converter result.get("java.lang.Boolean-STRING")
        // pojo Converter result.get("java.lang.Byte-BOOLEAN")
        // pojo Converter result.get("java.lang.Byte-NUMBER")
        // pojo Converter result.get("java.lang.Byte-STRING")
        // pojo Converter result.get("java.lang.Double-BOOLEAN")
        // pojo Converter result.get("java.lang.Double-NUMBER")
        // pojo Converter result.get("java.lang.Double-STRING")
        // pojo Converter result.get("java.lang.Float-BOOLEAN")
        // pojo Converter result.get("java.lang.Float-NUMBER")
        // pojo Converter result.get("java.lang.Float-STRING")
        // pojo Converter result.get("java.lang.Integer-BOOLEAN")
        // pojo Converter result.get("java.lang.Integer-NUMBER")
        // pojo Converter result.get("java.lang.Integer-STRING")
        // pojo Converter result.get("java.lang.Long-BOOLEAN")
        // pojo Converter result.get("java.lang.Long-NUMBER")
        // pojo Converter result.get("java.lang.Long-STRING")
        // pojo Converter result.get("java.lang.Short-BOOLEAN")
        // pojo Converter result.get("java.lang.Short-NUMBER")
        // pojo Converter result.get("java.lang.Short-STRING")
        // pojo Converter result.get("java.lang.String-BOOLEAN")
        // pojo Converter result.get("java.lang.String-ERROR")
        // pojo Converter result.get("java.lang.String-NUMBER")
        // pojo Converter result.get("java.lang.String-STRING")
        // pojo Converter result.get("java.math.BigDecimal-BOOLEAN")
        // pojo Converter result.get("java.math.BigDecimal-NUMBER")
        // pojo Converter result.get("java.math.BigDecimal-STRING")
        // pojo Converter result.get("java.util.Date-NUMBER")
        // pojo Converter result.get("java.util.Date-STRING")
    }

    @Test
    void loadAllConverter() {
        Map<String, Converter> result =
             DefaultConverterLoader.loadAllConverter();
        // pojo Converter result.get("java.lang.Boolean-BOOLEAN")
        // pojo Converter result.get("java.lang.Boolean-NUMBER")
        // pojo Converter result.get("java.lang.Boolean-STRING")
        // pojo Converter result.get("java.lang.Byte-BOOLEAN")
        // pojo Converter result.get("java.lang.Byte-NUMBER")
        // pojo Converter result.get("java.lang.Byte-STRING")
        // pojo Converter result.get("java.lang.Double-BOOLEAN")
        // pojo Converter result.get("java.lang.Double-NUMBER")
        // pojo Converter result.get("java.lang.Double-STRING")
        // pojo Converter result.get("java.lang.Float-BOOLEAN")
        // pojo Converter result.get("java.lang.Float-NUMBER")
        // pojo Converter result.get("java.lang.Float-STRING")
        // pojo Converter result.get("java.lang.Integer-BOOLEAN")
        // pojo Converter result.get("java.lang.Integer-NUMBER")
        // pojo Converter result.get("java.lang.Integer-STRING")
        // pojo Converter result.get("java.lang.Long-BOOLEAN")
        // pojo Converter result.get("java.lang.Long-NUMBER")
        // pojo Converter result.get("java.lang.Long-STRING")
        // pojo Converter result.get("java.lang.Short-BOOLEAN")
        // pojo Converter result.get("java.lang.Short-NUMBER")
        // pojo Converter result.get("java.lang.Short-STRING")
        // pojo Converter result.get("java.lang.String-BOOLEAN")
        // pojo Converter result.get("java.lang.String-ERROR")
        // pojo Converter result.get("java.lang.String-NUMBER")
        // pojo Converter result.get("java.lang.String-STRING")
        // pojo Converter result.get("java.math.BigDecimal-BOOLEAN")
        // pojo Converter result.get("java.math.BigDecimal-NUMBER")
        // pojo Converter result.get("java.math.BigDecimal-STRING")
        // pojo Converter result.get("java.util.Date-NUMBER")
        // pojo Converter result.get("java.util.Date-STRING")
    }
}
