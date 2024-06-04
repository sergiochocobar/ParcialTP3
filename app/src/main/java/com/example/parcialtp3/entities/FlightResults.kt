package com.example.parcialtp3.entities

data class FlightResults(
    val airline: String,
    val airline_logo: String,
    val airplane: String,
    val arrival_airport: ArrivalAirport,
    val departure_airport: DepartureAirport,
    val duration: Int,
    val extensions: List<String>,
    val flight_number: String,
    val legroom: String,
    val often_delayed_by_over_30_min: Boolean,
    val overnight: Boolean,
    val travel_class: String,
    val price: Int,
)