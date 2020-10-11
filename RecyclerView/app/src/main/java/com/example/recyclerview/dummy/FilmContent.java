package com.example.recyclerview.dummy;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmContent {
    // Old content
    private static String[] movieNames = new String[]{"The Fast and the Furious", "2 Fast 2 Furious", "The Fast and the Furious: Tokyo Drift", "Fast & Furious", "Fast Five", "Fast & Furious 6", "Furious 7", "The Fate of the Furious"};
    private static String[] movieDescriptions = new String[]{
            "The first installment in the series follows Brian O'Conner (Paul Walker), an undercover cop, who is tasked with discovering the identities of a group of unknown automobile hijackers led by Dominic Toretto (Vin Diesel).",
            "Brian O'Conner and Roman Pearce (Tyrese Gibson) team up to go undercover for the U.S. Customs Service to bring down drug lord Carter Verone (Cole Hauser) in exchange for the erasure of their criminal records.",
            "High school car enthusiast Sean Boswell (Lucas Black) is sent to live in Tokyo with his father, and finds solace in the city's drifting community. Although this is the third film released in the franchise, it has been retroactively placed as the sixth, with the subsequent three installments being set between 2 Fast 2 Furious and Tokyo Drift.",
            "Federal Bureau of Investigation (FBI) agent Brian O'Conner and Dominic Toretto are forced to work together to avenge the murder of Toretto's lover Letty Ortiz (Michelle Rodriguez) and apprehend drug lord Arturo Braga (John Ortiz). The film is set five years after the events of The Fast and the Furious, and before Tokyo Drift.",
            "Dominic Toretto, Brian O'Conner and Mia Toretto (Jordana Brewster) plan a heist to steal $100 million from corrupt businessman Hernan Reyes (Joaquim de Almeida) while being pursued for arrest by U.S. Diplomatic Security Service (DSS) agent Luke Hobbs (Dwayne Johnson).",
            "Dominic Toretto, Brian O'Conner and their team are offered amnesty for their crimes by Luke Hobbs, in exchange for helping him take down a skilled mercenary organization led by Owen Shaw (Luke Evans), one member of which is Toretto's former lover Letty Ortiz. It is the last film to be set before Tokyo Drift.",
            "Deckard Shaw (Jason Statham), a rogue special forces assassin seeking to avenge his comatose younger brother Owen, puts the team of Dominic Toretto and Brian O'Conner in danger once again.",
            "Cyberterrorist Cipher (Charlize Theron) coerces Dom into working for her and turns him against his team, forcing them to find Dominic and take down Cipher."
    };
    private static Integer[] covers = new Integer[]{R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,R.drawable.f7,R.drawable.f8};
    private static String[][] mainCharacters = new String[][]{
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Vince"},
            {"Brian O'Connor", "Roman Pearce", "Tej Parker"},
            {"Sean Boswell", "Han Seoul-Oh"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Han Seoul-Oh", "Gisele Yashar"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Han Seoul-Oh", "Gisele Yashar", "Roman Pearce", "Tej Parker", "Luke Hobbs", "Vince"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Han Seoul-Oh", "Gisele Yashar", "Roman Pearce", "Tej Parker", "Luke Hobbs"},
            {"Dominic Toretto", "Brian O'Connor", "Letty Ortiz", "Mia Toretto", "Roman Pearce", "Tej Parker", "Luke Hobbs"},
            {"Dominic Toretto", "Letty Ortiz", "Roman Pearce", "Tej Parker", "Luke Hobbs"}
    };

    /**
     * An array of sample (film) items.
     */
    public static final List<FilmItem> ITEMS = new ArrayList<FilmItem>();

    /**
     * A map of sample (film) items, by ID.
     */
    public static final Map<String, FilmItem> ITEM_MAP = new HashMap<String, FilmItem>();

    private static final int COUNT = 25;

    static {
//        addItem(new FilmItem("1", "title", new String[]{"char1", "char2"}));
        for (int i = 0; i < movieNames.length; i++) {
            addItem(new FilmItem(Integer.toString(i+1), movieNames[i], mainCharacters[i], movieDescriptions[i], covers[i]));
        }
    }

    private static void addItem(FilmItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * An item representing a piece of content.
     */
    public static class FilmItem {
        public final String id;
        public final String title;
        public final String[] characters;
        public final String description;
        public final Integer cover_id;

        public FilmItem(String id, String title, String[] characters, String description, Integer cover_id) {
            this.id = id;
            this.title = title;
            this.characters = characters;
            this.description = description;
            this.cover_id = cover_id;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}