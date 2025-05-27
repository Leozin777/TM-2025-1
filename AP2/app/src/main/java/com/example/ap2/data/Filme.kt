package com.example.ap2.data

import java.io.Serializable

data class Filme(
    val id: Int,
    val titulo: String,
    val diretor: String,
    val anoLancamento: Int,
    val sinopse: String
) : Serializable