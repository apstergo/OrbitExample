package ru.apstegor.orbitexample.data.models

import ru.apstegor.orbitexample.ui.models.UserDataVo

data class UserDto(
    val id: Int,
    val name: String,
    val surname: String,
    val rating: Int,
    val imageUrl: String?,
    val members: Int,
) {

    fun transform(): UserDataVo {
        return UserDataVo(
            id = id,
            name = name,
            surname = surname,
            rating = rating,
            imageUrl = imageUrl,
            members = members
        )
    }
}
