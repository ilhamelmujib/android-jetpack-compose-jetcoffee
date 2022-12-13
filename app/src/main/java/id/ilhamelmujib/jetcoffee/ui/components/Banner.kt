package id.ilhamelmujib.jetcoffee.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ilhamelmujib.jetcoffee.R
import id.ilhamelmujib.jetcoffee.ui.theme.JetCoffeeTheme

@Composable
fun Banner(
    modifier: Modifier = Modifier
) {

    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(160.dp)
        )
        SearchBar()
    }

}

@Preview
@Composable
fun BannerPreview() {
    JetCoffeeTheme {
        Banner()
    }
}