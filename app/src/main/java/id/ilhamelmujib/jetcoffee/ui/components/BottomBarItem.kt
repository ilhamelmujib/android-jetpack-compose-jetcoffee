package id.ilhamelmujib.jetcoffee.ui.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import id.ilhamelmujib.jetcoffee.model.navigationItems
import id.ilhamelmujib.jetcoffee.ui.theme.JetCoffeeTheme
import id.ilhamelmujib.jetcoffee.ui.theme.LightGray

@Composable
fun BottomBarItem(
    modifier: Modifier = Modifier
) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.primary,
        modifier = modifier
    ) {
        navigationItems.map {
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = stringResource(it.title)
                    )
                },
                label = {
                    Text(stringResource(it.title))
                },
                selected = it.icon == navigationItems[0].icon,
                unselectedContentColor = LightGray,
                onClick = { })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarItemPreview() {
    JetCoffeeTheme {
        BottomBarItem()
    }
}