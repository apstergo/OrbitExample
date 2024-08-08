package ru.apstegor.orbitexample.ui.components.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.apstegor.orbitexample.ui.models.UserDataVo

@Composable
fun UserCard(
    userDataVo: UserDataVo
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column {
            Text(modifier = Modifier.padding(vertical = 8.dp), text = userDataVo.surname)
            Text(modifier = Modifier.padding(vertical = 8.dp), text = userDataVo.name)
        }
        Column {
            Text(modifier = Modifier.padding(vertical = 8.dp), text = userDataVo.surname)
            Text(modifier = Modifier.padding(vertical = 8.dp), text = userDataVo.name)
        }
    }
}

@Preview
@Composable
fun UserCardPreview() {
    UserCard(userDataVo = UserDataVo(
        id = 7125,
        name = "Jaime Hull",
        surname = "Kristy Bowers",
        rating = 6096,
        imageUrl = null,
        members = 4191
    ))
}