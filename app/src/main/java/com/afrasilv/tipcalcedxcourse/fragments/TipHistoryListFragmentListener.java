package com.afrasilv.tipcalcedxcourse.fragments;

import com.afrasilv.tipcalcedxcourse.models.TipRecord;

/**
 * Created by alex on 20/06/16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
