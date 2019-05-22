package com.example.android.ftp_tiniwindow_sign1;

import android.provider.BaseColumns;

public class SignDataContract {



    public static final class SignData implements BaseColumns {
        public static final String TABLE_NAME = "signData";
        public static final String COLUMN_SEASON= "season";
        public static final String COLUMN_TEXT_DATA = "textData";
        public static final String COLUMN_LINE_LENGTH= "lineLength";
        public static final String COLUMN_LINE_COUNT= "lineCount";
        public static final String COLUMN_SPEED= "speed";
    }
}
