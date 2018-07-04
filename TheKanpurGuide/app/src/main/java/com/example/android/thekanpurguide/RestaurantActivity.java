package com.example.android.thekanpurguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class RestaurantActivity extends AppCompatActivity {


    private static int mrestaurantToDisplay = 0;

    public static void setRestaurantToDisplay(int restaurantToDisplay) {
        mrestaurantToDisplay = restaurantToDisplay;
    }

    public static int getRestaurantToDisplay() {
        return mrestaurantToDisplay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.restaurant);

        Restaurant restaurants[] = new Restaurant[11];

        restaurants[0] = new Restaurant("McDonald\'s", "Burger, Fast Food",
                "3rd floor, Z Square Mall, The Mall, Kanpur", "+91 9919990591"
        , "Rs. 450 for two people(approx.)", "Opens from 11 AM to 11 PM", R.drawable.food_mcdonalds, 3.6f);


        restaurants[1] = new Restaurant("KFC", "Burger, Fast Food",
                "3rd floor, Z Square Mall, The Mall, Kanpur", "0512 33994444"
                , "Rs. 400 for two people(approx.)", "Opens from 11 AM to 11 PM", R.drawable.food_kfc, 4.0f);


        restaurants[2] = new Restaurant("Subway", "Healthy Food, Salad, Fast Food",
                "113/121A Nadri Corner, Moti Jheel, Swaroop Nagar, Kanpur", "0512 2540107"
                , "Rs. 500 for two people(approx.)", "Opens from 11 AM to 11 PM", R.drawable.food_subway, 3.5f);


        restaurants[3] = new Restaurant("Barbeque Nation", "North Indian, Mughlai, Lebanese, Arabian",
                "3rd floor, Z Square Mall, The Mall, Kanpur", "+91 9129888226"
                , "Rs. 1400 for two people(approx.)", "Opens from 12 noon to 11 PM", R.drawable.food_barbequenation, 4.3f);


        restaurants[4] = new Restaurant("Domino's Pizza", "Pizza, Fast Food",
                "Food Court, Rave Moti, Kakadeo, Kanpur", "0512 2503260"
                , "Rs. 700 for two people(approx.)", "Opens from 11 AM to 11 PM", R.drawable.food_dominoespizza, 3.5f);


        restaurants[5] = new Restaurant("Chung Fa", "Casual Dining, Chinese",
                "94-B, Mall Road Chauraha, The Mall, Kanpur", "0512 2304387"
                , "Rs. 700 for two people(approx.)", "Opens from 12 noon to 11 PM", R.drawable.food_chungfa, 3.6f);


        restaurants[6] = new Restaurant("Baba Biryani", "Indian, Asian, Halal",
                "3rd floor,Food Court, Z Square Mall, The Mall, Kanpur", "+91 9621002121"
                , "Rs. 500 for two people(approx.)", "Opens from 12 noon to 10:30 PM", R.drawable.food_bababiryani, 4.0f);


        restaurants[7] = new Restaurant("Little Chef", "Casual Dining, North Indian, Fast Food",
                "15/198- A, Civil Lines, The Mall, Kanpur", "0512 3015333"
                , "Rs. 1000 for two people(approx.)", "Opens from 11 AM to 11 PM", R.drawable.food_thelittlechef, 4.2f);


        restaurants[8] = new Restaurant("Cawnpore 1857", "Fine Dining, North Indian",
                "The Landmark Hotel, Landmark Towers, The Mall, Kanpur", "0512 2305305"
                , "Rs. 2200 for two people(approx.)", "Opens from 7:30 PM to 11:30 PM", R.drawable.food_cawnpore1857, 3.6f);


        restaurants[9] = new Restaurant("Waterside", "Fine Dining, North Indian, Chinese",
                "The Landmark Hotel, Landmark Towers, The Mall, Kanpur", "0512 2305305"
                , "Rs. 3000 for two people(approx.)", "Opens from 7:00 AM to 11:30 PM", R.drawable.food_waterside, 4.0f);


        restaurants[10] = new Restaurant("Terrazza 9", "Fine Dining, Mughlai, Continental, North Indian",
                "Rave 3, PLot 11, Block 6 Parwati Bangla Road, Tilak Nagar, Kanpur", "0512 2555050"
                , "Rs. 1500 for two people(approx.)", "Opens from 6 PM to 11 PM", R.drawable.food_terrazza, 3.7f);


        ((TextView)findViewById(R.id.restaurant_name)).setText(restaurants[getRestaurantToDisplay()].getNames());

        ((TextView)findViewById(R.id.restaurant_cuizine)).setText(restaurants[getRestaurantToDisplay()].getCuizine());

        ((TextView)findViewById(R.id.restaurant_location)).setText(restaurants[getRestaurantToDisplay()].getAddress());

        ((TextView)findViewById(R.id.restaurant_phone)).setText(restaurants[getRestaurantToDisplay()].getPhones());

        ((TextView)findViewById(R.id.restaurant_price)).setText(restaurants[getRestaurantToDisplay()].getPrice());

        ((TextView)findViewById(R.id.restaurant_openhours)).setText(restaurants[getRestaurantToDisplay()].getOpenHours());

        ((ImageView)findViewById(R.id.restaurant_wallpaper)).setImageResource(restaurants[getRestaurantToDisplay()].getImageId());

        ((RatingBar)findViewById(R.id.restaurant_rating)).setRating(restaurants[getRestaurantToDisplay()].getRating());

    }
}
