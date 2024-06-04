package com.example.parcialtp3.entities

data class SearchParameters(
    val arrival_id: String,
    val departure_id: String,
    val engine: String,
    val gl: String,
    val hl: String,
    val outbound_date: String,
    val return_date: String
)