package com.practice.mapreduce.topN;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.TreeMap;

public class TopNMapper extends
        Mapper<Text, Text, Text, IntWritable> {

    private final TreeMap<Integer, String> resultMap = new TreeMap<>();

    private int top_n;

    @Override
    public void setup(Context context) {
        this.top_n = context.getConfiguration().getInt("top.n", 5);
    }


    @Override
    public void map(Text key, Text value, Context context) {
        System.out.println("Implement here");
    }


    @Override
    public void cleanup(Context context) throws IOException, InterruptedException {
        System.out.println("Implement here");
    }
}
