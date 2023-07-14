package org.pt.flightbooking.data.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FLIGHT_RECORDS", schema="public")
public class FlightRecord {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "FLY_TO")
	private String flyTo;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "DATE_TO")
	private String dateTo;

	@Column(name = "DATE_FROM")
	private String dateFrom;

	@Column(name = "RECORD_DATE_TIME")
	private LocalDateTime recordDateTime;

}