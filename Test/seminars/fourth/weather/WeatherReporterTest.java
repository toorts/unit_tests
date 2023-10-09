package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class WeatherReporterTest {

    @Test
    void takeReportTest() {
        // Arrange
        WeatherService mockWeatherService = mock(WeatherService.class);
        WeatherReporter reporter = new WeatherReporter(mockWeatherService);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(15);

        // Act
        String res = reporter.generateReport();

        // Assert
        assertEquals("Текущая температура: 15 градусов.", res);
        verify(mockWeatherService, times(1)).getCurrentTemperature();
    }
    
}