package ru.apstegor.orbitexample.data.api

import ru.apstegor.orbitexample.data.models.UserDto

class ApiUsersImpl:ApiUsers {
    override suspend fun getAllUsers(): List<UserDto> {
        return getMockValues()
    }

    override suspend fun getCurrentUser(): UserDto {
        return UserDto(
            id = 1,
            name = "Гена",
            surname = "Боков",
            rating = 4992,
            imageUrl = "",
            members = 4077
        )
    }

    companion object{
        fun getMockValues():List<UserDto>{
            return listOf(
                UserDto(
                    id = 2,
                    name = "Gregorio Carr",
                    surname = "Doyle Cantu",
                    rating = 4100,
                    imageUrl = null,
                    members = 4573
                ),
                UserDto(
                    id = 3,
                    name = "Elmer Fuentes",
                    surname = "Irvin Zamora",
                    rating = 9501,
                    imageUrl = null,
                    members = 4026
                ),
                UserDto(
                    id = 4,
                    name = "Daphne Sheppard",
                    surname = "Jerry McMahon",
                    rating = 6968,
                    imageUrl = null,
                    members = 4333
                ),
                UserDto(
                    id = 5,
                    name = "Viola Cash",
                    surname = "Tamika Good",
                    rating = 8950,
                    imageUrl = null,
                    members = 7455
                )
            )
        }
    }
}