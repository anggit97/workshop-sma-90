package com.anggitprayogo.alchemist


/**
 * Created by Anggit Prayogo on 14,November,2020
 * GitHub : https://github.com/anggit97
 */
data class DataExample(
    val gambar: Int,
    val namaUnsur: String
)

object DataGenerator {

    fun generateData(): List<DataExample> {
        val list = mutableListOf<DataExample>()
        for (i in 0..10) {
            list.add(
                DataExample(R.drawable.ic_logo, "Unsur $i")
            )
        }
        return list
    }
}