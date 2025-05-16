package com.skkutable.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReservationRequestDTO {
    private Long userId;
    private Long boothId;
    private LocalDateTime reservationTime;
    private int numberOfPeople;
}
