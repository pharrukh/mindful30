package com.normuradov.mindful30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.normuradov.mindful30.model.DailyRecommendation
import com.normuradov.mindful30.ui.theme.Mindful30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                Mindful30Theme {
                    Grid()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Grid(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = "Mindful30",
                    style = MaterialTheme.typography.displayLarge,
                )
            }

        }
    ) { padding ->
        val recommendations = Repository.dailyRecommendations
        LazyColumn(
            modifier = modifier
                .padding(padding)
        ) {
            items(count = recommendations.size,
                key = { recommendations[it].dayNumber },
                itemContent = { index ->
                    GridItem(recommendation = recommendations[index])

                }
            )
        }
    }
}

@Composable
fun GridItem(recommendation: DailyRecommendation, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Box {
                Image(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clickable(onClick = { expanded = !expanded }),
                    painter = painterResource(id = recommendation.imageId),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,

                    )
                Column {
                    Text(
                        text = "Day ${recommendation.dayNumber}",
                        modifier = Modifier
                            .padding(10.dp),
                        style = MaterialTheme.typography.displayLarge,
                        color = Color.White,
                    )
                }
            }
            if (!expanded) {
                Text(text = recommendation.teaser, modifier = Modifier.padding(16.dp))
            } else {
                Text(
                    modifier = modifier.padding(16.dp),
                    text = recommendation.description,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreviewLight() {
    Mindful30Theme(useDarkTheme = false) {
        Grid()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewDark() {
    Mindful30Theme(useDarkTheme = true) {
        Grid()
    }
}