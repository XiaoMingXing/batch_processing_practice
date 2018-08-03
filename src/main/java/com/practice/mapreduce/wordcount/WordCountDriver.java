package com.practice.mapreduce.wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class WordCountDriver {

    public static void main(String... args) throws IOException,
            ClassNotFoundException, InterruptedException {

        if (args.length < 2) {
            throw new IllegalArgumentException("Wrong arguments, at least two");
        }

        Job job = getJob(args);

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

    public static Job getJob(String[] args) throws IOException {
        System.out.println("Implement here");
        return null;
    }
}
