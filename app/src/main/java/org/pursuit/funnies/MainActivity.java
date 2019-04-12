package org.pursuit.funnies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.pursuit.funnies.themes.chucknorris.ChuckNorrisRecyclerViewFragment;
import org.pursuit.funnies.themes.dadjokes.DadJokesRecyclerViewFragment;
import org.pursuit.funnies.themes.dadjokes.models.Joke;
import org.pursuit.funnies.themes.dadjokes.network.DadJokesService;
import org.pursuit.funnies.themes.dadjokes.network.DadJokesSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "MainActivity";
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Retrofit retrofit = DadJokesSingleton.getInstance();

        DadJokesService dadJokesService = retrofit.create(DadJokesService.class);
        final Call<Joke> jokeCall = dadJokesService.getJoke();
        jokeCall.enqueue(new Callback<Joke>() {
            @Override
            public void onResponse(Call<Joke> call, Response<Joke> response) {
                Log.d(TAG, "onResponse: " + response.body().getJoke());


            }

            @Override
            public void onFailure(Call<Joke> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_github:
                Intent gitHub = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/LJmnz27/Funnies"));
                startActivity(gitHub);
                return true;
            case R.id.linkedIn:
                Intent linkedIn = new Intent("android.intent.action.VIEW", Uri.parse("https://www.linkedin.com/in/ljmnz27/"));
                startActivity(linkedIn);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        int id = item.getItemId();
        Log.d(TAG, "onNavigationItemSelected: ID = " + id);
        switch (id) {
            case R.id.nav_chuck_norris:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, new ChuckNorrisRecyclerViewFragment())
                        .commit();
                break;
            case R.id.nav_dad_jokes:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container, new DadJokesRecyclerViewFragment())
                        .commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}