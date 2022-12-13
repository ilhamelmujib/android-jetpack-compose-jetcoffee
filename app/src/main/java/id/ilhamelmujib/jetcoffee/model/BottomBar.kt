package id.ilhamelmujib.jetcoffee.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import id.ilhamelmujib.jetcoffee.R

data class BottomBar(@StringRes val title: Int, val icon: ImageVector)

val navigationItems = listOf(
    BottomBar(
        title = R.string.menu_home,
        icon = Icons.Default.Home
    ),
    BottomBar(
        title = R.string.menu_favorite,
        icon = Icons.Default.Favorite
    ),
    BottomBar(
        title = R.string.menu_profile,
        icon = Icons.Default.AccountCircle
    ),
)