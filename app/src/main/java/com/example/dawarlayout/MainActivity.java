package com.example.dawarlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    FrameLayout frameLayout;
    NavigationView navigationView;

    ImageView imageView;
    TextView tittle;



    View hedarview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.dowewLayout);
        materialToolbar=findViewById(R.id.toolbar);
        frameLayout=findViewById(R.id.fremlayout);
        navigationView=findViewById(R.id.navigationview);

        //xml layout or data exces korar jone

        hedarview=navigationView.getHeaderView(0);

        tittle=hedarview.findViewById(R.id.tittle);

        imageView =hedarview.findViewById(R.id.imageView);
















        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(
               MainActivity.this,drawerLayout,materialToolbar,R.string.drawer_close,R.string.drawer_open);


       drawerLayout.addDrawerListener(toggle);

       // upore item  ar jonne


       materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem item) {


               if (item.getItemId()==R.id.hand){
                   Toast.makeText(MainActivity.this, "i am home ", Toast.LENGTH_SHORT).show();



               }





               return false;
           }
       });














       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               item.getItemId();

               if (item.getItemId()==R.id.Home){




               } else if (item.getItemId()==R.id.profile) {
                   Toast.makeText(MainActivity.this, "i am home ", Toast.LENGTH_SHORT).show();

                   drawerLayout.closeDrawer(GravityCompat.START);


                   FragmentManager fragmentManager=getSupportFragmentManager();
                   FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
              fragmentTransaction.add(R.id.fremlayout,new BlankFragment());
              fragmentTransaction.commit();




               } else if (item.getItemId()==R.id.notification) {

                   Toast.makeText(MainActivity.this, "i am not", Toast.LENGTH_SHORT).show();

               } else if (item.getItemId()==R.id.seting) {

                   Toast.makeText(MainActivity.this, "i am sating ", Toast.LENGTH_SHORT).show();

               }


               return true;
           }
       });






    }


    // on creat ends











}