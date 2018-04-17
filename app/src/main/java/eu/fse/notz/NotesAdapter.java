package eu.fse.notz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amministratore on 12/04/2018.
 */

public class NotesAdapter extends RecyclerView.Adapter {

    private ArrayList<Note> mDataset;


    public static class ViewHolder extends RecyclerView.ViewHolder {



        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public NotesAdapter(String[] myDataset){
        mDataset = myDataset;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_note, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        NotesAdapter.ViewHolder noteVH = (NotesAdapter.ViewHolder) holder;
        Note currentNote = mDataset.get(position);
        noteVH.mTextView.setText(currentNote.getTitle());
    }




    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}