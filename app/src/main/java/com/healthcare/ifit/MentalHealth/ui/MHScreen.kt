package com.healthcare.ifit.MentalHealth.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.healthcare.ifit.R
import com.healthcare.ifit.ui.theme.IFITTheme

@Composable

fun MentalScreen(
    onMeditation: () -> Unit,
    onSleep: () -> Unit,
) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .height(80.dp),
                backgroundColor = MaterialTheme.colors.background
            ) { ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = "Home",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.workout),
                        contentDescription = "Workout",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.medition),
                        contentDescription = "Meditation",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "Profile",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
        }
    ) {
        it
        MHScreenUi ()
    }
}

@Composable
fun MHScreenUi () {
    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .verticalScroll(state),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Text(
            text = "Good Afternoon",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.W500,
            textAlign = TextAlign.Start
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, top = 16.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
            ) {
                Text(
                    text = "How was your day?",
                    style = MaterialTheme.typography.h4,
                    fontWeight = FontWeight.W400,
                    textAlign = TextAlign.Start
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.happy),
                        contentDescription = "happy",
                        tint = Color.Yellow,
                        modifier = Modifier.size(48.dp)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.satisfied),
                        contentDescription = "satisfied",
                        tint = Color.Yellow,
                        modifier = Modifier.size(48.dp)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.neutral),
                        contentDescription = "neutral",
                        tint = Color.Yellow,
                        modifier = Modifier.size(48.dp)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.dissatisfied),
                        contentDescription = "dissatisfied",
                        tint = Color.Yellow,
                        modifier = Modifier.size(48.dp)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.sad),
                        contentDescription = "sad",
                        tint = Color.Yellow,
                        modifier = Modifier.size(48.dp)
                    )

                }
            }
            
        }

        Card(
            modifier = Modifier
                .height(104.dp)
                .aspectRatio(2.8f, true)
                .align(Alignment.Start)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Card(
                    backgroundColor = MaterialTheme.colors.primary,
                 //   modifier = Modifier.size(120.dp)
                ) {
                    Icon(
                        painterResource(id = R.drawable.medition) ,
                        contentDescription = "meditation",
                    )
                }
                Text(text = "Meditation", style = MaterialTheme.typography.h4)
            }
        }

        Card(
            modifier = Modifier
                .height(104.dp)
                .aspectRatio(2.8f, true)
                .align(Alignment.Start)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Card(
                    backgroundColor = MaterialTheme.colors.secondary
                ) {
                    Icon(
                        painterResource(id = R.drawable.sleeping),
                        contentDescription = "sleep",
                    )
                }
                Text(text = "Sleep", style = MaterialTheme.typography.h4)
            }
        }

        Card() {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Today's Quote :",
                    style = MaterialTheme.typography.h4
                )
                Text(
                    text = stringResource(R.string.quote1),
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Justify
                )
            }
        }
        
    }
}

@Preview (showBackground = false)
@Composable
fun MentalScreenPreview() {
    IFITTheme() {
        MentalScreen(onMeditation = {}, onSleep = {})
    }
}