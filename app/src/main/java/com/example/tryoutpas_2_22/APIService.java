package com.example.tryoutpas_2_22;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface APIService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getPremierLeagueTeams();

    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse> getSpanishLeagueTeams();

    @GET("all_countries.php")
    Call<TeamResponse> getAllCountries();
}
