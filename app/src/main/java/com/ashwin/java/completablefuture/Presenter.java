package com.ashwin.java.completablefuture;

import android.content.Context;

import java.util.List;

public class Presenter implements Observer {
//    public static void main(String[] args) {
//        Presenter presenter = new Presenter(new Service());
//        presenter.setObserver();
//        presenter.loadWords();
//    }

    public Presenter() {
        System.out.println("Presenter()");
    }

    private Context mContext;
    private Service mService;

    public Presenter(Context context, Service service) {
        System.out.println("Presenter(service)");
        mContext = context;
        mService = service;
    }

    public void setObserver() {
        mService.setObserver(this);
    }

    public void loadWords() {
        mService.getWordsSyncAsync(mContext);
    }

    @Override
    public void onChange(List<String> words) {
        System.out.println("Presenter: onChange( " + words + " ) on thread: " + Thread.currentThread().getName());
    }

    public void onClose() {
        mService.setObserver(null);
        mService.close();
    }
}
