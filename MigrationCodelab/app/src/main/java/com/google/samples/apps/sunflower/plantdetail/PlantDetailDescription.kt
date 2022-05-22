package com.google.samples.apps.sunflower.plantdetail

import android.text.Html
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat
import com.google.android.material.composethemeadapter.MdcTheme
import com.google.samples.apps.sunflower.R
import com.google.samples.apps.sunflower.data.Plant
import com.google.samples.apps.sunflower.viewmodels.PlantDetailViewModel

@Composable
fun PlantDetailDescription(plantDetailViewModel: PlantDetailViewModel) {
    val plant by plantDetailViewModel.plant.observeAsState()
    plant?.let {
        PlantDetailContent(it)
    }
}

@Composable
fun PlantDetailContent(plant: Plant) {
    Surface {
        Column(modifier = Modifier.padding(all = dimensionResource(id = R.dimen.margin_normal))) {
            PlantName(name = plant.name)
            PlantWatering(wateringInterval = plant.wateringInterval)
            PlantDescription(description = plant.description)
        }
    }
}

@Preview
@Composable
fun PlantDetailContentPreview() {
    val plant = Plant("id", "Apple", description = "HTML<br><br>description", 3, 30, "")
    MdcTheme {
        PlantDetailContent(plant = plant)
    }
}

@Composable
fun PlantName(name: String) {
    Text(
        text = name,
        style = MaterialTheme.typography.h5,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = dimensionResource(id = R.dimen.margin_small))
            .wrapContentWidth(Alignment.CenterHorizontally)
    )
}

@Preview
@Composable
private fun PlantNamePreview() {
    MdcTheme {
        PlantName(name = "Apple ")
    }
}


@Composable
private fun PlantWatering(wateringInterval: Int) {
    Column(modifier = Modifier.fillMaxWidth()) {
        val centerPaddingModifier = Modifier
            .padding(horizontal = dimensionResource(id = R.dimen.margin_small))
            .align(Alignment.CenterHorizontally)
        val normalPadding = dimensionResource(id = R.dimen.margin_normal)

        Text(
            text = stringResource(id = R.string.watering_needs_prefix),
            color = MaterialTheme.colors.primaryVariant,
            fontWeight = FontWeight.Bold,
            modifier = centerPaddingModifier
                .padding(top = normalPadding)
        )

        val wateringIntervalText = LocalContext.current.resources.getQuantityString(
            R.plurals.watering_needs_suffix,
            wateringInterval,
            wateringInterval
        )

        Text(
            text = wateringIntervalText,
            modifier = centerPaddingModifier.padding(bottom = normalPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PlantWateringPreview() {
    MdcTheme {
        PlantWatering(wateringInterval = 3)
    }
}

@Composable
private fun PlantDescription(description: String) {
    // Remembers the HTML formatted description. Re-executes on a new description
    val htmlDescription = remember(description) {
        Html.fromHtml(description, HtmlCompat.FROM_HTML_MODE_COMPACT)
    }

    AndroidView(factory = { context ->
        TextView(context).apply {
            movementMethod = LinkMovementMethod.getInstance()
        }
    }, update = { it.text = htmlDescription })
}

@Preview
@Composable
private fun PlanDescriptionPreview() {
    MdcTheme {
        PlantDescription(description = "HTML<br><br>description")
    }

}