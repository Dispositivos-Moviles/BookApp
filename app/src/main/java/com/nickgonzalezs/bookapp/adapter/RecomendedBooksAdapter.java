package com.nickgonzalezs.bookapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nickgonzalezs.bookapp.R;
import com.nickgonzalezs.bookapp.model.Book;

import java.util.ArrayList;

public class RecomendedBooksAdapter extends RecyclerView.Adapter<RecomendedBooksAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Book> books;

    public RecomendedBooksAdapter(Context context, ArrayList<Book> books) {
        this.context = context;
        this.books = books;
    }

    public RecomendedBooksAdapter(Context context) {
        this.context = context;
        books = new ArrayList<>();

        books.add(new Book("1", "harry", R.drawable.harry));
        books.add(new Book("2", "harry", R.drawable.harry));
        books.add(new Book("3", "harry", R.drawable.harry));
        books.add(new Book("4", "harry", R.drawable.harry));
        books.add(new Book("5", "harry", R.drawable.harry));
        books.add(new Book("6", "harry", R.drawable.harry));
        books.add(new Book("7", "harry", R.drawable.harry));
        books.add(new Book("8", "harry", R.drawable.harry));
        books.add(new Book("9", "harry", R.drawable.harry));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return books != null ? books.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
