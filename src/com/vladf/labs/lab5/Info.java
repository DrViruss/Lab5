package com.vladf.labs.lab5;

import java.util.ArrayList;

public class Info {
    public Info(ArrayList<Launch> launches, float total, float offset, float count) {
        this.launches = launches;
        this.total = total;
        this.offset = offset;
        this.count = count;
    }

    ArrayList< Launch > launches = new ArrayList < Launch > ();
        private float total;
        private float offset;
        private float count;


        // Getter Methods

        public float getTotal() {
            return total;
        }

        public float getOffset() {
            return offset;
        }

        public float getCount() {
            return count;
        }

}
