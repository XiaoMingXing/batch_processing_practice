package com.practice.mapreduce.topN;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.TreeMap;

public class TopNReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    private TreeMap<Integer, String> resultMap = new TreeMap<>();
    private int topN = 5;

    @Override
    public void setup(Context context) {
        this.topN = context.getConfiguration().getInt("top.n", 5);
    }

    @Override
    public void reduce(Text key, Iterable<IntWritable> values, Context context) {
        System.out.println("Implement here");
    }

    @Override
    public void cleanup(Context context) throws IOException, InterruptedException {
        System.out.println("Implement here");
    }
}
