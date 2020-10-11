package com.example.recyclerview;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.recyclerview.dummy.FilmContent;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.dummy.FilmContent;

/**
 * A fragment representing a single FilmTitle detail screen.
 * This fragment is either contained in a {@link FilmTitleListActivity}
 * in two-pane mode (on tablets) or a {@link FilmTitleDetailActivity}
 * on handsets.
 */
public class FilmTitleDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private FilmContent.FilmItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public FilmTitleDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = FilmContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.title);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.filmtitle_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            String content = "Main Characters:\n";
            for (String s: mItem.characters) {
                content += "\t\t\t\t" + s + "\n";
            }
            ((TextView) rootView.findViewById(R.id.filmtitle_detail)).setText(content);
            ((TextView) rootView.findViewById(R.id.filmtitle_detail)).setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(mItem.cover_id),null,null);
        }

        return rootView;
    }
}