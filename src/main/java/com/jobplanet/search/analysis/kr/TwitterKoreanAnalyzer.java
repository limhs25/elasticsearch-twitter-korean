package com.jobplanet.search.analysis.kr;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.StopwordAnalyzerBase;

import java.io.Reader;

/**
 * Created by hosang on 2015. 11. 6..
 */
public class TwitterKoreanAnalyzer extends StopwordAnalyzerBase {

    @Override
    protected TokenStreamComponents createComponents(String s, Reader reader) {
        Tokenizer source = new TwitterKoreanTokenizer(reader);
        return new TokenStreamComponents((Tokenizer)source, new TwitterKoreanStopFilter(source));
    }
}
