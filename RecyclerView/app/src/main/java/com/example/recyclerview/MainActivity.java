package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final String[] movieNames = new String[]{"The Fast and the Furious", "2 Fast 2 Furious", "The Fast and the Furious: Tokyo Drift", "Fast & Furious", "Fast Five", "Fast & Furious 6", "Furious 7", "The Fate of the Furious"};
    private final String[] movieDescriptions = new String[]{
            "The first installment in the series follows Brian O'Conner (Paul Walker), an undercover cop, who is tasked with discovering the identities of a group of unknown automobile hijackers led by Dominic Toretto (Vin Diesel).",
            "Brian O'Conner and Roman Pearce (Tyrese Gibson) team up to go undercover for the U.S. Customs Service to bring down drug lord Carter Verone (Cole Hauser) in exchange for the erasure of their criminal records.",
            "High school car enthusiast Sean Boswell (Lucas Black) is sent to live in Tokyo with his father, and finds solace in the city's drifting community. Although this is the third film released in the franchise, it has been retroactively placed as the sixth, with the subsequent three installments being set between 2 Fast 2 Furious and Tokyo Drift.",
            "Federal Bureau of Investigation (FBI) agent Brian O'Conner and Dominic Toretto are forced to work together to avenge the murder of Toretto's lover Letty Ortiz (Michelle Rodriguez) and apprehend drug lord Arturo Braga (John Ortiz). The film is set five years after the events of The Fast and the Furious, and before Tokyo Drift.",
            "Dominic Toretto, Brian O'Conner and Mia Toretto (Jordana Brewster) plan a heist to steal $100 million from corrupt businessman Hernan Reyes (Joaquim de Almeida) while being pursued for arrest by U.S. Diplomatic Security Service (DSS) agent Luke Hobbs (Dwayne Johnson).",
            "Dominic Toretto, Brian O'Conner and their team are offered amnesty for their crimes by Luke Hobbs, in exchange for helping him take down a skilled mercenary organization led by Owen Shaw (Luke Evans), one member of which is Toretto's former lover Letty Ortiz. It is the last film to be set before Tokyo Drift.",
            "Deckard Shaw (Jason Statham), a rogue special forces assassin seeking to avenge his comatose younger brother Owen, puts the team of Dominic Toretto and Brian O'Conner in danger once again.",
            "Cyberterrorist Cipher (Charlize Theron) coerces Dom into working for her and turns him against his team, forcing them to find Dominic and take down Cipher."
    };
    private RecyclerView myRecycler;
    private RecyclerViewAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView Rv = findViewById(R.id.recyclerview);
        Rv.setAdapter(new RecyclerViewAdapter(this,movieNames,movieDescriptions));
        Rv.setLayoutManager(new LinearLayoutManager(this));
    }
}