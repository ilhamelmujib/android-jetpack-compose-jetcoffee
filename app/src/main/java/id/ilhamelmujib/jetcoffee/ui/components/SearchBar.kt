package id.ilhamelmujib.jetcoffee.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ilhamelmujib.jetcoffee.R
import id.ilhamelmujib.jetcoffee.ui.theme.JetCoffeeTheme

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    var search by rememberSaveable{ mutableStateOf("")}

    TextField(
        value = search,
        onValueChange = { text -> search = text },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface,
            disabledIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .heightIn(48.dp)
            .clip(RoundedCornerShape(16.dp))

    )
}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    JetCoffeeTheme {
        SearchBar()
    }
}