package id.ilhamelmujib.jetcoffee.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import id.ilhamelmujib.jetcoffee.R
import id.ilhamelmujib.jetcoffee.model.dummyBestSellerMenu
import id.ilhamelmujib.jetcoffee.model.dummyCategory
import id.ilhamelmujib.jetcoffee.model.dummyMenu
import id.ilhamelmujib.jetcoffee.ui.theme.JetCoffeeTheme

@Composable
fun HomeSection(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        SectionText(title, modifier)
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun HomeSectionPreview() {
    JetCoffeeTheme {
        Column {
            HomeSection(
                title = stringResource(R.string.section_category),
                content = { CategoryRow(dummyCategory) }
            )
            HomeSection(
                title = stringResource(R.string.section_favorite_menu),
                content = { MenuRow(dummyMenu) }
            )
            HomeSection(
                title = stringResource(R.string.section_best_seller_menu),
                content = { MenuRow(dummyBestSellerMenu) }
            )
        }
    }
}