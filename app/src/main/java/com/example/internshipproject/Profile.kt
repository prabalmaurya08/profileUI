package com.example.internshipproject
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight

import androidx.compose.material.icons.filled.Build

import androidx.compose.material.icons.outlined.Edit

import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showSystemUi = true)
@Composable
fun Profile(){
    val scrollState= rememberScrollState()


    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Surface(
            color = MaterialTheme.colorScheme.surface, // Light or dark depending on theme
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {


                Topbar()
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.boy),
                            contentDescription = "",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier.size(60.dp).clip(CircleShape)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Prabal Maurya",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Member Since Mar, 2025",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Gray
                            )


                        }

                    }
                    Box(
                        modifier = Modifier.size(48.dp).clip(CircleShape)
                            .border(1.dp, MaterialTheme.colorScheme.outline, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Edit,
                            contentDescription = "",
                            modifier = Modifier.size(32.dp)
                        )
                    }


                }
                Spacer(modifier = Modifier.height(12.dp))
                Surface(color = Color.Black) {
                    Box(
                        modifier = Modifier.fillMaxWidth().clip(RectangleShape)
                            .border(1.dp, Color.Gray, RectangleShape).padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Build,
                                contentDescription = "Build Icon",
                                modifier = Modifier.size(32.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Column(

                                modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "get to know your vehicle ,inside out")
                                Spacer(modifier = Modifier.height(8.dp))
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = "CRED Garage",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Image(
                                        painter = painterResource(id = R.drawable.right_arrow),
                                        contentDescription = "",
                                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                                        modifier = Modifier.size(32.dp)
                                    )
                                }

                            }
                        }
                    }

                }


                Spacer(modifier = Modifier.height(22.dp))
                Reuseable(
                    label = "Credit Score",
                    icon = painterResource(id = R.drawable.credit_score),
                    text = "757"
                )
                Spacer(modifier = Modifier.height(8.dp))
                HorizontalDivider(modifier = Modifier, thickness = 1.dp, Color.Gray)




                Reuseable(
                    label = "Lifetime Cashback",
                    icon = painterResource(id = R.drawable.ruppe),
                    text = "₹34"
                )
                Spacer(modifier = Modifier.height(8.dp))
                HorizontalDivider(modifier = Modifier, thickness = 1.dp, Color.Gray)


                Reuseable(
                    label = "Bank Balance",
                    icon = painterResource(id = R.drawable.forward),
                    text = "Check"
                )
            }
        }
                Spacer(modifier = Modifier.height(14.dp))
                Surface(
                    color = Color.Black, // You can also use custom shades
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {

                        Spacer(modifier = Modifier.height(28.dp))
                        Text(
                            text = "YOUR REWARDS & BENEFITS",
                            style = MaterialTheme.typography.titleSmall.copy(
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.Bold
                            ),
                                    color = Color.Gray
                        )




                        Spacer(modifier = Modifier.height(8.dp))
                        RewardCompose(label = "Cashback Balance", text = "2")
                        HorizontalDivider(modifier = Modifier, thickness = 1.dp, Color.Gray)


                        RewardCompose(label = "Coins", text = "28,292")
                        HorizontalDivider(modifier = Modifier, thickness = 1.dp, Color.Gray)


                        RewardCompose(label = "Win upto Rs 1000", text = "refer and earn")
                        Spacer(modifier = Modifier.height(28.dp))
                        Text(text = "TRANSACTION & SUPPORT ",
                            style = MaterialTheme.typography.titleSmall.copy(
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.Bold
                            ),
                            color = Color.Gray)
                        TransCompose(label = "all transactions")
                    }


        }
    }
}
@Composable
fun Topbar(){
    Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 0.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween){
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id=R.drawable.arrow_left), contentDescription = "backButton", modifier = Modifier.size(48.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Profile")
        }

            Row ( modifier = Modifier.clip(CircleShape).border(1.dp,Color.Gray,CircleShape).padding(horizontal = 16.dp, vertical = 10.dp
                    ), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)){
                Image(painter = painterResource(id=R.drawable.message), contentDescription = "support",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),modifier = Modifier.size(16.dp))

                Text(text = "Support",color = Color.Gray,   style = MaterialTheme.typography.bodySmall,)

            }



    }
}

@Composable
fun TransCompose(
    label:String,

){
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Column {
            Text(text=label)


        }
        Row (verticalAlignment = Alignment.CenterVertically){
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, modifier = Modifier.size(32.dp), contentDescription = "")



        }




    }


}

@Composable
fun RewardCompose(
    label:String,
    text:String
){
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
       Column {
           Text(text=label)
           Spacer(modifier = Modifier.height(8.dp))
           Text(text=text,
               style = MaterialTheme.typography.bodySmall,
               color = Color.Gray)
       }
        Row (verticalAlignment = Alignment.CenterVertically){
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, modifier = Modifier.size(32.dp), contentDescription = "")



        }




    }


}


@Composable
fun Reuseable(
//    modifier: Modifier= Modifier,
    label:String,
    icon:Painter,
    text: String,
//    arrowIcon: Painter = painterResource(id = R.drawable.right_arrow)
//


){
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Row (verticalAlignment = Alignment.CenterVertically){
            Box(modifier= Modifier.size(24.dp).clip(CircleShape).border(1.dp,Color.Gray,CircleShape,), contentAlignment = Alignment.Center){
                Image(painter = icon, contentDescription = "", modifier = Modifier.size(18.dp)
                ,  colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface))
            }
            Spacer(modifier = Modifier.width(14.dp))
            Text(text=label)
        }
        Row (verticalAlignment = Alignment.CenterVertically){
            Text(text=text)
            Spacer(modifier = Modifier.width(14.dp))
            Image(painter = painterResource(id=R.drawable.right_arrow),
                modifier = Modifier.size(48.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                contentDescription = "")
        }




    }


}

