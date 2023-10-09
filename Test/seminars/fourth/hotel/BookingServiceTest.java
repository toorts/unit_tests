package seminars.fourth.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class BookingServiceTest {
    @Test
    void roomAvailableTest() {

        HotelService mockHotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(mockHotelService);
        when(mockHotelService.isRoomAvailable(2)).thenReturn(true);

        assertTrue(bookingService.bookRoom(2));
        verify(mockHotelService, times(1)).isRoomAvailable(2);
    }

}